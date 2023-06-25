abstract public class Personajes {
    private String nombre;
    private String tipoGuerrero;
    private int puntosVida;
    private int nivelExperiencia;
    protected double habilidadPersonaje;

    public Personajes() {}

    public Personajes(String nombre, String tipoGuerrero, int puntosVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.tipoGuerrero = tipoGuerrero;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoGuerrero(String tipoGuerrero) {
        this.tipoGuerrero = tipoGuerrero;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoGuerrero() {
        return tipoGuerrero;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public abstract void calcularHabilidadPersonaje();
}
