package entities;

import java.util.ArrayList;
import java.util.List;

public class Utilitarios {
	List<Title> title;

	public Utilitarios() {
		title = new ArrayList<>();
	}

	public void addTitle(Title novo) {
		title.add(novo);
	}

	public List<Title> listarTitulos() {
		return title;
	}
	
	public List<Title> listarFilmes() {
		List<Title> filmes = new ArrayList<>();
		for (Title x : title) {
			if (x.getTipo().equals("Filme")) {
				filmes.add(x);
			}
		}
		return filmes;
	}
	
	public List<Title> listarSeries() {
		List<Title> series = new ArrayList<>();
		for (Title x : title) {
			if (x.getTipo().equals("Serie")) {
				series.add(x);
			}
		}
		return series;
	}

	public Title buscarPorTitulo(String titulo) {
		for (int i = 0; i < title.size(); i++) {
			if (title.get(i).getTitulo() == titulo) {
				return title.get(i);
			}
		}
		return null;
	}

	public List<Title> buscaPorGenero(String genero) {
		List<Title> buscaGenero = new ArrayList<>();
		for (Title x : title) {
			if (x.getGenero() == genero) {
				buscaGenero.add(x);
			}
		}
		return buscaGenero;
	}

	public List<Title> buscaPorAno(Integer ano) {
		List<Title> buscaAno = new ArrayList<>();
		for (Title x : title) {
			if (x.getAnoLancamento() == ano) {
				buscaAno.add(x);
			}
		}
		return buscaAno;
	}
	
	
}
