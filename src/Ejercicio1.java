/*
 * Autor: Jorge Cisneros
 * 
 * Ejemplo de uso de GitHub
 */

import acm.graphics.*;

public class Ejercicio1 extends acm.program.GraphicsProgram{


	public void run () {
		//cambio el tamaño de la ventana
		setSize(800, 600);
		//llamo al método que dibuja la pirámide
		pintaPiramide();
	}

	public void pintaPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		
		//querido yo del martes:
		//te falta lo mas facil que es girar la piramide
		// att: tu yo del viernes
		for (int j=0; j< numLadrillosBase; j++){
			for (int i=0; i< numLadrillosBase-j; i++){
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				add(ladrillo,anchoLadrillo*j/2 + anchoLadrillo * i, altoLadrillo*j);
				pause(20);
			}
		}
	}
}










