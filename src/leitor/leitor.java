package leitor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class leitor {
 public static void main(String[] args) {
	try {
		
		 FileInputStream   arquivo= new FileInputStream("arquivo2.txt");
		 //// FileOutputStream você cria para que o arquivo pra que  seja lido 
		 InputStreamReader input= new InputStreamReader(arquivo);
		 // vai ler o arquivo do objeto arquivo 
		 BufferedReader    buffer= new BufferedReader(input);
		 // le linha por linha ate encontar o br n que fim de linha 
		 // leitura modifica que vai dar linha por linha 
		 String linha;
		 do {
			linha= buffer.readLine();
			if(linha!=null) {
				String [] plavras= linha.split(":");
				System.out.println("Nova linha--------------------");
				for (int i = 0; i < plavras.length; i++) {
					System.err.println("Palavra lida="+ plavras[i]);
				}
			}
		 } while(linha!= null);
			 
	} catch (Exception e) {
		System.out.println("Erro ao ler o arquivo ");
	}
}
}

