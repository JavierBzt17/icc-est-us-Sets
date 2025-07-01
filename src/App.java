import java.util.Set;

import controller.Setsx;

public class App {
    public static void main(String[] args) {
        Setsx sets = new Setsx();



        Set<String> hashSet = sets.construirHashSet();
        System.out.println("HashSet (no garantiza orden):");
        for (String palabra : hashSet) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------");



        Set<String> linkedHashSet = sets.construirLinkedHashSet();
        System.out.println("LinkedHashSet (mantiene orden de inserción):");
        for (String palabra : linkedHashSet) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------");



        Set<String> treeSet = sets.construirTreeSet();
        System.out.println("TreeSet (orden alfabético):");
        for (String palabra : treeSet) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------");



        Set<String> treeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("TreeSet con Comparardor (por Longitud de palabra):");
        for (String palabra : treeSetConComparador){
            System.out.println(palabra);
        }
        System.out.println("----------------------------");
        


        Set<String> treeSetConComparador2 = sets.construirTreeSetConComparador2();
        System.out.println("TreeSet con Comparardor (por Longitud de palabra):");
        for (String palabra : treeSetConComparador2){
            System.out.println(palabra);
        }
        System.out.println("----------------------------");
    }
}
