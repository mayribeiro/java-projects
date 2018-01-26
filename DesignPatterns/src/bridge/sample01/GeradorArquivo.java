package bridge.sample01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private PosProcessador processador;
	
	public void setProcessador(PosProcessador processador) {
		this.processador = processador;
	}
	
	public final void gerarArquivo(String nome, Map<String, Pessoa> propriedades) throws IOException {
		
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		bytes = processar(bytes);
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}

	protected byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}

	protected abstract String gerarConteudo(Map<String, Pessoa> propriedades);

}
