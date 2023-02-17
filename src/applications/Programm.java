package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programm {
	
	public static void main( String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Pessoa> list = new ArrayList<>();
		
		
		System.out.println("Entre com o números de pagantes de impostos: ");
		int n = sc.nextInt();
		
		for (int i= 1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.println("Pessoa física ou juridica (f/j)?:");
			char fj = sc.next().charAt(0);
			System.out.println("Tax payer #"+i+" data: ");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (fj =='f') {
				System.out.println("Gasto com despesas médicas: ");
				double despesasmedicas = sc.nextDouble();
				Pessoa pessoa = new PessoaFisica(name, rendaAnual, despesasmedicas);
				list.add(pessoa);
			}
			else {
				System.out.println("Quantidade de funcionários: ");
				int qfuncionarios = sc.nextInt();
				Pessoa pessoa = new PessoaJuridica(name, rendaAnual, qfuncionarios);
				list.add(pessoa);
				
			}
			
			
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		
		double impostoTotal = 0.0;
		
		for(Pessoa p: list) {
			System.out.println(p.getNome()+": $ "+ String.format("%.2f",  p.iR()));
			impostoTotal += p.iR();
		}
		
		System.out.println();
		System.out.println("IMPOSTOS TOTAIS: $"+String.format("%.2f", impostoTotal));
		
		
		
		
		
		sc.close();
	}

}
