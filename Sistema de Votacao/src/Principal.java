import java.io.*;
import javax.swing.*;
public class Principal {
	public static void main (String args []) throws IOException {
		Votacao [] votacao = new Votacao [200];
		Metodos m = new Metodos ();
		int i;
		for (i=0;i<200;i++) {
			votacao [i] = new Votacao();
			
		}
		int opc = 0;
		while (opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Sistema de votação\n 1- Carregar Seção/Número Eleitor\n"
					+ "2- Classificar por seção\n 3- Gravar registro\n 4- Mostrar indicadores\n 9-Finalizar programa"));
			
			switch(opc) {
				case 1: m.FCadastraVotacao(votacao);
				break;
				
				case 2: m.FClassificaSecao(votacao);
				break;
				
				case 3: m.FGravaVotacao(votacao);
				break;
				
				case 4: 
					int opc2 = 0;
					while(opc2!=9) {
						opc2 = Integer.parseInt(JOptionPane.showInputDialog("Estatisticas de votação\n"
								+ "1- Quantidade de eleitores por seção\n"
								+ "2- Seção com Maior e Menor número de Eleitores\n"
								+ "3- Quantidade de votos por candidato\n"
								+ "4- 10 primeiros colocados(nro cand. e qtd votos)\n"
								+ "9- Finalizar consulta"));
						
						switch(opc2) {
							case 1: m.PQtdEleitoresSecao (votacao);
							break;
							
							case 2: m.PMaiorMenorSecao (votacao);
							break;
							
							case 3: m.PVotosCandidato (votacao);
							break;
							
							case 4: m.DezVotados (votacao);
							break;
							
							case 9:JOptionPane.showMessageDialog(null, "Consulta Finalizada");
							break;
							
							default: JOptionPane.showMessageDialog(null, "Opção Invalida");
							
						}
					}
				break;
				
				case 9: JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
				
				default: JOptionPane.showMessageDialog(null, "Opção Invalida");
			}
		}
	}
}
