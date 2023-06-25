abstract public class MenuKids extends Menu{
    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuKids() {}

    public MenuKids(double valorPorcionHelado, double valorPorcionPastel, String nombreDelPlato, double valorDelMenu, double valorInicialMenu, double valorBebida) {
        super(nombreDelPlato, valorDelMenu, valorInicialMenu, valorBebida);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }

    

}
