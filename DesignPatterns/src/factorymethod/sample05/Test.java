package factorymethod.sample05;

public class Test {

	public static void main(String[] args) {
		
		DocumentoFactory documentoFactory = new DocumentoFactory();
		
		Documento doc = documentoFactory.getDocumento("DOC");
		doc.print();
		
		Documento ppt = documentoFactory.getDocumento("PPT");
		ppt.print();
		
		Documento pdf = documentoFactory.getDocumento("PDF");
		pdf.print();
	}
}
