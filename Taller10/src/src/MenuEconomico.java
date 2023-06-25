abstract public class MenuEconomico extends Menu{
    private double porcentajeDescuento;

    public MenuEconomico() {}

    public MenuEconomico(double porcentajeDescuento, String nombreDelPlato, double valorDelMenu, double valorInicialMenu, double valorBebida) {
        super(nombreDelPlato, valorDelMenu, valorInicialMenu, valorBebida);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
