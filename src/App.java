public class App {
    public static void main(String[] args) throws Exception {
        

        Dipendente dipendente1 = new Dipendente();
        Docente docente1 = new Docente();
        Impiegato impiegato = new Impiegato();

        //oggetto di tipo docente ma con puntatore Dipendente (alcuni elementi non saranno accessibili, ma presenti in memoria)
        Dipendente dipendente2 = new Docente();

        Dipendente dipendente3 = new Impiegato();

        //tutti gli oggetti possono avere il puntatore Object, ma niente sarà accessibile
        Object oggetto1 = docente1;

        //sbagliati perchè non c'è relazione di ereditarietà tra le due classi
        /*
        Docente docente2 = new Dipendente();
        Docente docente3 = new Dipendente();
        Impiegato impiegato2 = new Docente();
        Impiegato impiegato3 = new Dipendente();
        */

        //casting illegale perchè dipendente NON ha tutti gli attributi/metodi di docente (un dipendente NON è anche un docente)
        Docente docente4 = (Docente)dipendente1;
        //casting illegale perchè dipendente NON ha tutti gli attributi/metodi di docente
        Impiegato impiegato4 = (Impiegato) dipendente1;

        //illegale """"""
        //ocente docente5 = (Docente) impiegato1;

        //illegale """"""
        //Impiegato impiegato5 = (Impiegato) docente1;

        //illegale """"""
        Docente docente6 = (Docente) dipendente3;

        //Illegale """"""
        Impiegato impiegato6 = (Impiegato) dipendente2;

        //Illegale perchè oggetto1 è un Docente (Docente != impiegato)
        Object oggetto2 = (Impiegato) oggetto1;

        //legale (cambio solo il puntatore) avrò nuovamente visibilità su tutto l'oggetto
        Docente docente7 = (Docente) dipendente2;

        //legale (cambio solo il puntatore) avrò nuovamente visibilità su tutto l'oggetto
        Impiegato impiegato7 = (Impiegato) dipendente3;

        //TEST UNO E DUE
        Due due = new Due();

        Uno uno = due;

        uno.show();
        due.show();

        System.out.println(uno.val);
        System.out.println(due.val);
        System.out.println(((Uno)due).val);
        due.superShow();
        

    }
}
