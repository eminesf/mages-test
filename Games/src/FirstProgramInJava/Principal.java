package FirstProgramInJava;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		Mages dumbledore = new Mages("Dumbledore", 200, 0, 0, 0);
		System.out.println("Digite o nome do player 1");
		
		PlayerOne playerOne = new PlayerOne(enter.nextLine());
		
		
		dumbledore.Atack();
	}

}
