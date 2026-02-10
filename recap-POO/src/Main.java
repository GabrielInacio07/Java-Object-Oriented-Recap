import Model.Book;
import Model.Product;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("EX02 de POO");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Título do livro: ");
        String titulo = input.nextLine();

        System.out.println("Digite o Autor do livro: ");
        String autor = input.nextLine();

        System.out.println("Quantos capítulos tem o Livro: ");
        int capitulos = Integer.parseInt(input.nextLine());

        Book livro = new Book(titulo,autor,capitulos);

        System.out.printf("\"%s\" de %s com %d páginas",
                livro.getTitle(),
                livro.getAuthor(),
                livro.getChapter()
        );


        input.close();
    }
}