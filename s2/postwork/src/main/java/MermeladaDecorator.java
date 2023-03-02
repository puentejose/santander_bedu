public class MermeladaDecorator implements Helado {
    private Helado helado;

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con mermelada";
    }

    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}