package ar.com.mercadolibre.biblioteca;

import java.time.LocalDateTime;

public class Alquiler {

    private Libro libro;

    private String titulo;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;

    public Alquiler(String titulo){
        this.titulo = titulo;
        this.fechaAlquiler = LocalDateTime.now();
        this.fechaDevolucion = LocalDateTime.now().plusDays(7);
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getTitulo() {
        return titulo;
    }
}
