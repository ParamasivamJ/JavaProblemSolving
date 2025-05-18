package oops;

//multiplicity-- one to many Relationship
public class CarDriver {

	public static void main(String[] args) {
		Car car=new Car("ABC","White");
		car.tyres[0]=new Tyre("MRF","4000");
		car.tyres[1]=new Tyre("MRF","4000");
		car.tyres[2]=new Tyre("MRF","4000");
		car.tyres[3]=new Tyre("MRF","4000");
		
		System.out.println("Brand:"+car.brand);
		System.out.println("Color:"+car.color);
		System.out.println("TyreBrand:"+car.tyres[0].brand);
	}

}
