package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.BancoFuncionarios;

public class RegistroFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<BancoFuncionarios> list = new ArrayList<>();

		System.out.println("Quantos funcionários deseja registrar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Funcionario #" + (i + 1) + ":");

			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Digite o nome do funcionário a ser registrado: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o sálario do funcionário:");
			Double salario = sc.nextDouble();

			BancoFuncionarios funcionario = new BancoFuncionarios(id, nome, salario);

			list.add(funcionario);
		}

		System.out.println("Entre com o ID do funcionário que deseja aumentar o sálario: ");
		int id = sc.nextInt();
		BancoFuncionarios funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("ID inválido");
		} else {
			System.out.println("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionario.aumento(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de funcionários");
		for (BancoFuncionarios obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

	public static boolean hasId(List<BancoFuncionarios> list, int id) {
		BancoFuncionarios funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
}
