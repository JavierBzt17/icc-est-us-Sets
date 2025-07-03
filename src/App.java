import java.util.Set;

import controller.ContactoController;
import controller.Sets;
import controller.Ejercicios;
import models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        ContactoController contactoController = new ContactoController();   

        System.out.println("Contactos ordenados por apellido - nombre:");
        Set<Contacto> porApellidoNombre = contactoController.getContactosPorApellidoNombre();
        for (Contacto c : porApellidoNombre) {
            System.out.println(c.getApellido() + " - " + c.getNombre());
        }
        System.out.println("----------------------------");

        System.out.println("Contactos ordenados por apellido - nombre - teléfono:");
        Set<Contacto> porApellidoNombreTelefono = contactoController.getContactosPorApellidoNombreTelefono();
        for (Contacto c : porApellidoNombreTelefono) {
            System.out.println(c.getApellido() + " - " + c.getNombre() + " - " + c.getTelefono());
        }
        System.out.println("----------------------------");

        Ejercicios ejercicios = new Ejercicios();  

        System.out.println("Verificación de duplicados:");
        System.out.println("[1, 2, 3, 4, 5] => " + ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println("[1, 2, 3, 4, 5, 4, 3, 2, 45] => " + ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("----------------------------");

        System.out.println("Verificación de isogramas:");
        System.out.println("murcielago => " + ejercicios.esIsograma("murcielago"));
        System.out.println("camaleon => " + ejercicios.esIsograma("camaleon"));
        System.out.println("----------------------------");

        System.out.println("Conteo de palabras únicas en texto:");
        System.out.println("Cantidad de palabras únicas: " + ejercicios.contarPalabrasUnicas(ejercicios.texto));
        System.out.println("----------------------------");

        // Lo demás que ya estaba
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
        System.out.println("TreeSet con Comparador (por Longitud de palabra):");
        for (String palabra : treeSetConComparador){
            System.out.println(palabra);
        }
        System.out.println("----------------------------");

        Set<String> treeSetConComparador2 = sets.construirTreeSetConComparador2();
        System.out.println("TreeSet con Comparador 2 (por Longitud y orden inverso):");
        for (String palabra : treeSetConComparador2){
            System.out.println(palabra);
        }
        System.out.println("----------------------------");
    }
}
