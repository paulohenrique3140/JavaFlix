package entities;

import java.util.ArrayList;
import java.util.List;

public class Utilitarios {
	List<Title> title; 
	List<Title> titleToAvaliate = new ArrayList<>();
	
	double[][] mediaAvaliacao;

	public Utilitarios() {
		title = new ArrayList<>();
	}

	public void addTitle(Title novo) {
		title.add(novo);
	}
	
	public List<Title> addTitleToAvaliate(String tituloDois) {
		for (Title x : title) {
			if (x.getTitulo().equals(tituloDois)) {
				titleToAvaliate.add(x);
				break;
			}
		}
		return titleToAvaliate.size() > 0 ? titleToAvaliate : null;
	}

	public List<Title> listarTitulos() {
		return title;
	}
	
	public List<Title> listarTitulosParaAvaliacao() {
		return titleToAvaliate;
	}
	
	public List<Title> listarFilmes() {
		List<Title> filmes = new ArrayList<>();
		for (Title x : title) {
			if (x.getTipo().equals("Filme")) {
				filmes.add(x);
			}
		}
		if (filmes.size() > 0) {
			return filmes;	
		} else {
			return null;
		}
	}
	
	public List<Title> listarSeries() {
		List<Title> series = new ArrayList<>();
		for (Title y : title) {
			if (y.getTipo().equals("Serie")) {
				series.add(y);
			}
		}
		if (series.size() > 0) {
			return series;
		} else {
			return null;
		}
	}

	public Title buscarPorTitulo(String titulo) {
		for (int i = 0; i < title.size(); i++) {
			if (title.get(i).getTitulo().equals(titulo)) {
				return title.get(i);
			}
		}
		return null;
	}

	public List<Title> buscaPorGenero(String genero) {
		List<Title> buscaGenero = new ArrayList<>();
		for (Title x : title) {
			if (x.getGenero().equals(genero)) {
				buscaGenero.add(x);
			}
		}
		if (buscaGenero.size() > 0) {
			return buscaGenero;
		} else {
			return null;
		}
	}

	public List<Title> buscaPorAno(int ano) {
		List<Title> buscaAno = new ArrayList<>();
		for (Title x : title) {
			if (x.getAnoLancamento() == ano) {
				buscaAno.add(x);
			}
		}
		if (buscaAno.size() > 0) {
			return buscaAno;
		} else {
			return null;
		}
	}
	
	public void mediaAvaliacao(int usuarios, List<Avaliacoes> notas, List<Title> listaAvaliacao) {
		mediaAvaliacao = new double [listaAvaliacao.size()][usuarios];
		for (int i = 0; i < listaAvaliacao.size(); i++) {
			double soma = 0.0;
			/*for (int j = 0; j < usuarios; j++) {
				mediaAvaliacao[i][j] = notas.get(j).getNota();
				soma += mediaAvaliacao[i][j];
			}*/
			
			for (Avaliacoes avaliacao : notas) {
	 			mediaAvaliacao[i][avaliacao.getUsuario() - 1] = avaliacao.getNota();
	 			soma += avaliacao.getNota();
			}
			
			double media = soma / usuarios;
			// arrumar o calculo de media, esta para todas as avaliacoes, filtrar por filme
			for (Title x : title) {
				if (x.getTitulo().equals(listaAvaliacao.get(i).getTitulo())) {
					x.setAvaliacao(media);
				}
			}
			
		}
		
	}
	
	
}
