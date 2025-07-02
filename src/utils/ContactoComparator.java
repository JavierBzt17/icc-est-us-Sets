package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    
    private boolean incluirTelefono;

    public ContactoComparator(boolean incluirTelefono) {
        this.incluirTelefono = incluirTelefono;
    }

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int cmpApellido = o1.getApellido().compareTo(o2.getApellido());
        if (cmpApellido != 0) return cmpApellido;

        int cmpNombre = o1.getNombre().compareTo(o2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        if (incluirTelefono) {
            return o1.getTelefono().compareTo(o2.getTelefono());
        }

        return 0; // si no se compara teléfono, y apellido y nombre son iguales
    }
}
