package Test1;

abstract class Vehicle
{
	int tyres;
	abstract void start();
}

class Car extends Vehicle{
	void start() 
	{
		System.out.println("Start with keys");
		
	}
	public static void main(String[] arg) 
	{
		Car c = new Car();
		c.start();
		
	}
}
