package lista;

import javax.swing.JOptionPane;

/*3) Crie um programa que leia o nome e o salário de um funcionário,
mostrando no final uma mensagem.
Ex: Nome do Funcionário: Maria do Carmo Salário: 1850,45 O funcionário
Maria do Carmo tem um salário de R$1850,45 em Junho.*/



public class Ex3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));
		
		JOptionPane.showMessageDialog(null, "Nome do funcionário: " + nome + 
				         "\nSalário do funcionário: R$ " + salario);
		
		
	}

}
    
