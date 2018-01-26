package bridge.sample01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeradorDemo {
	
	public static void main(String[] args) {
	
		GeradorArquivo geradorArquivo = new GeradorXMLCompactado();
		
		Map<String, Pessoa > propriedades = new HashMap<>();
		propriedades.put("p1", new Pessoa("maycon", "ribeiro"));
		propriedades.put("p2", new Pessoa("augusto", "ribeiro"));
		propriedades.put("p3", new Pessoa("marcos", "antonio"));
		
		try {
			geradorArquivo.gerarArquivo("familia.xml", propriedades);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		geradorArquivo = new GeradorPropriedadesCriptografado(5);
		
		try {
			geradorArquivo.gerarArquivo("familia.properties", propriedades);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
