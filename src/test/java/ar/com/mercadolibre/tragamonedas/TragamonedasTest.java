package ar.com.mercadolibre.tragamonedas;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Compatibility;
import org.junit.Test;

public class TragamonedasTest {

    @Test
    public void activar() {
        Tragamonedas tragamonedas = new Tragamonedas();
        //Ver como evaluar esto
        tragamonedas.activar();
        Assertions.assertThat(tragamonedas.entregaPremio()).isTrue();
    }

    @Test
    public void numeroObtenidoDentroDeRango(){
        Tambor tambor = new Tambor();
        tambor.girar();
        int numeroObtenido = tambor.obtenerPosicion();

        Assertions.assertThat(numeroObtenido).isGreaterThan(0).isLessThan(9);
    }

    @Test
    public void entregaPremio(){
        Tragamonedas tragamonedas  = new Tragamonedas();
        tragamonedas.activar();
        boolean entrgaPremio = tragamonedas.entregaPremio();

        System.out.println(entrgaPremio);
        Assertions.assertThat(entrgaPremio).isTrue();
    }
}
