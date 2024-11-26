import ex2.ListeOrdinate;
import ex3.RubricaTelefonica;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static ex2.ListeOrdinate.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quante parole vuoi inserire?");
//        int n = scanner.nextInt();
//        scanner.nextLine(); // ?
//        Set<String> paroleUniche = new HashSet<>();
//        Set<String> paroleDuplicate = new HashSet<>();
//
//        System.out.println("Inserisci le parole da scrivere");
//        for (int i = 0; i < n; i++) {
//            String parola = scanner.nextLine();
//            if (!paroleUniche.add(parola)) {
//                paroleDuplicate.add(parola);
//            }
//
//        }
//        System.out.println("Parole duplicate " + paroleDuplicate);
//        System.out.println("Numero parole uniche " + paroleUniche.size());
//        System.out.println("Elenco parole uniche" + paroleUniche);
//
//        scanner.close();

//        int n = 100;
//        List<Integer> listaOrdinata = generaListOrdinata(n);
//        System.out.println("Lista ordinata: " + listaOrdinata);
//        List<Integer> listDuplicataEInversa = duplicaEInverti(listaOrdinata);
//        System.out.println("Lista ordinata ed invertita " + listDuplicataEInversa);
//
//        posizioni(listDuplicataEInversa, true);
//        posizioni(listDuplicataEInversa, false);
        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.aggiungiContatto("John Doe", "3187711345");
        rubrica.aggiungiContatto("Jane Doe", "3398751632");
        rubrica.stampaContatti();
        System.out.println("Numero di John Doe" + rubrica.trovaNumeroPerNome("John Doe"));
        System.out.println("Persona con il numero 3398751632 e " + rubrica.trovaPersonaPerNumero("3398751632"));
        rubrica.rimuoviContatto("Amber Redd");
        rubrica.stampaContatti();
    }
}