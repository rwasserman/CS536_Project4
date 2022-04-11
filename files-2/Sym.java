import java.util.LinkedList;

public class Sym {
	private String type;
	private int numParams;
	
	//Constructor
	public Sym(String type) {
		this.type = type;
	}

	//Overloaded Constructor for structs
	public Sym(String type, int numParams) {
		this.type = type;
		this.numParams = numParams;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		return;
	}

	public int getNumParams() {
		return numParams;
	}

	public void setNumParams(int numParams) {
		this.numParams = numParams;
		return;
	}
	
	public String toString() {
		return type;
	}
}

class SymStruct extends Sym {

		private LinkedList<String> variables = new LinkedList<>();
		private SymTable table;
		private int numParams;

		public SymStruct(String type, int numParams) {
			super(type);
			this.variables = new LinkedList<String>();
			this.table = new SymTable();
			this.numParams = numParams;

		}

		public LinkedList<String> getVariablesFromSymStruct() {
			return variables;
		}

		public String getSpecificVariableFromSymStruct(int index) {
			return variables.get(index);
		}

		public String getFirstVariableFromSymStruct() {
			return variables.getFirst();
		}

		public int getNumParamsFromSymStruct() {
			return this.numParams;
		}

		public SymTable getSymTableFromSymStruct() {
			return table;
		}

	}
	
	


