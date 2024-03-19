public class TesteConta {

   public static void main(String[] args) {

     Conta c1 = new Conta(1, "João", 123, 1000);

     c1.creditaValor(100);

     System.out.println("Saldo Produzido: " + c1.verificaSaldo(123));

     System.out.println("Saldo Esperado: 1100");

    }

}

