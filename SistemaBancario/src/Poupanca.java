public class Poupanca extends Conta {

    public Poupanca(int agencia, int numero, double saldo) {
        super();
        // TODO Stub de construtor gerado automaticamente
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + destino.getNumero() + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor do depósito inválido.");
        }
    }
}
