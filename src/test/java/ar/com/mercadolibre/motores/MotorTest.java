package ar.com.mercadolibre.motores;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorTest {

    @Test
    public void crearMotor(){
        Motor motor = new Motor("nuclear");
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void crearMotorElectrico() {
        MotorElectrico motorElectrico = new MotorElectrico("solar");
        Assertions.assertThat(motorElectrico).isNotNull();
    }

    @Test
    public void aumentarPotenciaMotorCombustible(){
        MotorCombustible motorCombustible =  new MotorCombustible("nafta");
        float potencia_inicial = motorCombustible.getPotencia();
        motorCombustible.cambiarPotencia(10);

        Assertions.assertThat(motorCombustible.getPotencia()).isGreaterThan(potencia_inicial);
    }

    @Test
    public void disminuirPotenciaMotorCombustible() {
        MotorCombustible motorCombustible = new MotorCombustible("diesel");
        float potencia_inicial = motorCombustible.getPotencia();
        motorCombustible.cambiarPotencia(-30);

        Assertions.assertThat(motorCombustible.getPotencia()).isLessThan(potencia_inicial);
    }

    @Test
    public void evitarPotenciasNegativasMotorCombustible() {
        MotorCombustible motorCombustible = new MotorCombustible("diesel");
        float potencia_inicial = motorCombustible.getPotencia();
        motorCombustible.cambiarPotencia(-30);

        Assertions.assertThat(motorCombustible.getPotencia()).isLessThan(potencia_inicial);
    }

    //Hacer test para evaluar potencias negativas


    /*public void tieneRefrigerante(){
        Motor motor = new MotorElectrico("nuclear");
        Assertions.assertThat(motor.tieneRefrigerante()).isTrue();
    }*/

    /*@Test
    public void subirPotencia(){
        Motor motor = new Motor();

        motor.setPotencia(10);
        Assertions.assertThat().isLessThan();
    }*/
}
