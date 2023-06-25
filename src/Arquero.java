public class Arquero extends Personajes{
    private double presicion;
    private String habilidadDistancia;

    public Arquero() {}



    public Arquero(double presicion, String habilidadDistancia) {
        this.presicion = presicion;
        this.habilidadDistancia = habilidadDistancia;
    }

    public void setPresicion(double presicion) {
        this.presicion = presicion;
    }

    public void setHabilidadDistancia(String habilidadDistancia) {
        this.habilidadDistancia = habilidadDistancia;
    }

    public double getPresicion() {
        return presicion;
    }

    public String getHabilidadDistancia() {
        return habilidadDistancia;
    }

    @Override
    public void calcularHabilidadPersonaje() {
        this.habilidadPersonaje = Math.pow(this.presicion, 2) / 2;
    }

}
