package vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle mb = new Motobike();
		System.out.println("This vehicle has speed "+ mb.speed()+" km/h, there are " +mb.wheels()+" wheels and ");
		mb.Testdoors();
		
		Vehicle mp = new Moped();
		System.out.println("This vehicle has speed "+ mp.speed()+" km/h, there are " +mp.wheels()+" wheels and ");
		mp.Testdoors();
		
		Vehicle car = new Car();
		System.out.println("This vehicle has speed "+ car.speed()+" km/h, there are " +car.wheels()+" wheels and ");
		car.Testdoors();
		
		Vehicle tr = new Train();
		System.out.println("This vehicle has speed "+ tr.speed()+" km/h, there are " +tr.wheels()+" wheels and ");
		tr.Testdoors();

	}

}
