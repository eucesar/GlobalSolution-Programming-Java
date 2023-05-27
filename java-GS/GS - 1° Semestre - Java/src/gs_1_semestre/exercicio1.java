package gs_1_semestre;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double eto, ta, ua, ra, vv, umidade;
		String resposta;

		do {
			System.out.println(" ");
			System.out.print("-----> Informe a umidade do solo: ");
			umidade = teclado.nextDouble();

			System.out.print("-----> Informe a temperatura média do ar em graus Celsius: ");
			ta = teclado.nextDouble();
			if (ta >= 32) {

				System.out.print("-----> Informe a umidade relativa média do ar: ");
				ua = teclado.nextDouble();
				if (ua <= 100) {

					System.out.print("-----> Informe a velocidade média em metros por segundo (m/s): ");
					vv = teclado.nextDouble();

					ra = 37.6 * 0.16 * Math.sqrt(vv);
					System.out.println("-----> Valor da resistência aerodinâmica: " + ra);

					eto = (0.0009384 * (ta + 17.8) * (Math.sqrt(ta - 32)) * (ra + 1.17) * (ta + 17.8) * (ua / 100)* 6.5) / (ta + 237.3);
					System.out.println("-----> Valor do eto: " + Math.max(0, eto));

					if (umidade <= 50) {
						System.out.println(" ");
						System.out.println("--- Condições de Irrigação ---");
						System.out.println("O solo está seco e necessita de irrigação.");

						if (eto > 5) { //6..
							System.out.println("Demanda de água das plantas: Alta. Realizar irrigação por 30 minutos.");
						} else if (eto > 2) { //2 - 5
							System.out.println(
									"Demanda de água das plantas: Moderada. Realizar irrigação por 15 minutos.");
						} else { //1 - 2
							System.out.println("Demanda de água das plantas: Baixa. Não é necessário irrigar.");
						}
					} else {
						System.out.println("O solo está úmido e não necessita de irrigação.");
					}
				} else {
					System.out.println("A umidade relativa média do ar deve ser menor ou igual a 100.");
				}
			} else {
				System.out.println(
						"A temperatura média do ar deve ser igual ou maior que 32. Pois as condições devem ser favoráveis para a evapotranspiração.");
			}

			System.out.println(" ");
			System.out.print("-----> Deseja calcular novamente (s / n) ? ");
			resposta = teclado.next();
		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Obrigado! Volte sempre...");
	}
}