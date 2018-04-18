/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Wykladowca extends Osoba{
    public Wykladowca (String imie, String nazwisko, int rokUrodzenia, String plec){
        super (imie, nazwisko, rokUrodzenia, plec);
    }
   public String tytul;
    public String przedmioty;
    public int nrPokoju;
    public int wynagrodzenie;

    public Wykladowca(String tytul, String przedmioty, int nrPokoju, int wynagrodzenie, String imie, String nazwisko, int rokUrodzenia, String plec) {
        super(imie, nazwisko, rokUrodzenia, plec);
        this.tytul = tytul;
        this.przedmioty = przedmioty;
        this.nrPokoju = nrPokoju;
        this.wynagrodzenie = wynagrodzenie;
    }


   

    public String getTytul() {
        return tytul;
    }

    public String getPrzedmioty() {
        return przedmioty;
    }

    public int getNrPokoju() {
        return nrPokoju;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setPrzedmioty(String przedmioty) {
        this.przedmioty = przedmioty;
    }

    public void setNrPokoju(int nrPokoju) {
        this.nrPokoju = nrPokoju;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

 
    
}
