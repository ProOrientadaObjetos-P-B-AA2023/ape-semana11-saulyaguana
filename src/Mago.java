public class Mago extends Personajes{
    private String[] hechizos;
    private String[] poderesMagcos;

    public Mago() {}

    public Mago(String[] hechizos, String[] poderesMagcos) {
        this.hechizos = hechizos;
        this.poderesMagcos = poderesMagcos;
    }

    public void setHechizos(String[] hechizos) {
        this.hechizos = hechizos;
    }

    public void setPoderesMagcos(String[] poderesMagcos) {
        this.poderesMagcos = poderesMagcos;
    }

    public void calcularHabilidadPersonaje() {
        this.habilidadPersonaje = (hechizos.length / poderesMagcos.length);
    }

}
