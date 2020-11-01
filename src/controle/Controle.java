package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import bancoDeDados.RegistraVotoBD;
import modelo.Voto;
import visao.TelaDeVotacao;

public class Controle implements ActionListener {
	private Voto voto = new Voto();	
	private TelaDeVotacao telaDeVotacao;

	private RegistraVotoBD registraVoto;
	
	public Controle() {
		telaDeVotacao = new TelaDeVotacao();
		telaDeVotacao.setVisible(true);
		telaDeVotacao.setSize(800, 500);
		telaDeVotacao.setLocationRelativeTo(null);
		
		telaDeVotacao.getBtnVotar().addActionListener(this);
	
		registraVoto = new RegistraVotoBD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
			if(e.getActionCommand().equals("Votar")){
				registraVoto();
			
		}
	}
	
	public void registraVoto() {
		if(telaDeVotacao.getRdbtnCandidatoA().isSelected()) {
			voto = new Voto();
			voto.setVoto(telaDeVotacao.getRdbtnCandidatoA().getText());
			
			registraVoto.registraVoto(voto);
			
			JOptionPane.showMessageDialog(null, "Voto registrado com sucesso!");
		}
		else if(telaDeVotacao.getRdbtnCandidatoB().isSelected()) {
			
			voto = new Voto();	
			voto.setVoto(telaDeVotacao.getRdbtnCandidatoB().getText());
			
			registraVoto.registraVoto(voto);
			
			JOptionPane.showMessageDialog(null, "Voto registrado com sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você precisa selecionar um canditado para poder votar!", "Voto não registrado", 1);
		}
		
		telaDeVotacao.buttonGroupVoto().clearSelection();	
	}
}






























