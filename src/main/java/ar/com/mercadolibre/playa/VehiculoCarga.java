package ar.com.mercadolibre.playa;

public abstract class VehiculoCarga extends Vehiculo {
    private float carga = 0;

    public void agregarCarga(float carga){
        float futura_carga = this.carga + carga;
        if(futura_carga < getCargaMaxima()){

        }
    }

    protected abstract float getCargaMaxima();

    public float getCarga(){
        return this.carga;
    }
}
