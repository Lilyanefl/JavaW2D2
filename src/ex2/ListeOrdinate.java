package ex2;

import java.util.*;

public class ListeOrdinate {
    public static List<Integer> generaListOrdinata(int n){
        List<Integer> lista = new ArrayList<>();
        Random random   = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101)); //generazione numeri casuali

        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> duplicaEInverti(List<Integer> lista){
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> inversa = new ArrayList<>(lista);
        Collections.reverse(inversa);
        nuovaLista.addAll(inversa);
        return nuovaLista;
    }

    public static void posizioni(List<Integer> lista, boolean pari){
        System.out.println(pari ? "Ecco i valori in posizione pari" : "Ecco i valori in posizione dispari");
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0){
                System.out.println(lista.get(i) + " ");
            } else if(!pari && i % 2 != 0){
                System.out.println(lista.get(i)+ " ");  //?
            }

        }
    }
}
