package Model;

public class Sensor {

    private String local;
    private double temperatura;

    public Sensor(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    public String getLocal() {
        return local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void validaTemperatura(double temperatura){
        if(temperatura > 37.5){
            System.out.println("Temperatura Acimda do limite");
        }
    }
}
