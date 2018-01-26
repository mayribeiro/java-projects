package factorymethod.sample05;

public class DocumentoFactory {

	private static final String PDF = "PDF";
	private static final String PPT = "PPT";
	private static final String DOC = "DOC";

	public Documento getDocumento(String docType) {
		
		switch (docType) {
		case DOC:
			return new DOC();
		case PPT:
			return new PPT();
		case PDF:
			return new PDF();
		default:
			break;
		}

		return null;
	}
}
