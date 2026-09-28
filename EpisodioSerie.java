package Ejercicio30_contenidosDigitales;

public class EpisodioSerie extends ContenidoDigital {
    private int temporada;
    private int episodio;

    public EpisodioSerie(String titulo, int duracionMinutos, int temporada, int episodio) {
        super(titulo, duracionMinutos);
        this.temporada = temporada;
        this.episodio = episodio;
    }

    @Override
    public void reproducir() {
        System.out.println("Serie \"" + titulo + "\" T" + temporada + "E" + episodio + " (" + duracionMinutos
                + " min): reproduciendo y precargando el siguiente episodio.");
    }
}
