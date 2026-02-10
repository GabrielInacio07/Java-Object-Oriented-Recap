import Model.BankAccount;
import Model.Book;
import Model.Product;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX03 de POO");

        BankAccount contaBancaria = new BankAccount(0);

        contaBancaria.setSaldo(1500);
        contaBancaria.exibirSaldo();
        contaBancaria.zerarSaldo();
        contaBancaria.exibirSaldo();
    }
}