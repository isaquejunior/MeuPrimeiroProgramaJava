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
		System.out.println("Ol� amigo!\nQual � o seu nome?"); //Uso do println
		
		//Ler uma string do console usando a bliblioteca Scanner.
		Scanner in  = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf
		System.out.printf("Ol� %s!\n", nome);

	}

}
