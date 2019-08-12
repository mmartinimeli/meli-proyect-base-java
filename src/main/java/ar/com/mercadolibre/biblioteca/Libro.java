package ar.com.mercadolibre.biblioteca;

public abstract class Libro {
    private String titulo;
    private String editorial;
    private boolean alquilado;

    public String getTitulo() {
        return titulo;
    }

    public void setAlquilado(boolean estado){
        this.alquilado = estado;
    }

    public boolean getAlquilado() {
        return alquilado;
    }
}
