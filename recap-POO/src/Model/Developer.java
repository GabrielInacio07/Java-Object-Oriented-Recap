package Model;

public class Developer {

    private String nome;
    private String cargo;
    private int nivel;

    public Developer(String nome, String cargo, int nivel) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void showDetails(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Nível de Acesso: " + getNivel());
    }
}
