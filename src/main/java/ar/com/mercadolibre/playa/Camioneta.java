package ar.com.mercadolibre.playa;

public class Camioneta extends VehiculoCarga {
    protected final float CARGA_MAXIMA = 1500;

    @Override
    protected float getCargaMaxima() {
        return CARGA_MAXIMA;
    }
}
