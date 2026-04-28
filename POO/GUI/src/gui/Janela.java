package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	JTextField operando1;
	JTextField operando2;
	JTextField resultado;
	// construtor (só é chamado uma vez)
	Acao acao = new Acao();
	public Janela( ) {
		
		super("Minha Janela");
		// tamanho da janela
		setSize(500, 300);
		// para o programa fechar também na memória
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// deixar visivel
		setVisible(true);
		
		JPanel painel = new JPanel();
		add(painel);
		
		//JLabel label1 = new JLabel("Boa noite, preciso de café.");
		//painel.add(label1);
		operando1 = new JTextField(10);
		painel.add(operando1);
		operando2 = new JTextField(10);
		painel.add(operando2);
		resultado = new JTextField(10);
		painel.add(resultado);
		
		//JButton botao = new JButton("Ok");
		//painel.add(botao);
		//classe anonima só usada aqui
		operando1.addActionListener(new Acao());
	
		operando2.addActionListener(new Acao());
		
	}
	class Acao implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			double soma = Double.valueOf(operando1.getText()) + Double.valueOf(operando2.getText());
			resultado.setText(String.valueOf(soma));
		}
	}
}
