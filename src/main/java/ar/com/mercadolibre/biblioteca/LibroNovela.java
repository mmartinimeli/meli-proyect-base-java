package ar.com.mercadolibre.biblioteca;

public class LibroNovela extends Libro implements IAlquilable {
    @Override
    public boolean alquilar() {
        super.setAlquilado(true);
        return false;
    }

    @Override
    public boolean devolver() {
        super.setAlquilado(false);
        return false;
    }

    @Override
    public boolean estaAlquilado() {
        return super.getAlquilado();
    }
}
