package entidades;

public class Conta {
	
	private Integer numeroConta;
	private String titular;
	protected Double saldo; //protected - permite que a subclasse acesse a variável.
	
	// Construtores
	
	public Conta() {
	}

	public Conta(Integer numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Getters e Setters

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	// Métodos especificos
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void desposito(double valor) {
		saldo += valor;
	}

}