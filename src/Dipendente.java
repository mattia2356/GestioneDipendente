public class Dipendente {
    private String nominativo;
    private String indirizzo;
    private char sesso;

    public Dipendente() {}

    public Dipendente(String nominativo, String indirizzo, char sesso) {
        setNominativo(nominativo);
        setIndirizzo(indirizzo);
        setSesso(sesso);
    }

    public Dipendente(Dipendente dipendente) {
        setNominativo(dipendente.getNominativo());
        setIndirizzo(dipendente.getIndirizzo());
        setSesso(dipendente.getSesso());
    }

    //getter & setter
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public char getSesso() {
        return sesso;
    }

    public String toString() {
        String s ="";
        s = "Nominativo: "+getNominativo()+" | Indirizzzo: "+getIndirizzo()+" | Sesso :"+getSesso();
        return s;
    }

    public boolean equals(Dipendente d) {
        return (getIndirizzo().equals(d.getIndirizzo()) && getNominativo().equals(d.getNominativo()) && getSesso() == d.getSesso());
    }

}
