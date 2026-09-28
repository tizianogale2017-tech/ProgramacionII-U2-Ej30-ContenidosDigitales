package Ejercicio30_contenidosDigitales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContenidoDigital> catalogo = new ArrayList<>();
        catalogo.add(new Pelicula("El Secreto de sus Ojos", 129));
        catalogo.add(new EpisodioSerie("El Eternauta", 55, 1, 3));
        catalogo.add(new TransmisionEnVivo("Final del Mundial", true));
        catalogo.add(new TransmisionEnVivo("Concierto de mañana", false));

        for (ContenidoDigital c : catalogo) {
            c.reproducir();
        }
    }
}
