package CategoriaNadador;

import java.util.Scanner;

public class Nadadores {
	//atributos
	//atributos
		private String nome, categoria;
		
		private int idade;
		
		//métodos
		
		public void nadar() {
			System.out.println("Boa sorte!");
		}
		public void categorizar(idade) { 
			if (idade >=5 && idade <=8)  {
				System.out.println("Sua categoria é infantil A. ");
			} else {
				if (idade >=8 && idade >=10) {
					System.out.println("Sua categoria é infantil B. ");
				} else {
					if (idade >=11 && idade >=13) {
					System.out.println("Sua categoria é Juvenil A . ");	
					
				} else  {
					if (idade >=14 && idade >=17) {
				
					System.out.println("Sua categoria é Juvenil B. ");
				} else {
					if (idade >=18) {
					System.out.println("Sua categoria é adulto. ");
				}
				Scanner teclado = new Scanner("Qual é a sua idade? " + idade);
				
			}
		}
		

	
