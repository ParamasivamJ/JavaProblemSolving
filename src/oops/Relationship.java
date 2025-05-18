package oops;

public class Relationship {
	//blue print for dependent object 
	static class Engine {
	    public void start() {
	        System.out.println("Engine started");
	    }
	}
	
	//blueprint for depending object
	static class Car {
	    private Engine engine; // Car "has-a" Engine

	    public Car() {
	        this.engine = new Engine();
	    }

	    public void startCar() {
	        engine.start();
	        System.out.println("Car started");
	    }
	}

	public static void main(String[] args) {
		Car mycar=new Car();
		mycar.startCar();
	}

}
