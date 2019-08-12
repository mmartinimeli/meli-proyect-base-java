package ar.com.mercadolibre.despachador;

import java.util.ArrayList;

public class Envio {
    private String direccion;
    private ArrayList<Paquete> paquetes;
    private float costo;
    private Transporte transporte;

    public Envio(String direccion, ArrayList<Paquete> paquetes, float costo, Transporte transporte) {
        this.paquetes = paquetes;
        this.costo = costo;
        this.transporte = transporte;
    }
}
