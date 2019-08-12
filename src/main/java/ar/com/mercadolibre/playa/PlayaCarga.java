package ar.com.mercadolibre.playa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayaCarga {
    private static PlayaCarga playaCarga = new PlayaCarga();
    private ArrayList <VehiculoCarga> vehiculos;

    private PlayaCarga(){
    }

    public static PlayaCarga getInstance(){
        return playaCarga;
    }

    public boolean ingresarVehiculo(VehiculoCarga vehiculo) {
        return this.vehiculos.add(vehiculo);
    }
}