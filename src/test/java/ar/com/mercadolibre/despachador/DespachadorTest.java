package ar.com.mercadolibre.despachador;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.sql.Array;
import java.util.ArrayList;

public class DespachadorTest {

    public ArrayList<Paquete> paquetesGenericos(){
        ArrayList<Paquete> paquetes = new ArrayList<>();
        paquetes.add(new Paquete("paquete1", (float) 12.2));
        paquetes.add(new Paquete("paquete2", (float) 234.2));
        paquetes.add(new Paquete("paquete3", (float) 14.2));
        paquetes.add(new Paquete("paquete4", (float) 156.2));
        return paquetes;
    }

    @Test
    public void generarDespachador(){
        ArrayList<Paquete> paquetes = paquetesGenericos();
        String direccion = "Posta 4789";
        Despachador despachador = new Despachador(direccion, paquetes);
        Assertions.assertThat(despachador).isNotNull();
    }

    @Test
    public void calcularCosto(){
        CalculadorCosto calculadorCosto =  new CalculadorCosto();
        float costo = calculadorCosto.calcularCosto(5);
        Assertions.assertThat(costo).isEqualTo((float) 80);
    }

    @Test
    public void calcularTransporteBici(){
        //ArrayList<Paquete> paquetes = paquetesGenericos();
        CalculadorTransporte calculadorTransporte = new CalculadorTransporte();
        CalculadorTransporte calculadorTransporteMock = Mockito.mock(CalculadorTransporte.class);

        //Mockeando paquetes
        Paquete paqueteMock1 = mock(Paquete.class);
        Paquete paqueteMock2 = mock(Paquete.class);
        Paquete paqueteMock3 = mock(Paquete.class);

        when(paqueteMock1.getPeso()).thenReturn((float)1.0);
        when(paqueteMock2.getPeso()).thenReturn((float)1.0);
        when(paqueteMock3.getPeso()).thenReturn((float)1.0);

        ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
        paquetes.add(paqueteMock1);
        paquetes.add(paqueteMock2);
        paquetes.add(paqueteMock3);

        Transporte transporte = calculadorTransporte.calcularTrasporte(paquetes);

        Assertions.assertThat(transporte).isInstanceOf(Bicicleta.class);
    }


}
