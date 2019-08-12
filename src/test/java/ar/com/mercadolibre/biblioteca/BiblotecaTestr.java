package ar.com.mercadolibre.biblioteca;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BiblotecaTestr {

    @Test
    public void alquilar(){
        LibroEstudio libroEstudio = new LibroEstudio();

        boolean estaAlquiladoInicial = libroEstudio.getAlquilado();
        Assertions.assertThat(estaAlquiladoInicial).isFalse();

        libroEstudio.alquilar();
        boolean estaAlquilado = libroEstudio.getAlquilado();
        Assertions.assertThat(estaAlquilado).isTrue();
    }

    @Test
    public void devolver(){
        LibroEstudio libroEstudio = new LibroEstudio();

        libroEstudio.alquilar();
        boolean estaAlquiladoInicial = libroEstudio.getAlquilado();
        Assertions.assertThat(estaAlquiladoInicial).isTrue();

        libroEstudio.devolver();
        boolean estaAlquilado = libroEstudio.getAlquilado();
        Assertions.assertThat(estaAlquilado).isFalse();
    }

    @Test
    public void generarAlquiler(){
        Biblioteca biblioteca = Biblioteca.getInstance();

        //Alquiler alquiler = new Alquiler("harry potter");

        //biblioteca.generarAlquiler("harry potter");

    }


}
