package atividadecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atividadeCollection2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		Integer valor;
		Boolean encontrado = false;
		
		Collections.addAll(numeros, 2,3, 1, 3,4, 9, 7, 8,10,6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		valor = ler.nextInt();
		
		for(Integer numero : numeros) {
			if (valor==numero) {
				encontrado = true;
				break;
			}
		}
		if(encontrado==true) {
			System.out.println("O número "+valor+" está localizado na posição "+ numeros.indexOf(valor));
		}else if (encontrado!=true) {
			System.out.println("O número "+valor+" não foi encontrado!");
		}
		
	}

}
