package gs_1_semestre;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ph, indiceCloro, industrias, industriasComProblemas, industriasNormal;
		double contador = 0;
		double porcentagemComProblemas, porcentagemNormal;
		String resposta;

		do {
			System.out.println(" ");
			System.out.print("Digite a quantidade de indústrias de alimento a serem processadas: ");
			industrias = teclado.nextDouble();
			System.out.println("Numero da industrias: " + industrias);

			contador = 1;
			industriasComProblemas = 0;
			industriasNormal = 0;

			while (contador <= industrias) {

				System.out.println(" ");
				System.out.print("-----> Informe o ph da água: ");
				ph = teclado.nextDouble();
				System.out.print("-----> Informe o indice do Cloro: ");
				indiceCloro = teclado.nextDouble();
				System.out.println("Numero da industrias de alimento que sera processadas: " + contador + "°");
				System.out.println(" ");

				// armazenar porcentagem
				if (ph >= 6.5 && ph <= 8.5 && indiceCloro >= 0.5 && indiceCloro <= 2.0) {

					industriasNormal++;

				} else {
					industriasComProblemas++;
				}

				// ph - mensagem
				if (ph >= 6.5 && ph <= 8.5) {
					System.out.println("--- Condição da Água ---");
					System.out.println("-----> Indice do ph ideal");
				} else {
					System.out.println("--- Condição da Água ---");
					System.out.println("-----> Indice do ph esta improprio");
				}

				// cloro - mensagem
				if (indiceCloro >= 0.5 && indiceCloro <= 2.0) {
					System.out.println("-----> Indice do Cloro ideal");
				} else {
					System.out.println("-----> Indece do Cloro esta improprio");
				}

				contador++;
			}
			System.out.println(" ");
			System.out.println("--- Porcentagem ---");
			porcentagemComProblemas = industriasComProblemas / industrias * 100;
			System.out.println(
					"-----> Valida 'Indústrias Normal' se apresentar Ph ideal e Cloro ideal, qualquer outra variação da industria vai contar como 'indústrias com Problema'");
			System.out.println("Porcentagem de indústrias com Problemas na água: " + porcentagemComProblemas + "%");

			porcentagemNormal = industriasNormal / industrias * 100;
			System.out.println("Porcentagem de indústrias Normal: " + porcentagemNormal + "%");

			System.out.println(" ");
			System.out.print("-----> Deseja calcular novamente (s / n) ? ");
			resposta = teclado.next();

		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Obrigado! Volte sempre...");

	}

}
