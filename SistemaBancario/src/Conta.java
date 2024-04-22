
public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    // Construtor

    // Método abstrato para sacar dinheiro da conta
    public abstract void sacar(double valor);

    // Método abstrato para transferir dinheiro para outra conta
    public abstract void transferir(Conta destino, double valor);

    // Método abstrato para depositar dinheiro na conta
    public abstract void depositar(double valor);

    // Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
