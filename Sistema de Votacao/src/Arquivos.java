import java.io.*;
public class Arquivos {
	String fileName = "Votacao2021.txt";
	public void Grava (Votacao [] votacao) throws IOException {
		BufferedWriter gravar = new BufferedWriter (new FileWriter (fileName));
		for(int i=0;i<200;i++) {
			gravar.write(Integer.toString(votacao[i].num_secao)); gravar.newLine();
			gravar.write(Integer.toString(votacao[i].num_candidato)); gravar.newLine();
		}
		gravar.close();
	}
}
