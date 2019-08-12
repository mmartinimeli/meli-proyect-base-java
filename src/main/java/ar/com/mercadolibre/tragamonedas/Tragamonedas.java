package ar.com.mercadolibre.tragamonedas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tragamonedas {
    private final int CANTIDAD_TAMBORES = 3;
    private ArrayList<Tambor> tambores = new ArrayList<>();
    private ArrayList<Integer> numerosObtenidos;

    public Tragamonedas(){
        for (int i = 0; i < this.CANTIDAD_TAMBORES; i++){
            this.tambores.add(new Tambor());
        }
    }

    public void activar(){
        //this.numerosObtenidos = new ArrayList<>();
        for (Tambor tambor: this.tambores) {
            tambor.girar();
            //this.numerosObtenidos.add(tambor.obtenerPosicion());
        }
    }

    public boolean entregaPremio(){
        /*int numTambor = this.tambores.stream().findFirst().get().obtenerPosicion();
        return this.tambores
                .stream()
                .filter(x -> x.obtenerPosicion() == numTambor)
                .count() == this.CANTIDAD_TAMBORES;*/
        return this.numerosObtenidos.stream().allMatch(numerosObtenidos.get(0)::equals);
    }
}
