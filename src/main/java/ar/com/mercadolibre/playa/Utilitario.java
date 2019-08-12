package ar.com.mercadolibre.playa;

public class Utilitario extends VehiculoCarga {
    protected final float CARGA_MAXIMA = 500;

    @Override
    protected float getCargaMaxima() {
        return CARGA_MAXIMA;
    }
}
