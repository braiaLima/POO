
public class TesteConta {

	public static void main(String[] args) {
		Lancamento lanc = new Lancamento("credita", 120);
		Cliente cliente = new Cliente("123", "Joao");
		Conta c1 = new Conta(1, cliente, 123, 200);

		c1.creditaValor(100, "credita");
		c1.debitaValor(50, 123, "debita");

		System.out.println(c1.verificaSaldo(123));

	}

}
