package Model;

public class Stocks {

    private String nome;
    private int quantidade;

    public Stocks(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String venda(int valor){
        if (valor < quantidade) {
            quantidade -= valor;
            return "Venda realizada. Estoque restante de " + nome + ": " + quantidade;
        } else {
            return "Estoque insuficiente";
        }
    }
}
