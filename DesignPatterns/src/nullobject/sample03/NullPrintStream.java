package nullobject.sample03;

import java.io.PrintStream;

public class NullPrintStream extends PrintStream {

	public NullPrintStream() {
		super(new NullOutputStream());
	}
}
