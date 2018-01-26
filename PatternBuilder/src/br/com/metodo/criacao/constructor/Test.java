package br.com.metodo.criacao.constructor;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Emprestimo emprestimo = Emprestimo.criarTempoLimitado(0	, 0, new Date());
		
		System.out.println(emprestimo);
		
	}



}
