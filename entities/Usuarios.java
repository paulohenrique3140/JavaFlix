package entities;

public class Usuarios {
	private static int sequence = 0;
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	
	public Usuarios() {
		
	}
	
	public Usuarios(String nome, int idade, String email) {
		this.id = sequence++;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("\nId de usuario: %d | Nome: %s | Idade: %d | E-mail: %s\n", id, nome, idade, email);
	}
	
	
	
	
	
	
}
