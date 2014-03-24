package fr.meehome.mail.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class Util {

    public static Properties mailProperties = init("fr/meehome/mail/services/configuration.properties");

    public static Properties sessionProperties = init("fr/meehome/mail/services/ssl.properties");

    private static final String username = getMailProperties("user.name");

    private static final String password = getMailProperties("user.password");

    public static String getMailProperties(String name) {
        return (String ) mailProperties.get(name);
    }

    public static String getSessionProperties(String name) {
        return (String ) sessionProperties.get(name);
    }

    /**
     * Recuperation de la session
     * 
     * @param props
     * @return
     */
    public static Session getSession() {
        Session session = Session.getDefaultInstance(sessionProperties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        return session;
    }

    /**
     * Charge un fichier de proprites
     */
    public static Properties init(String filename) {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = Util.class.getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }
}
