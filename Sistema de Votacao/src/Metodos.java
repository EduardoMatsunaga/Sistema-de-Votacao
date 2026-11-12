import java.io.*;
import java.util.*;
public class Metodos {
	Random random = new Random ();
	public Votacao [] FCadastraVotacao (Votacao [] votacao ) {
		int i;
		for (i=0;i<200;i++) {
			votacao[i].num_secao = random.nextInt(0,11);
			votacao[i].num_candidato = random.nextInt(0,301);
		}
		return votacao;
	}
	
	public Votacao [] FClassificaSecao (Votacao [] votacao) {
		Votacao aux [] = new Votacao [1];
		aux[0] = new Votacao();
		for (int i=0;i<200;i++){
			for (int j=i+1;j<200;j++){
				if (votacao[i].num_secao > votacao[j].num_secao){
					aux[0].num_secao = votacao[i].num_secao;
		            aux[0].num_candidato = votacao[i].num_candidato;
		                    
		           votacao[i].num_secao = votacao[j].num_secao;
		           votacao[i].num_candidato = votacao[j].num_candidato;
		                    
		           votacao[j].num_secao = aux[0].num_secao;
		           votacao[j].num_candidato = aux[0].num_candidato;
		        }
		   }
		}
		System.out.println("Dados classificados");
		return votacao;
	}
	
	public Votacao [] FGravaVotacao (Votacao [] votacao) throws IOException {
		Arquivos arq = new Arquivos();
		arq.Grava(votacao);
		System.out.println("Arquivo gerado");
		return votacao;
	}
	
	public void PQtdEleitoresSecao (Votacao [] votacao) {
		int cont [] = new int [11];
		for(int i =0; i<200;i++) {
			cont [votacao[i].num_secao] +=1;
		}
		for (int i=0;i<11; i++) {
			System.out.println("Seção " + i + ": " + cont[i] + " eleitores");
		}
	}
	
	public void PMaiorMenorSecao (Votacao [] votacao) {
		int i, posMaior, posMenor;
		int contador [] = new int [11];
		for (i=0;i<200;i++) {
				contador[votacao[i].num_secao] += 1;
		}
		posMaior = 0;
		posMenor = 0;
		for (i=1;i<11;i++) {
			if (contador[i] > contador[posMaior]) {
				posMaior = i;
			}
			if (contador[i] < contador[posMenor]) {
				posMenor = i;
			}
		}
		System.out.println("Maior: seção " + posMaior + " com " + contador[posMaior] + " eleitores");
		System.out.println("Menor: seção " + posMenor + " com " + contador[posMenor] + " eleitores");
	}
	
	public void PVotosCandidato (Votacao [] votacao) {
		int i;
		int contador [] = new int [301];
		for (i=0;i<200;i++) {
			contador[votacao[i].num_candidato] += 1;
		}
		for (i=0;i<301;i++) {
			if (contador[i] > 0) {
				System.out.println("Candidato " + i + ": " + contador[i] + " voto(s)");
			}
		}
	}
	
	public void DezVotados (Votacao [] votacao) {
		int i, k, posMaior;
		int contador [] = new int [301];
		for (i=0;i<200;i++) {
			contador[votacao[i].num_candidato] += 1;
		}
		System.out.println("10 candidatos mais votados:");
		for (k=1;k<=10;k++) {
			posMaior = 0;
			for (i=1;i<301;i++) {
				if (contador[i] > contador[posMaior]) {
					posMaior = i;
				}
			}
			System.out.println(k + "º: candidato " + posMaior + " com " + contador[posMaior] + " voto(s)");
			contador[posMaior] = -1;
		}
	}
}

