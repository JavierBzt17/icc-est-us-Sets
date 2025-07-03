package controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    // Cambiado a public para que sea accesible desde App.java
    public String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
            """;

    public Ejercicios(){
        System.out.println("EJercicio 1");
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));

        System.out.println("Ejercicio 2");
        System.out.println("Murcielago es isograma: " + esIsograma("murcielago"));
        System.out.println("Camaleon es isograma: " + esIsograma("camaleon"));

        System.out.println("Ejercicio 3");
        System.out.println("Numero de palabras unicas: " + contarPalabrasUnicas(texto));
    }

    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> set = new HashSet<>();
        for (int num : numeros){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        String palabraNormalizada = palabra.toLowerCase();
        Set<Character> caracteresVistos = new HashSet<>();

        for (char caracter : palabraNormalizada.toCharArray()) {
            if (Character.isLetter(caracter)) {
                if (caracteresVistos.contains(caracter)) {
                    return false;
                }
                caracteresVistos.add(caracter);
            }
        }

        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }

        String fraseNormalizada = frase.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
        String[] palabras = fraseNormalizada.split("\\s+");
        Set<String> palabrasUnicas = new HashSet<>(Arrays.asList(palabras));

        return palabrasUnicas.size();
    }
}
