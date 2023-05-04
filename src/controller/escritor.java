package controller;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class escritor {

	public static void main(String[] args) {
		// parte de escritura ou leitura temde estar em bloco de tratamento.
		// alguns tipos de exceção deve estar nesses blocos.
		try {
			FileOutputStream arquivo= new FileOutputStream("arquivo2.txt");
			// PrintWrite  imprime o arquivo 
			// FileOutputStream você cria para que o arquivo pra que  seja escrito 
			PrintWriter print= new PrintWriter(arquivo);
			// o printWriter ele quer que alguem escreva nesse arquivo aberto para poder gravar coisas
			for( int i=1; i<=3; i++) {
			print.println("linha "+ i +" coluna"+ i);
		
			}
		print.close();
		arquivo.close();
		} catch (Exception e) {
			System.out.println("Erro ao escrever o arquivo");
		}
	}
	}

