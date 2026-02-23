import Model.*;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX06 de POO");
        Scanner input = new Scanner(System.in);
        //teste
        Developer dev = new Developer("Gabriel Inácio","Dev Trainee",1);

        System.out.println("---  Antes da Atualização  ---");
        dev.showDetails();

        dev.setCargo("Dev Junior");
        dev.setNivel(2);

        System.out.println("\n---  Após da Atualização  ---");
        dev.showDetails();

        input.close();
    }
}