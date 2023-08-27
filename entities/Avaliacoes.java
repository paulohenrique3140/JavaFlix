package entities;

public class Avaliacoes {
	private int usuario;
	private double nota;
	
	public Avaliacoes(int usuario, double nota) {
		this.usuario = usuario;
		this.nota = nota;
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
	
}
