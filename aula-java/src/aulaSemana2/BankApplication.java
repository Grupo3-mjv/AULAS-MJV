package aulaSemana2;

import bankapp.model.Conta;
import bankapp.service.ContaService;



public class BankApplication {

	public static void main(String[] args){
		Conta contaDaCassia = new Conta();
		Conta contaDoAlberto = new Conta();
		Conta contaDaTamilles = new Conta();
		ContaService contaDoGrupo3 = new ContaService ();//criei o objeto
		
		
		
		contaDoGrupo3.depositar(contaDaCassia, 100.00);
		contaDoGrupo3.sacar(contaDaCassia, 10.00);
		System.out.println("------------------------- Banco MJV  -------------------------------");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("C�ssia, ap�s o saque voc� tem em um sua conta: R$" + contaDaCassia.getSaldo());
		
		
		
		contaDoGrupo3.depositar(contaDoAlberto, 300.00);
		contaDoGrupo3.transferir(contaDoAlberto, 150.00, contaDaTamilles);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Alberto, ap�s a transfer�ncia para a conta da Tamilles, seu saldo � de R$" + contaDoAlberto.getSaldo());
		
		
		contaDoGrupo3.depositar(contaDaTamilles, 1000.00);
		contaDoGrupo3.sacar(contaDaTamilles, 1500.00);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Tamilles, voc� n�o tem esse valor dispon�vel, seu saldo � de: R$" + contaDaTamilles.getSaldo());
		System.out.print("----------------------------------------------------------------------");
		
		
		
	}
}
