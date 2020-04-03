package time;
import static java.lang.System.out;
public class useTime {
 
	public static void main(String[] args) {
		try {
		Time time = new Time();
		time.hours = 9;
		time.minutes = 9;
		time.seconds = 9;
		time.display();
		out.println("Your hours are "+time.HtoS(time.hours)+" seconds."+"\n");
		out.println("Your minutes are "+time.MtoS(time.minutes)+" seconds."+"\n");
		out.println("Difference between hours and minutes is " +
		time.Diff(time.HtoS(time.hours), time.MtoS(time.minutes))+" seconds.");
		}
		catch (NumberFormatException e) {
			out.println("Please, enter your value in integer format");
		}

	}
 }


