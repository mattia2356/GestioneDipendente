public class Impiegato extends Dipendente{
    private String ufficio;

    public Impiegato() {}

    public Impiegato(String nominativo, String indirizzo, char sesso, String ruolo, String disciplina, String ufficio) {
        super(nominativo, indirizzo, sesso);
        setUfficio(ufficio);
    }

    public Impiegato(Impiegato i) {
        setUfficio(i.getUfficio());
    }

    //getter & setter
    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    public String getUfficio() {
        return ufficio;
    }
}
