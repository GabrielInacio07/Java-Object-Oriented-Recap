import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX08 de POO");
        Scanner input = new Scanner(System.in);
        ArrayList<Task> listaTask = new ArrayList<>();

        //teste
        listaTask.add(new Task("Estudar Alura", true));
        listaTask.add(new Task("Estudar Java", true));
        listaTask.add(new Task("Fazer Exercícios", false));


        System.out.println("📋 Listando tarefas:");
        for(Task tarefas : listaTask){
            System.out.println(tarefas.toString());
        }

        input.close();
    }
}