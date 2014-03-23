package fr.meehome.mail.services;

import java.io.File;

public class Mail {

    private String expediteur;

    private String listDestinataires;

    private String objet;

    private String contenu;

    private File pieceJointe;

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getListDestinataires() {
        return listDestinataires;
    }

    public void setListDestinataires(String listDestinataire) {
        this.listDestinataires = listDestinataire;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public File getPieceJointe() {
        return pieceJointe;
    }

    public void setPieceJointe(File pieceJointe) {
        this.pieceJointe = pieceJointe;
    }
}
