package ex3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;
    public RubricaTelefonica(){
        this.rubrica = new HashMap<>();
    }
    public void aggiungiContatto(String nome, String telefono){
        rubrica.put(nome, telefono);
        System.out.println("Ecco il contatto aggiunto: " + nome + "ed il numero di telefono " + telefono);
    }
    public void rimuoviContatto(String nome){
        if(rubrica.containsKey(nome)){
            rubrica.remove(nome);
            System.out.println("Contatto rimosso" + nome);
        }else {
            System.out.println("Contatto non trovato");
        }
    }
    public String trovaPersonaPerNumero(String telefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)){
                return  entry.getKey(); // ??????????
            }
        }
        return "Nessuna persona trovata con il seguente numero: " + telefono;
    }
    public String trovaNumeroPerNome(String nome){
        return  rubrica.getOrDefault(nome, "Nessun numero trovato con il seguente nome: " + nome);
    }
    public void stampaContatti(){
        if (rubrica.isEmpty()){
            System.out.println("La rubrica e vuota");
        }else{
            System.out.println("Contatti:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println(entry.getKey() + "numero: " + entry.getValue());
            }
        }
    }
}
