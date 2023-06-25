abstract public class MenuCarta extends Menu{
    private double valorPorcionGuarnicion;
    private double porcentajeAdicional;

    public MenuCarta() {};

    public MenuCarta(double valorPorcionGuarnicion, double porcentajeAdicional, String nombreDelPlato, double valorDelMenu, double valorInicialMenu, double valorBebida) {
        super(nombreDelPlato, valorDelMenu, valorInicialMenu, valorBebida);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.porcentajeAdicional = porcentajeAdicional;
    };
}
