public class CoberturaDecorator implements Helado {
    private Helado helado;

    public CoberturaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con cobertyra";
    }

    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}