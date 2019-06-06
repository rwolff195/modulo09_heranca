package entidades;

public class ContaEmpresa extends Conta { // extends diz que a classe criada herda as caracteristicas de outra classe.

	private Double limiteSaque;
	
	//Construtores 
	
	public ContaEmpresa(){
		super();
	}

	public ContaEmpresa(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
		super(numeroConta, titular, saldo);
		this.limiteSaque = limiteSaque;
	}

	// Getters e Setters
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	// Métodos especificos
	
	public void emprestimo(double valorEmprestimo) {
		if (valorEmprestimo <= limiteSaque) {
			saldo += valorEmprestimo - 10.0;
		}
	}
	
	// Sobreposição + uso do super
	@Override
	public final void saque(double valor) { //evita que a classe/Método seja herdada
		super.saque(valor);
		saldo -= 2.0;
	}
	
}
