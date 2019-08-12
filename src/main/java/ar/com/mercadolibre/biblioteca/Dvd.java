package ar.com.mercadolibre.biblioteca;

public class Dvd extends Libro implements IAlquilable {
    @Override
    public boolean alquilar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public boolean estaAlquilado() {
        return false;
    }
}
