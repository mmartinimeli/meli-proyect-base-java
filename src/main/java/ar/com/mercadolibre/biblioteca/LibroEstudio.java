package ar.com.mercadolibre.biblioteca;

public class LibroEstudio extends Libro implements IAlquilable{
    //TODO aca falta todo el tema de las fechas
    @Override
    public boolean alquilar() {

        super.setAlquilado(true);
        return false;
    }

    //TODO same shit here
    @Override
    public boolean devolver() {
        super.setAlquilado(false);
        return false;
    }

    @Override
    public boolean estaAlquilado() {
        return false;
    }
}
