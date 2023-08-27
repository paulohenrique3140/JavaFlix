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
		return filmes.size() > 0 ? filmes : null;
	}

	public List<Title> listarSeries() {
		List<Title> series = new ArrayList<>();
		for (Title y : title) {
			if (y.getTipo().equals("Serie")) {
				series.add(y);
			}
		}
		return series.size() > 0 ? series : null;
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
		return buscaGenero.size() > 0 ? buscaGenero : null;
	}

	public List<Title> buscaPorAno(int ano) {
		List<Title> buscaAno = new ArrayList<>();
		for (Title x : title) {
			if (x.getAnoLancamento() == ano) {
				buscaAno.add(x);
			}
		}
		return buscaAno.size() > 0 ? buscaAno : null;
	}

	public void mediaAvaliacao(int usuarios, List<Avaliacoes> notas, List<Title> listaAvaliacao) {
	    for (Title titulo : listaAvaliacao) {
	        double soma = 0.0;
	        int avaliacoesParaTitulo = 0;
	        
	        for (Avaliacoes avaliacao : notas) {
	            if (avaliacao.getTitulo().equals(titulo.getTitulo())) {
	                soma += avaliacao.getNota();
	                avaliacoesParaTitulo++;
	            }
	        }
	        
	        if (avaliacoesParaTitulo > 0) {
	            double media = soma / avaliacoesParaTitulo;
	            titulo.setAvaliacao(media);
	        }
	    }
	}
}
