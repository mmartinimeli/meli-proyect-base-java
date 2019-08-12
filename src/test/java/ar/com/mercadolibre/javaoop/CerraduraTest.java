package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CerraduraTest {

    /* implemntacion de test TDD */
    @Test
    public void crearCerradura() {
        Cerradura crerradura = new Cerradura();
        Assertions.assertThat(crerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClave() {
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClaveNumericaYLoGuarde(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1234);
    }

    @Test
    public void crearCerraduraConOtraClaveNumericaYLoGuarde(){
        Cerradura cerradura = new Cerradura(1235);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1235);
    }

    @Test
    public void unaCerraduraSeCreaCerrada(){
        // decision de negocio que implementamos que se la cerradura se crea cerrada
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
    }

    @Test
    public void abrirCerraduraConClave(){
        // crear cerradura
        Cerradura cerradura = new Cerradura(1234);
        // Veo que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        // La intento abrir
        cerradura.abrir(1234);
        // Veo que no este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isFalse();
    }

    @Test
    public void abrirCerraduraConClaveIncorrecta(){
        // crear cerradura
        Cerradura cerradura = new Cerradura(1234);
        // Veo que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        // La intento abrir
        cerradura.abrir(1235);
        // Veo que no este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
    }
}