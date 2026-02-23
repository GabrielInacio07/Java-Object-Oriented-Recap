import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX09 de POO");
        Scanner input = new Scanner(System.in);

        Stocks estoque = new Stocks("Camiseta Oversized",10);

        System.out.println(estoque.venda(5));
        System.out.println(estoque.venda(4));
        System.out.println(estoque.venda(3));

        input.close();
    }
}