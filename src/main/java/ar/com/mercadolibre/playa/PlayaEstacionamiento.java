package ar.com.mercadolibre.playa;

public class PlayaEstacionamiento {
    private static PlayaEstacionamiento playaEstacionamiento = new PlayaEstacionamiento();

    private PlayaEstacionamiento(){

    }

    public PlayaEstacionamiento getInstance(){
        return this.playaEstacionamiento;
    }

}
