public class Votacao {
	int num_secao;
	int num_candidato;
	
	Votacao () {
		this(0,0);
	}
	Votacao (int secao, int candidato) {
		num_secao = secao;
		num_candidato = candidato;
	}
}
