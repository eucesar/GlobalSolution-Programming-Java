package gs_1_semestre;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double precipitacao, temperaturaMedia, agua, regioes, regioesCom_RiscoDeSeca = 0, regioesSem_RiscoDeSeca = 0;
		double contador = 0;

		String resposta;

		do {
			System.out.println(" ");
			System.out.print("Digite a quantidade de regioes do estado: ");
			regioes = teclado.nextInt();
			System.out.println("Numero de Regioes: " + regioes);

			contador = 1;
			regioesCom_RiscoDeSeca = 0;
			regioesSem_RiscoDeSeca = 0;

			while (contador <= regioes) {
				System.out.println(" ");
				System.out.println("-----> Região: " + contador + "°");

				System.out.print("-----> Digite a precipitação (em mm): ");
				precipitacao = teclado.nextDouble();

				System.out.print("-----> Digite a temperatura média (em ºC): ");
				temperaturaMedia = teclado.nextDouble();

				System.out.print("-----> Digite o consumo de água (em m3): ");
				agua = teclado.nextDouble();
				System.out.println(" ");

				if (precipitacao <= 100 && temperaturaMedia >= 30 && agua >= 500) {
					regioesCom_RiscoDeSeca++;
				} else {
					regioesSem_RiscoDeSeca++;
				}

				contador++;
			}
			System.out.println(" ");
			System.out.println("--- Risco ---");
			System.out.println("-----> Número de regiões com risco de seca: " + regioesCom_RiscoDeSeca);
			System.out.println("-----> Número de regiões sem risco de seca: " + regioesSem_RiscoDeSeca);

			System.out.println(" ");
			System.out.print("-----> Deseja tentar novamente (s / n) ? ");
			resposta = teclado.next();
			contador++;

		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Obrigado! Volte sempre...");

	}

}
