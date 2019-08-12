package ar.com.mercadolibre.javaoop;

public class Cerradura {

    public Integer clave;
    private boolean cerrada = true;

    Cerradura(Integer clave){
        this.clave = clave;
    }

    Cerradura(){ }

    public boolean estaCerrada(){
        return cerrada;
    }

    public void abrir(Integer clave){
        if(this.clave.equals(clave)){
            this.cerrada = false;
        }
    }
}
