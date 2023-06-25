public class Guerrero extends Personajes{
    private double fuerza;
    private String habilidadCuerpoACuerpo;

    public Guerrero() {}

    public Guerrero(double fuerza, String habilidadCuerpoACuerpo) {
        this.fuerza = fuerza;
        this.habilidadCuerpoACuerpo = habilidadCuerpoACuerpo;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public void setHabilidadCuerpoACuerpo(String habilidadCuerpoACuerpo) {
        this.habilidadCuerpoACuerpo = habilidadCuerpoACuerpo;
    }

    @Override
    public void calcularHabilidadPersonaje() {
        this.habilidadPersonaje = Math.pow(this.fuerza, 2);
    }

}
