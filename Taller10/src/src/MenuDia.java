abstract public class MenuDia extends Menu{
    private double valorPostre;

    public MenuDia() {};

    public MenuDia(String nombreDelPlato, double valorDelMenu, double valorInicialMenu, double valorBebida) {
        super(nombreDelPlato, valorDelMenu, valorInicialMenu, valorBebida);
        this.valorPostre = valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorPostre() {
        return valorPostre;
    }

}
