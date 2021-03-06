package LES1.P2;

import java.sql.Date;

public class Reiziger {

    private int id;
    private String voorletters;
    private String tussenvoegsels;
    private String achternaam;
    private java.sql.Date geboortedatum;

    public Reiziger(int id, String voorletters, String tussenvoegsels, String achternaam, Date geboortedatum) {
        this.id = id;
        this.voorletters = voorletters;
        this.tussenvoegsels = tussenvoegsels;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public String getTussenvoegsels() {
        return tussenvoegsels;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public java.sql.Date getGeboortedatum() {
        return geboortedatum;
    }

    @Override
    public String toString() {
        return "Reiziger: " + "id: " + id + ", voorletters: '" + voorletters + '\'' + ", tussenvoegsels: '" + tussenvoegsels + '\'' + ", achternaam: '" + achternaam + '\'' + ", geboortedatum: " + geboortedatum;
    }
}
