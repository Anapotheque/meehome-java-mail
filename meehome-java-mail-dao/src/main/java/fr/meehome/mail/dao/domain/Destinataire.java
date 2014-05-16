package fr.meehome.mail.dao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DESTINATAIRE")
public class Destinataire {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Id
    @GeneratedValue
    @Column(name = "MAIL")
    private String mail;

    @Id
    @GeneratedValue
    @Column(name = "NOM")
    private String nom;

    @Id
    @GeneratedValue
    @Column(name = "PRENOM")
    private String prenom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
