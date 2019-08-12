package ar.com.mercadolibre.despachador;

import java.util.ArrayList;

public class CalculadorTransporte {

    public Transporte calcularTrasporte(ArrayList<Paquete> paquetes){
        float pesoTotal = 0;
        for (Paquete paquete: paquetes) {
            pesoTotal += paquete.getPeso();
        }

        Transporte transporte = new Transporte();
        if(pesoTotal < Bicicleta.PESO_MAXIMO){
            transporte = new Bicicleta();
        }else if(pesoTotal < Auto.PESO_MAXIMO){
            transporte = new Auto();
        }else if(pesoTotal < Camioneta.PESO_MAXIMO){
            transporte = new Camioneta();
        }else{
            //throw new Exception("Peso excedido.");
        }
        return transporte;
    }
}
