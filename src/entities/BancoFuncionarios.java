package entities;

public class BancoFuncionarios {

	private int id;
	private String nome;
	private double salario;

	public BancoFuncionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void aumento(double porcentagem) {
		this.salario += salario * porcentagem / 100;

	}

	public String toString() {
		return "#"+ id + ", " + nome + ", R$" + String.format("%.2f", salario);
	}

}