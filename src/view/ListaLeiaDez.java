package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaLeiaDez {
	/*
	  	9) Desenvolva um programa que leia 10 números inteiros e guarde-os em uma lista. 
	  	   No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> numerosDes = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numerosDes.add(scan.nextInt());
		}
		/* mostar numero e posição */
		for (Integer par : numerosDes) {
			if (par % 2 == 0) {
				System.out.println("Posição " + numerosDes.indexOf(par) + ", numero é " + par);
			}
		}
		scan.close();
		System.out.println("Lista: " + numerosDes);
	}
}
