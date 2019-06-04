package entidades;

public class ContaPoupanca extends Conta{
	
	private Double taxaDeJuros;
	
	// Construtores
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaDeJuros) {
		super(numeroConta, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	// Getters e Setters
	
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	// Métodos especificos
	
	public void atualizaSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	

}
