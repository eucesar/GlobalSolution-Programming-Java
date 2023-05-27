package gs_1_semestre;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean loop = false;
		String tipoSolo, clima;
		double tamanhoPropriedade;
		String resposta;

		do {
			while (!loop) {
				System.out.println(" ");
				System.out.print("Digite o tipo de solo (argiloso ou arenoso): ");
				tipoSolo = teclado.next();
				if (tipoSolo.equalsIgnoreCase("argiloso") || tipoSolo.equalsIgnoreCase("arenoso")) {

					System.out.print("Digite o clima (quente ou frio): ");
					clima = teclado.next();
					if (clima.equalsIgnoreCase("quente") || clima.equalsIgnoreCase("frio")) {

						System.out.print("Digite o tamanho da propriedade em hectares: ");
						tamanhoPropriedade = teclado.nextDouble();

						System.out.println(" ");
						System.out.println("-----> Recomendações de cultivos: <-----");
						System.out.println(" ");

						if (tipoSolo.equalsIgnoreCase("argiloso")) {
							System.out.println("-----> Argiloso: ");
							System.out.println("---> Milho");
							System.out.println("---> Feijão");
							System.out.println("---> Soja");
						} else if (tipoSolo.equalsIgnoreCase("arenoso")) {
							System.out.println("-----> Arenoso:");
							System.out.println("---> Trigo");
							System.out.println("---> Cevada");
						}

						if (clima.equalsIgnoreCase("quente")) {
							System.out.println(" ");
							System.out.println("-----> Quente:");
							System.out.println("---> Tomate");
							System.out.println("---> Pimentão");
						} else if (clima.equalsIgnoreCase("frio")) {
							System.out.println(" ");
							System.out.println("-----> Frio:");
							System.out.println("---> Cenoura");
							System.out.println("---> Beterraba");
						}

						if (tamanhoPropriedade >= 10) {
							System.out.println(" ");
							System.out.println(
									"-----> Ja que a propriedade tem mais de 10 hectares o agricultor pode fazer o plantio de:");
							System.out.println("---> Abóbora:");
							System.out.println("---> Melancia");
						} else {
							System.out.println(" ");
							System.out.println("-----> Ja que a propriedade tem menos de 10 hectares o agricultor não pode fazer o plantio de 'abobora' ou 'melancia:'");
						}

						System.out.println(" ");
						System.out.println("-----------------------------------------");
						loop = true;
					} else {
						System.out.println("-----> O clima tem que ser 'quente' ou 'frio'!");
						break;
					}
				} else {
					System.out.println("-----> O tipo do solo tem que ser 'argiloso' ou 'arenoso'!");
					break;
				}
			}
			System.out.println();
			System.out.print("-----> Deseja tentar novamente (s / n) ? ");
			resposta = teclado.next();
			loop = false;

		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Obrigado! Volte sempre...");
		teclado.close();
	}
}