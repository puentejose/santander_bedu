public class GranolaDecorator implements Helado {
    private Helado helado;

    public GranolaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con granola";
    }

    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}