package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.Dao;
import modelo.Voto;
import visao.TelaDeVotacao;


public class Controle implements ActionListener {
	private Voto voto = new Voto();	
	private TelaDeVotacao tela;

	private Dao dao;
	
	public Controle() {
		tela = new TelaDeVotacao();
		tela.setVisible(true);
		tela.setSize(800, 500);
		tela.setLocationRelativeTo(null);
		
		tela.getBtnVotar().addActionListener(this);
	
		dao = new Dao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
			if(e.getActionCommand().equals("Votar")){
				registraVoto();
			
		}
	}
	
	public void registraVoto() {
		if(tela.getRdbtnCandidatoA().isSelected()) {
			voto = new Voto();
			voto.setVoto(tela.getRdbtnCandidatoA().getText());
			
			dao.registraVoto(voto);
			
			JOptionPane.showMessageDialog(null, "Voto registrado com sucesso!");
		}
		else if(tela.getRdbtnCandidatoB().isSelected()) {
			
			voto = new Voto();	
			voto.setVoto(tela.getRdbtnCandidatoB().getText());
			
			dao.registraVoto(voto);
			
			JOptionPane.showMessageDialog(null, "Voto registrado com sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você precisa selecionar um canditado para poder votar!", "Voto não registrado", 1);
		}
		
		tela.buttonGroupVoto().clearSelection();	
	}
}






























