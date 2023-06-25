abstract public class Menu {
    private String nombreDelPlato;
    private double valorDelMenu;
    private double valorInicialMenu;
    private double valorBebida;

    public Menu() {};

    public Menu(String nombreDelPlato, double valorDelMenu, double valorInicialMenu, double valorBebida) {
        this.nombreDelPlato = nombreDelPlato;
        this.valorDelMenu = valorDelMenu;
        this.valorInicialMenu = valorInicialMenu;
        this.valorBebida = valorBebida;
    }

    public abstract void MenuGeneral();

    public void setNombreDelPlato(String nombreDelPlato) {
        this.nombreDelPlato = nombreDelPlato;
    }

    public void setValorDelMenu(double valorDelMenu) {
        this.valorDelMenu = valorDelMenu;
    }

    public void setValorInicialMenu(double valorInicialMenu) {
        this.valorInicialMenu = valorInicialMenu;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public String getNombreDelPlato() {
        return nombreDelPlato;
    }

    public double getValorDelMenu() {
        return valorDelMenu;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public double getValorBebida() {
        return valorBebida;
    }

}
