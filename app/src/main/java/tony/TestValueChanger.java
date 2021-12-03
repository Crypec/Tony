package tony;
public class TestValueChanger{

	public static void main(String [] args){
		int x = 11;
		int b = x;
		b = 14;
		x = b;

		ValueChanger.passPrimitiveType(x);
		System.out.println(x);
		x = 10;

		Value v = new Value();
		Value k = v;
		v.x = x + 3;

		ValueChanger.passReferenceType(v);
		System.out.println(v.x);
		System.out.println(k.x);

		k.x = 1;
		System.out.println(v.x);
	 }
}
