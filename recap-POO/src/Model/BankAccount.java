package Model;

public class BankAccount {

    private double saldo;

    public BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }
    public void zerarSaldo(){
        this.saldo = 0;
    }
}
