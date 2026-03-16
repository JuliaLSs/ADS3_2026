package aula02;

public class Principal {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Bolo");
		conta.depositar(1000);
		
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
		boolean sucesso = conta.sacar(500);
		if (sucesso) {
			System.out.println("Saque feito com sucesso");
		} else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
