package tela;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MinhaJanela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				MinhaJanela frame = new MinhaJanela();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public MinhaJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout()); // layout simples
		setContentPane(contentPane);

		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome);

		JTextField txtNome = new JTextField(20);
		contentPane.add(txtNome);

		JButton btnMostrar = new JButton("Mostrar Nome");
		btnMostrar.addActionListener(e -> {
			System.out.println("Nome digitado: " + txtNome.getText());
		});
		contentPane.add(btnMostrar);
	}
}
