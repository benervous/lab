package time;
import static java.lang.System.out;
public class Time {
int hours;
int minutes;
int seconds;

public void display() {
	out.println("You have entered "+hours+" hours, "
+ minutes +" minutes, "+ seconds + " seconds." + "\n" );
}
public int HtoS(int h) {
	return h*3600;	
}
public int MtoS(int m) {
	return m*60;
}
public int Diff(int s1, int s2) {
	return s1 - s2;
	
}


}
