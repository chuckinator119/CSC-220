public class Lesson5{
	//main, create objects within the main
	public static void main(String[] args){
		aircraft pipersaratoga = new aircraft(4, 140, 56.5,9.5);
		aircraft cessna172 = new aircraft(6,201,102.5,20.5);

		//a lot of variables to have in the main
		//constructors elliminate the need to have these
	
		System.out.println("test"+ cessna172.seats);

		
	cessna172.setSeats(7);

	}
}

	//aircraft class
	class aircraft{
		//java assumes public is used of no specification 

		public int airspeed;
		double fuelcapacity;
		public int seats;
		double fuelburnrate;
		//constructor looks like method but not really a method
		//no return type 
		//makes it look a lot cleaner
		aircraft(int a, int b, double f, double fbr){
			seats = b;
			fuelcapacity = f;
			airspeed = a;
			fuelburnrate = fbr;
		}
		//method
		double calculateEndurance(){
			double endurance;
			endurance = fuelcapacity/fuelburnrate;
			return endurance;
			//new method will take parameter 
		}
		//method
		double fuelNeeded(double time){
			return fuelburnrate * time;
		//method 

		void setSeats(int S) {
			if ((S>0) && (S<=10))
			{
			seats = S;
			System.out.print("New seat # = "+ seats);
			}
			else System.out.println("error setting passengers");
		}
		}
		
	//instantiate variables within the aircraft class

}