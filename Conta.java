import java.util.Arrays;

public class Conta {

	private int numero;
	private Cliente titular;
	private int senha;
	private double saldo;
	private Historico historicoDeLancamento;

	public Conta(int numero, Cliente titular, int senha, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.senha = senha;
		this.saldo = saldo;
		this.historicoDeLancamento = new Historico(10);
	}

	public boolean creditaValor(double valor, String operacaoBancaria) {
		if (valor < 0) {
			return false;
		}
		this.historicoDeLancamento.realizaLancamento(operacaoBancaria, valor);
		this.saldo += valor;
		return true;
	}

	public double verificaSaldo(int senha) {
		if (senhaEhValida(senha)) {
			return this.saldo;
		}
		return -1;
	}

	public boolean debitaValor(double valor, int senha, String operacaoBancaria) {
		if (!senhaEhValida(senha) | valor > this.saldo | valor < 0) {
			return false;
		}
		this.historicoDeLancamento.realizaLancamento(operacaoBancaria, -valor);
		this.saldo -= valor;
		return true;
	}

	private boolean senhaEhValida(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public String geraExtrato(int senha) {
		if(this.senhaEhValida(senha)) {
			StringBuilder extrato = new StringBuilder();
			extrato.append(this.historicoDeLancamento.verificaExtrato())
				   .append("----------------------")
				   .append("\n")
				   .append("Saldo atual: R$" + this.saldo)
				   .append("\n")
				   .append("----------------------");
				   
			
			return extrato.toString();
		}
		return null;
	}

}
