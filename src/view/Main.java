/* Nome: Ronan Jorge
 * Data: 04/03/2023
 * Objetivo: Fazer uma aplicação que rode 5 Threads que cada uma delas 
 * imprima no console o seu número.
 */

package view;

import controller.ThreadId;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Thread x = new ThreadId();
			x.start();
		}
	}

}