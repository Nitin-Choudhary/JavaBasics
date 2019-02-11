package AbstractionConcept;

public interface Car {
	
	int wheel = 4;
	public void stop();
	public void start();
	public void refule();
		
}
//in interface we always define abstract method. abstract method mean no body.
//we achieve 100% abstraction
//Cannot create object of interface
//in interface only final and static variable defined.