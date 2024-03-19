public class Conta {




 private int numero;

 private String titular;

 private int senha;

 private double saldo;



  



   public Conta(int num, String tit,int pwd,double valor) {

      this.numero=num;

      this.titular=tit;

      this.senha=pwd;

      this.saldo=valor;

   }

    public String getTitular() {

    return this.titular;

    }

    

    public int getNumero() {

     return this.numero;

    }


    public void setTitular(String titular) {

     this.titular = titular;

    }

    

 public boolean creditaValor(double valor) {

   if(valor>=0) {

    saldo+= valor;

    return true;

   }

   return false; 

 }

  

   

 public double verificaSaldo(int senha) {

  if(this.senha==senha) {

    return this.saldo;

  }

   return -1;

 }

  

 public boolean debitaValor(double valor, int senha) {

   if(this.senha == senha && valor <= this.saldo &&

   valor > 0) {

    this.saldo -= valor;

   return true;

   }

   return false;

 }




}