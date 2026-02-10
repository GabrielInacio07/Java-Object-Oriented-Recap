import Model.Product;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX01 de POO");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nome do produto: ");
        String nome = input.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(input.nextLine());

        System.out.println("Digite a quantidade de produto: ");
        int quantidade = Integer.parseInt(input.nextLine());

        Product product = new Product(nome,preco,quantidade);

        System.out.println("Produto: " + product.getNome());
        System.out.println("Preço: R$" + product.getPreco());
        System.out.println("Quantidade em estoque: " + product.getQuantidade());

        input.close();
    }
}