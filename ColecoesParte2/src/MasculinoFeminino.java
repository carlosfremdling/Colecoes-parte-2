import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MasculinoFeminino {

	public static void main(String[] args) {
		List<String> masculino = new ArrayList<String>();
		List<String> feminino = new ArrayList<String>();
		String name;
		String sexo;
		Scanner scan = new Scanner(System.in);

		for (Integer i = 0; i <= 5; i++) {

			System.out.println("Informe o seu nome");
			name = scan.next();

			System.out.println("Infome o seu sexo");
			sexo = scan.next();

			if (sexo.equals("Masculino")) {

				masculino.add(name);

			} else {

				if (sexo.equals("Feminino")) {

					feminino.add(name);

				}

			}

		}

		System.out.println(masculino);
		System.out.println(feminino);
	}
}
