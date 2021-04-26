public class Docente extends Dipendente {
    private String ruolo;
    private String disciplina;

    public Docente() {}

    public Docente(String nominativo, String indirizzo, char sesso, String ruolo, String disciplina) {
        super(nominativo, indirizzo, sesso);
        setRuolo(ruolo);
        setDisciplina(disciplina);
    }

    public Docente(Docente docente) {
        setRuolo(docente.getRuolo());
        setDisciplina(docente.getDisciplina());
    }

    //getter & setter
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}

