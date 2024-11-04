package atividadecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class atividadeCollection3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		HashSet<Integer> numeros1 = new HashSet<Integer>();
		Scanner ler = new Scanner(System.in);
	
		Collections.addAll(numeros, 2,5,1,3,4,9,7,8,10,6);
		Collections.addAll(numeros1, 2,5,10,3,4,2,2,3,10,5);
		
		
		System.out.println("Listar dados do Set: ");
		for (Integer numero : numeros) {
			System.out.print(numero+" ");
		}
		
		System.out.println("\n\nListar dados do Set: ");
		for (Integer numero1 : numeros1) {
			System.out.print(numero1+" ");
		}
	}
}
