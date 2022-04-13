import java.util.ArrayList;
import java.util.LinkedList;

public class Sym {
	protected String type;
	protected int numParams;
	
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

		protected LinkedList<String> variables = new LinkedList<>();
		protected SymTable table;

		public SymStruct(String type, int numParams) {
			super(type);
			this.variables = new LinkedList<String>();
			this.table = new SymTable();
	
		}

		public LinkedList<String> getVariablesFromSymStruct() {
			return this.variables;
		}

		public String getSpecificVariableFromSymStruct(int index) {
			return this.variables.get(index);
		}

		public String getFirstVariableFromSymStruct() {
			return this.variables.getFirst();
		}

		public int getNumParamsFromSymStruct() {
			return this.numParams;
		}

		public SymTable getSymTableFromSymStruct() {
			return this.table;
		}



		public String toString() {
			return type;
		}

	}

class SymFunction extends Sym { 

	protected ArrayList<String> parameterTypes = new ArrayList<>();
	protected String returnType = new String();

	public SymFunction(String type, String returnType, ArrayList<String> parameterTypes) {
		super(type);
		this.returnType = returnType;
		this.parameterTypes = parameterTypes;
		
	}

	public ArrayList<String> getParameterTypes() {
		return this.parameterTypes;
	}

	public String getReturnType() {
		return this.returnType;
	}




}
	



