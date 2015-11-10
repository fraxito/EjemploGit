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
		int ancho = getWidth();
		int alto = getHeight();
		int basePiramide = numLadrillosBase * anchoLadrillo;
		//terminado y probado con varios tamaños de ladrillo
		for (int j=0; j< numLadrillosBase; j++){
			for (int i=0; i< numLadrillosBase-j; i++){
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				
				add(ladrillo,
						ancho/2 -basePiramide/2 + anchoLadrillo*j/2 + anchoLadrillo * i,
						alto - altoLadrillo - altoLadrillo*j);
				
				pause(20);
			}
		}
	}
}










