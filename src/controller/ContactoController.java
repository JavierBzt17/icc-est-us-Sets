package controller;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;

public class ContactoController {

    private Set<Contacto> contactosPorApellidoNombre;
    private Set<Contacto> contactosPorApellidoNombreTelefono;

    public ContactoController() {
        contactosPorApellidoNombre = new TreeSet<>(new ContactoComparator(false)); 
        contactosPorApellidoNombreTelefono = new TreeSet<>(new ContactoComparator(true)); 
        cargarContactos();
    }

    private void cargarContactos() {
        Contacto[] lista = {
            new Contacto("Pedro", "Lopez", "222222222"),
            new Contacto("Luis", "Perez", "111111111"),
            new Contacto("Pedro", "Gonzales", "123456789"),
            new Contacto("Ana", "Perez", "987654321"),
            new Contacto("Pedro", "Lopez", "123456789"),
            new Contacto("Pedro", "Lopez", "222222222")
        };

        for (Contacto c : lista) {
            contactosPorApellidoNombre.add(c);
            contactosPorApellidoNombreTelefono.add(c);
        }
    }

    public Set<Contacto> getContactosPorApellidoNombre() {
        return contactosPorApellidoNombre;
    }

    public Set<Contacto> getContactosPorApellidoNombreTelefono() {
        return contactosPorApellidoNombreTelefono;
    }
}
