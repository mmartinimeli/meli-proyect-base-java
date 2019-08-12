package ar.com.mercadolibre.despachador;

import java.util.ArrayList;

public class Despachador {
    private String direccion;
    private Envio envio;

    public Despachador(String direccion, ArrayList<Paquete> paquetes){
        CalculadorCosto calculadorCosto = new CalculadorCosto();
        float costo = calculadorCosto.calcularCosto(paquetes.size());

        CalculadorTransporte calculadorTransporte = new CalculadorTransporte();
        Transporte transporte = calculadorTransporte.calcularTrasporte(paquetes);

        Envio envio = new Envio(direccion, paquetes,  costo, transporte);
    }


}
