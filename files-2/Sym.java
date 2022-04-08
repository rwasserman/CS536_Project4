public class Sym {
	private String type;
	private String kind;
	private int numParams;
	
	//Constructor
	public Sym(String type) {
		this.type = type;
	}

	//Overloaded Constructor
	public Sym(String type, String kind, int numParams) {
		this.type = type;
		this.kind = kind;
		this.numParams = numParams;
	}
	
	public String getType() {
		return type;
	}

	public String getKind() {
		return kind;
	}

	public int getNumParams() {
		return numParams;
	}
	
	public String toString() {
		return type;
	}
}

