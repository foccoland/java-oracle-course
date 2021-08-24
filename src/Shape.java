public interface Shape {
	void draw();
	
	//void draw(); // public + abstract
	//public void draw(); // public + abstract
	//abstract void draw(); // public + abstract
	//public abstract void draw(); // public + abstract
	
	//void default draw(); // ERRATO
	//default void draw(); // ERRATO
	//private void draw(); // ERRATO
	//final void draw(); // ERRATO

	//default void draw() {}; public + NO abstract (da implementare)
	//public default void draw() {}; public + NO abstract (da implementare)
	
	//abstract void draw(); // public + abstract
	//public abstract void draw(); // public + abstract
	
	// NON vanno bene i seguenti modificatori d'accesso:
	// static, final, private, protected
}

// + interfacce in stesso file se non sono public
interface AltreInterfaccia {}

//+ classi in stesso file se non sono public
abstract class AbstractShape {}
class AnotherClass {}
	
class Circle implements Shape {
	
	public Circle() {}
	
	@Override
	public void draw() {
		System.out.println("Draw!");
	}
}