package programacao_orientada_a_objetos;

import java.util.Scanner;

public class DistanciaEntrePontos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de X do ponto A");
		int xA = leitor.nextInt();
		System.out.println("Digite o valor de Y do ponto A");
		int yA = leitor.nextInt();
		
		Ponto pontoA = new Ponto();
		pontoA.setX(xA);
		pontoA.setY(yA);
		
		System.out.println("Digite o valor de X do ponto B");
		int xB = leitor.nextInt();
		System.out.println("Digite o valor de Y do ponto B");		
		int yB = leitor.nextInt();
		
		Ponto pontoB = new Ponto(xB, yB);
		
		pontoA.saoIguais(pontoB);
		pontoA.distancia(xA, yA, xB, yB);
		//saoIguais(pontoA, pontoB);
		//distancia(xA, yA, xB, yB);
		
		leitor.close();
	}
}
