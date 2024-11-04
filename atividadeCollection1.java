package atividadecollection;
import java.util.ArrayList;

//Atividade de Collection 1

import java.util.Scanner;

public class atividadeCollection1 {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Escreva uma cor: ");
		cores.add(ler.nextLine());
		
		System.out.println("Escreva uma cor: ");
		cores.add(ler.nextLine());
		
		System.out.println("Escreva uma cor: ");
		cores.add(ler.nextLine());
		
		System.out.println("Escreva uma cor: ");
		cores.add(ler.nextLine());
		
		System.out.println("Escreva uma cor: ");
		cores.add(ler.nextLine());
		
		System.out.println("---------------------------------------------------------");//Apenas para dividir o código no terminal
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("---------------------------------------------------------");//Apenas para dividir o código no terminal
		
		cores.sort(null);
		
		for(String cor : cores) {
			System.out.println(cor);
		}
	}
}
