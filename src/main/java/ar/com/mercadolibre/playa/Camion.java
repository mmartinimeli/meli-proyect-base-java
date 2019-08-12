package ar.com.mercadolibre.playa;

public class Camion extends VehiculoCarga {
    protected final float CARGA_MAXIMA = 4500;

    @Override
    protected float getCargaMaxima() {
        return CARGA_MAXIMA;
    }
}
