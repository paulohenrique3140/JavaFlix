package entities;

import java.util.List;

public class Title {
	private String titulo;
	private int anoLancamento;
	private String genero;
	private String tipo;
	private String diretor;
	private List<String> elenco;
	private String sinopse;
	private Double mediaAvaliacao;

	public Title(String titulo, int anoLancamento, String genero, String tipo, String diretor, List<String> elenco, String sinopse) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.tipo = tipo;
		this.diretor = diretor;
		this.elenco = elenco;
		this.sinopse = sinopse;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void setElenco(List<String> elenco) {
		this.elenco = elenco;
	}

	public List<String> getElenco() {
		return elenco;
	}
	
	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public void setAvaliacao(Double mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	@Override
	public String toString() {
		return String.format("\nTitulo: %s | Ano de Lancamento: %d | Genero: %s | Tipo: %s | Diretor: %s | \nSinopse: %s\nElenco: %s | \nAvaliacao media: %.1f\n",
				titulo, anoLancamento, genero, tipo, diretor, sinopse, elenco, mediaAvaliacao);
	}

}
