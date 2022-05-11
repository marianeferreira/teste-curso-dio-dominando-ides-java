package first_java_project.dio;

import java.util.Objects;

public class cat {

	private String nome;
	private String cor;
	private Integer idade;

	public cat() {
		super();
	}

	public cat(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cat other = (cat) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "cat [nome=" + nome + ", cor=" + cor + ", idade=" + idade + ", getNome()=" + getNome() + ", getCor()="
				+ getCor() + ", getIdade()=" + getIdade() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	 * public cat(String nome, String cor, Integer idade) { this.nome = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
