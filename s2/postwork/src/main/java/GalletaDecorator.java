public class GalletaDecorator implements Helado {
    private Helado helado;

    public GalletaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con galleta";
    }

    @Override
    public int getPrecio() {
        return helado.getPrecio() + 15;
    }
}