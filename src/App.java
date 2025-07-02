import java.util.Set;

import controller.ContactoController;
import controller.Setsx;
import models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        Setsx sets = new Setsx();
        ContactoController contactoController = new ContactoController();   

        // Imprimir contactos por apellido y nombre
        System.out.println("Contactos ordenados por apellido - nombre:");
        Set<Contacto> porApellidoNombre = contactoController.getContactosPorApellidoNombre();
        for (Contacto c : porApellidoNombre) {
            System.out.println(c.getApellido() + " - " + c.getNombre());
        }
        System.out.println("----------------------------");

        // Imprimir contactos por apellido, nombre y teléfono
        System.out.println("Contactos ordenados por apellido - nombre - teléfono:");
        Set<Contacto> porApellidoNombreTelefono = contactoController.getContactosPorApellidoNombreTelefono();
        for (Contacto c : porApellidoNombreTelefono) {
            System.out.println(c.getApellido() + " - " + c.getNombre() + " - " + c.getTelefono());
        }
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
