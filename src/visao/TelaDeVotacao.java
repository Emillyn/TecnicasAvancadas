package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaDeVotacao extends JFrame {

	private JPanel contentPane;
	private JButton btnVotar;
	
	private JRadioButton rdbtnCandidatoA;
	private JRadioButton rdbtnCandidatoB;
	
	private ButtonGroup buttonGroupVoto;

	public TelaDeVotacao() {
		setTitle("Tela de Vota\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 424);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][][][29.00][26.00][21.00][][][grow][28.00][][][][27.00][][36.00][25.00][][21.00][grow]", "[grow][][][18.00,grow][][grow][][][][][grow][][][grow]"));
		
		JLabel lblTelaDeVotacao = new JLabel("Tela de Vota\u00E7\u00E3o");
		lblTelaDeVotacao.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 20));
		contentPane.add(lblTelaDeVotacao, "cell 4 1 15 3,alignx center");
		
		JLabel lblDefinaOCandidato = new JLabel("Por favor selecione o candidato que deseja votar:");
		lblDefinaOCandidato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDefinaOCandidato, "cell 1 4 20 1,alignx center");
		
		JLabel lblCandidatoA = new JLabel("Candidato A");
		lblCandidatoA.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblCandidatoA, "cell 3 7 5 1,alignx center");
		
		JLabel lblCandidatoB = new JLabel("Candidato B");
		lblCandidatoB.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblCandidatoB, "cell 15 7 5 1,alignx center");
		
		rdbtnCandidatoA = new JRadioButton("A");
		rdbtnCandidatoA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(rdbtnCandidatoA, "cell 3 9 5 1,alignx center");
		
		rdbtnCandidatoB = new JRadioButton("B");
		rdbtnCandidatoB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(rdbtnCandidatoB, "cell 15 9 5 1,alignx center");
		
		btnVotar = new JButton("Votar");
		btnVotar.setIcon(new ImageIcon(TelaDeVotacao.class.getResource("/icones/check.png")));
		btnVotar.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnVotar, "cell 18 12 4 1,alignx center,aligny center");
		
		buttonGroupVoto = new ButtonGroup();
		buttonGroupVoto.add(rdbtnCandidatoA);
		buttonGroupVoto.add(rdbtnCandidatoB);
	}

	public JButton getBtnVotar() {
		return btnVotar;
	}

	public void setBtnVotar(JButton btnVotar) {
		this.btnVotar = btnVotar;
	}

	public JRadioButton getRdbtnCandidatoA() {
		return rdbtnCandidatoA;
	}

	public void setRdbtnCandidatoA(JRadioButton rdbtnCandidatoA) {
		this.rdbtnCandidatoA = rdbtnCandidatoA;
	}

	public JRadioButton getRdbtnCandidatoB() {
		return rdbtnCandidatoB;
	}

	public void setRdbtnCandidatoB(JRadioButton rdbtnCandidatoB) {
		this.rdbtnCandidatoB = rdbtnCandidatoB;
	}

	public ButtonGroup buttonGroupVoto() {
		return buttonGroupVoto;
	}

	public void setVoto(ButtonGroup buttonGroupVoto) {
		this.buttonGroupVoto = buttonGroupVoto;
	}
}
