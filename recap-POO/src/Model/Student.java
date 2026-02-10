package Model;

public class Student {

    private String nome;
    private double nota;
    private double nota2;

    public Student() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String validaAproved(double nota1,double nota2){

        double media = (nota1 + nota2) / 2;

        return media >= 7 ? "Aprovado" : "Reprovado";
    }
}
