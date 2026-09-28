package Ejercicio30_contenidosDigitales;

public class TransmisionEnVivo extends ContenidoDigital {
    private boolean enCurso;

    public TransmisionEnVivo(String titulo, boolean enCurso) {
        super(titulo, 0);
        this.enCurso = enCurso;
    }

    @Override
    public void reproducir() {
        if (!enCurso) {
            System.out.println("Transmisión \"" + titulo + "\": no se encuentra en curso, no se puede reproducir.");
            return;
        }
        System.out.println("Transmisión \"" + titulo + "\": conectando al streaming en vivo.");
    }
}
