package lista_musica;

import static org.junit.Assert.assertEquals;



public class Musica {

	private String titulo, genero;
	private int duracao;
	
//	Construtor
	public Musica(String nome, int tamanho, String tipo){
		titulo = nome;
		duracao = tamanho;
		genero = tipo;
	}
	
//	Metodos
	public void assertEquals(Musica nome1, Musica nome2){
		boolean resposta = nome2.getTitulo().equalsIgnoreCase(nome1.getTitulo());
	}


	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public int getDuracao() {
		return duracao;
	}


	

}
