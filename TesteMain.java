package Main;

import gestaoDeContas.*;
import gestaoDeCaixa.*;

public class TesteMain {
	public static void main(String[] args) {
	
      Cliente cliente[] = {new Cliente("123", "Brayan"), new Cliente("123", "Sairon"), new Cliente("123", "Luis")};
      
      CadastroContas bd = new CadastroContas(3);
      
      for(int i=0; i < cliente.length; i++) {
    	  bd.adicionaContas(new Conta(i+101, cliente[i], 123+i, 1000.0+(i*100)));
      }
      
      Terminal meuTerminal= new Terminal(bd);
      meuTerminal.iniciaOperacao();
		
    }	
}
