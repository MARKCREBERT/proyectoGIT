//@author Marcos Sepulcre Albert

import java.util.Scanner; //Importa la clase Scanner
public class Operaciones {

	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);


			System.out.println("Introduce primer número: ");
			int primerNumero = teclado.nextInt();

			System.out.println("Introduce segundo número: ");
			int segundoNumero = teclado.nextInt();

			System.out.println("1:Sumar, 2:Restar, 3:multiplicar, 4:dividir");
			int eleccion = teclado.nextInt();


			switch(eleccion) {

			case 1: 
					System.out.println("Resultado " + (primerNumero + segundoNumero));
			break;
			case 2: 
					System.out.println("Resultado " + (primerNumero - segundoNumero));
			break;
			case 3: 
					System.out.println("Resultado " + (primerNumero * segundoNumero));
			break;
			case 4: 
					System.out.println("Resultado " + (primerNumero / segundoNumero));
			break;
			default: System.out.println("error");

			System.out.println("Resultado" + eleccion);

		}

		

	}
}

