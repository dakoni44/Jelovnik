package org.ftninformatika.jelovnik.model;

import java.util.List;

public class Jela {
    private int id;
    private String naziv;
    private int kategorijaId;
    private List<String> prilog;
    private double cena;

    public Jela() {
    }

    public Jela(int id, String naziv, int kategorijaId, List<String> prilog, double cena) {
        this.id = id;
        this.naziv = naziv;
        this.kategorijaId = kategorijaId;
        this.prilog = prilog;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKategorijaId() {
        return kategorijaId;
    }

    public void setKategorijaId(int kategorijaId) {
        this.kategorijaId = kategorijaId;
    }

    public List<String> getPrilog() {
        return prilog;
    }

    public void setPrilog(List<String> prilog) {
        this.prilog = prilog;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
