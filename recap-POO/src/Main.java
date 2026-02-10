import Model.*;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX05 de POO");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String aluno = input.nextLine();

        System.out.println("Digite a nota do PRIMEIRO semestre: ");
        double primeiraNota = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do SEGUNDO semestre: ");
        double segundaNota = Double.parseDouble(input.nextLine());

        Student estudante = new Student();

        estudante.setNome(aluno);
        System.out.println("Estudante: " + estudante.getNome());
        System.out.println(estudante.validaAproved(primeiraNota,segundaNota));

        input.close();
    }
}