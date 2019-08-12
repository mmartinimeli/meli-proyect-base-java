package ar.com.mercadolibre.playa;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlayaCargaTest {

    @Test
    public void crearPlayaCarga(){
        PlayaCarga playaCarga = PlayaCarga.getInstance();
        Assertions.assertThat(playaCarga).isNotNull();
    }

    @Test
    public void evaluarQuePuedaIngresarVeheiculoCarga(){
        PlayaCarga playaCarga = PlayaCarga.getInstance();
        Camioneta camioneta = new Camioneta();
        boolean estado_ingreso = playaCarga.ingresarVehiculo(camioneta);
        Assertions.assertThat(estado_ingreso).isTrue();
    }

    @Test
    public void agregarCarga(){
        Camion camion = new Camion();

        float carga_inicial = camion.getCarga();
        camion.agregarCarga((float)1500.5);
        Assertions.assertThat(carga_inicial).isLessThan(camion.getCarga());

    }

    public void evaluarQueNoSeSupereCargaMaxima(){
        Utilitario utilitario = new Utilitario();

        utilitario.agregarCarga(800);
    }

}
