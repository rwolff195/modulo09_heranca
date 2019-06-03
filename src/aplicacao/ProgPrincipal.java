package aplicacao;

import entidades.ContaEmpresa;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Suponha um negócio de banco que possui uma conta comum e uma conta para
		empresas, sendo que a conta para empresa possui todos membros da conta
		comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
		*/
		
		ContaEmpresa conta = new ContaEmpresa(0010, "Rafael", 0.0, 500.00);
		
		conta.emprestimo(500.00);
		
		System.out.println(conta.getSaldo());

	}

}
