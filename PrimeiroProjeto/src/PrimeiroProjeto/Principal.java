//utilizando o push
/**
 * 
 */
package PrimeiroProjeto;

import java.util.Scanner;

/**
 * @author isaque.santos
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Olá amigo!\nQual é o seu nome?"); //Uso do println
		
		//Ler uma string do console usando a bliblioteca Scanner.
		Scanner in  = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf
		System.out.printf("Olá %s!\n", nome);

	}

}
