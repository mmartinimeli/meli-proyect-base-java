package ar.com.mercadolibre.motores;

public class Motor {
    private float potencia;
    private float temperatura;
    private String fuenteEnergia;

    public Motor(String fuenteEnergia){
        this.potencia = 0;
        this.temperatura = 0;
        this.fuenteEnergia = fuenteEnergia;
    }

    public float getPotencia() {
        return potencia;
    }

    public float getTemperatura() {
        return temperatura;
    }

   public void cambiarPotencia(float potencia){
        this.potencia += potencia;
        //Hacer ademas lo de la temperatura
       this.cambiarTemperatura();
   }

   private void cambiarTemperatura(){
        this.temperatura = (float) (this.potencia * 0.10);
   }
}
