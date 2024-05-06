import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Joao");
        minhaLista.add("Maria");
        minhaLista.add("Joana");
        minhaLista.add("Fernando");
        minhaLista.add("Zefinha");
        minhaLista.add("Severina");


        
        System.out.println("Elemento na posição 2: " + minhaLista.get(2)); 
        System.out.println("Elementos da lista:");
        for (String elemento : minhaLista) {
            System.out.println(elemento);
        }
        
        System.out.println("Tamanho da lista: " + minhaLista.size()); 
        minhaLista.remove("Maria");
        if (minhaLista.contains("Maria")) {
            System.out.println("Maria esta matriculada");
        
        } else {
            System.out.println("Maria nao esta matriculada.");
        }
    }
}
