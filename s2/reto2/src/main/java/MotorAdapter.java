public class MotorAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorAdapter(){
        this.motorElectrico = new MotorElectrico();
        System.out.println("Nuevo motor adapter");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo motor");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }


}