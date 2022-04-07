package gloop;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	// Altura e Largura da Janela
	protected static int WIDTH = 1020;
	protected static int HEIGHT = 900;
	
	//Invovca��es para execu��o da janela
	public static JFrame frame = new JFrame("Formul�rio");
	
	//Fun��o para adicionar novos elementos na Janela
	public static void addComponents(Container pane) {
		//Adiciona Layout 
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		
		//adiciona os bot�es ao c�digo
		addButton("Bot�o A", pane);
		
	}
	
	// Fun��o param�trica de cria��o de bot�es
	private static void addButton(String string, Container cont) {
		
		//Cria Bot�o e adiciona seu nome por meio do par�metro.
		JButton button = new JButton(string);
		button.setAlignmentX(cont.CENTER_ALIGNMENT);
		//adiciona o bot�o
		cont.add(button);
		
	}

	//Fun��o da Janela
	public static void window(JFrame frame) {

		frame = Main.frame; //Instanciar Frame na fun��o
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Desligar a janela ao fechar
		addComponents(frame.getContentPane());
		//visibilidade
		frame.pack();
		frame.setSize(WIDTH,HEIGHT);

		frame.setVisible(true);
		
	}
	
	//M�todo Principal
	public static void main(String[] agrs0) {
	
		window(frame);
		
	}

	public void buttonIsPressed() {
		
	}
	
	
}


