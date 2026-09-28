package Ejercicio30_contenidosDigitales;

public class Pelicula extends ContenidoDigital {
    public Pelicula(String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
    }

    @Override
    public void reproducir() {
        System.out.println("Película \"" + titulo + "\" (" + duracionMinutos + " min): cargando buffer completo y reproduciendo.");
    }
}
