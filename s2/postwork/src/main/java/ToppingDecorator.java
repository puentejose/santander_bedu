public class ToppingDecorator implements Helado {
    private Helado helado;

    public ToppingDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con un topping";
    }

    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}