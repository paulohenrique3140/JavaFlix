package entities;

public class Avaliacoes {
	private int usuario;
	private double nota;
	private String titulo;
	
	public Avaliacoes(int usuario, double nota, String titulo) {
		this.usuario = usuario;
		this.nota = nota;
		this.titulo = titulo;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
