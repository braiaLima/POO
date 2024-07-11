
public class Historico {

	private Lancamento[] lancamentos;
	private int ultimoLancamento;
	private int numLancamentos;

	public Historico(int numLancamentos) {
		this.numLancamentos = numLancamentos;
		this.lancamentos = new Lancamento[numLancamentos];
	}

	public void realizaLancamento(String descricao, double valor) {
		if (this.ultimoLancamento == this.numLancamentos) {
			for (int i = 1; i < this.ultimoLancamento; i++) {
				this.lancamentos[i - 1] = this.lancamentos[i];
			}
		} else {
			this.ultimoLancamento++;
		}
		this.lancamentos[this.ultimoLancamento] = new Lancamento(descricao, valor);
	}

	public String verificaExtrato() {
		StringBuilder extrato = new StringBuilder();

		extrato.append("EXTRATO DA CONTA\n").append("------------------------\n");
		for (int i = 1; i <= this.ultimoLancamento; i++) {
			extrato.append(this.lancamentos[i].getDescricao()).append(": R$").append(this.lancamentos[i].getValor())
					.append("\n");
		}
		return extrato.toString();
	}
}
