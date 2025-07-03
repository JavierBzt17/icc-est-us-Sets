package controller;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); 
        palabras.add("Pera");  
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        return palabras;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparador = new Comparator<String>(){

            @Override
            public int compare(String s1, String s2) {
                // Compara por longitud 
                int result = Integer.compare(s1.length(), s2.length());
                //Si tienen la misma longitud, compara alfabéticamente
                if (result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };
        
        Set<String> miTreeSet = new TreeSet<>(comparador);

        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador2() {
        Comparator<String> comparador = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                // Compara por longitud 
                int result = Integer.compare(s2.length(), s1.length());
                if (result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparador);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }
}
