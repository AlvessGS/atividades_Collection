package atividadecollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atividadeCollection4 {
	
	public static void main(String[] args) {
	Boolean encontrado;
		
	Set<Integer> numeros = new HashSet<Integer>();
	Scanner ler = new Scanner(System.in);
	
	Collections.addAll(numeros, 2,5,1,3,4,9,7,8,10,6);
	
	System.out.print("Escreva um número: ");
	Integer valor = ler.nextInt();
	
	numeros.contains(valor);
	
	encontrado = numeros.contains(valor);
	
	if (encontrado==true) {
		System.out.println("\nO número "+valor+ " foi encontrado!");
	}else {
		System.out.println("\nO número "+valor+" não foi encontrado!" );
	}
	
	}
}
