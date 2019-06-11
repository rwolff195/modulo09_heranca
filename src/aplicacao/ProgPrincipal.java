package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Suponha um negócio de banco que possui uma conta comum e uma conta para
		empresas, sendo que a conta para empresa possui todos membros da conta
		comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
		*/
		
		System.out.println("***************************************");
		System.out.println("*************** Herança ***************");
		System.out.println("***************************************");
		
		ContaEmpresa conta = new ContaEmpresa(0010, "Rafael", 0.0, 500.00);
		
		conta.emprestimo(500.00);
		
		System.out.println(conta.getSaldo());

		Conta cc = new Conta(1001, "Alex", 0.0);
		ContaEmpresa ccE = new ContaEmpresa(1002, "Maria", 0.0, 500.00);
		
		System.out.println("***************************************");
		System.out.println("****** Upcasting e Downcasting ********");
		System.out.println("***************************************");
		
		//UPCASTING
		
		Conta cc1 = ccE;
		Conta cc2 = new ContaEmpresa(1003, "Bob", 0.0, 200.0);
		Conta cc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaEmpresa ccE4  = (ContaEmpresa)cc2;
		ccE4.emprestimo(100.0);
		
		// Erro/solução - ContaEmpresa cc5 = (ContaEmpresa)cc3;
		
		if (cc3 instanceof ContaEmpresa) { // instanceof testa se uma classe é uma instancia de outra classe
			ContaEmpresa cc5 = (ContaEmpresa)cc3;
			cc5.emprestimo(200.0);
			System.out.println("Emprestimo");
		}
		
		if (cc3 instanceof ContaPoupanca ) {
			ContaPoupanca cc5 = (ContaPoupanca)cc3;
			cc5.atualizaSaldo();
			System.out.println("Update");
		}
		
		System.out.println("***************************************");
		System.out.println("************ Sobreposição**************");
		System.out.println("***************************************");
		//Normal
		Conta conta1 = new Conta(1001, "Alex", 1000.00);
		conta1.saque(200.00);
		System.out.println(conta1.getSaldo());
		//Sobreposição
		Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.00, 0.01);
		conta2.saque(200.00);
		System.out.println(conta2.getSaldo());
		//Super
		Conta conta3 = new ContaEmpresa(1003, "Bob", 1000.00, 500.00);
		conta3.saque(200.00);
		System.out.println(conta3.getSaldo());
		
		
		System.out.println("***************************************");
		System.out.println("*********** Poliformismo **************");
		System.out.println("***************************************");
		
		Conta x = new Conta(1020, "Alex", 1000.00);
		Conta y = new ContaPoupanca(1023, "Maria", 1000.00, 0.01);
		
		x.saque(50.00);
		y.saque(50.00);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
		
	}

}
