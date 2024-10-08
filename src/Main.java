
public class Main {

	public static void main(String[] args) {
		Cliente Danilo = new Cliente();
		Danilo.setNome("Danilo");
		
		Conta cc = new ContaCorrente(Danilo);
		Conta poupanca = new ContaPoupanca(Danilo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("Adicionando saldo nas contas...");
		cc.depositar(10000);
		poupanca.depositar(10000);

		System.out.println("Novo saldo das contas:");
		System.out.println("Conta corrente:" + cc.getSaldo());
		System.err.println("Poupança:"+ poupanca.getSaldo());

		System.out.println("Rendimento automatico após passar um mês:");
		poupanca.rendimentoAutomatico(poupanca.saldo);
		cc.rendimentoAutomatico(cc.saldo);

		System.out.println("Valor rendido em cada conta\n" + "Poupança : "+ poupanca.getSaldo() + " Conta Corrente: " + cc.getSaldo() );
	}

}
