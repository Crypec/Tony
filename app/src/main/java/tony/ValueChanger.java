package tony;

public class ValueChanger{

	public static void passPrimitiveType(int f){
		f = 3;
	}

	public static void passReferenceType(Value f){
		f.x = 3;
	}
}

