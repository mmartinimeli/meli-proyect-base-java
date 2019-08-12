package ar.com.mercadolibre.despachador;

public class CalculadorCosto {
    public float calcularCosto(int cantidadPaquetes){
        float costo = (float) 0.0;
        if (true == cantidadPaquetes < 5) {
            costo = (float) 50.0;
        } else if (true == cantidadPaquetes < 10) {
            costo = (float) 80.0;
        } else if (true == cantidadPaquetes > 9) {
            costo = (float) 15.0 * cantidadPaquetes;
        }
        return costo;
    }
}
