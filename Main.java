package gloop;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	// Altura e Largura da Janela
	protected static int WIDTH = 1020;
	protected static int HEIGHT = 900;
	
	//Invovcações para execução da janela
	public static JFrame frame = new JFrame("Formulário");
	
	//Função para adicionar novos elementos na Janela
	public static void addComponents(Container pane) {
		//Adiciona Layout 
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		
		//adiciona os botões ao código
		addButton("Botão A", pane);
		
	}
	
	// Função paramétrica de criação de botões
	private static void addButton(String string, Container cont) {
		
		//Cria Botão e adiciona seu nome por meio do parâmetro.
		JButton button = new JButton(string);
		button.setAlignmentX(cont.CENTER_ALIGNMENT);
		//adiciona o botão
		cont.add(button);
		
	}

	//Função da Janela
	public static void window(JFrame frame) {

		frame = Main.frame; //Instanciar Frame na função
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Desligar a janela ao fechar
		addComponents(frame.getContentPane());
		//visibilidade
		frame.pack();
		frame.setSize(WIDTH,HEIGHT);

		frame.setVisible(true);
		
	}
	
	//Método Principal
	public static void main(String[] agrs0) {
	
		window(frame);
		
	}

	public void buttonIsPressed() {
		
	}
	
	
}


