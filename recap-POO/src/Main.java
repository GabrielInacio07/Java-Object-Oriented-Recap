import Model.BankAccount;
import Model.Book;
import Model.Product;
import Model.Sensor;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX04 de POO");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o setor do sensor: ");
        String local = input.nextLine();

        System.out.println("Digite a temperatura registrada: ");
        double temperatura = Double.parseDouble(input.nextLine());

        Sensor sensor = new Sensor(local,temperatura);

        System.out.println("Setor do sensor: " + sensor.getLocal());
        System.out.println("Setor do sensor: " + sensor.getTemperatura());
        sensor.validaTemperatura(sensor.getTemperatura());

        input.close();
    }
}