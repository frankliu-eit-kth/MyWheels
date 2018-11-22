package basics;
import java.util.Random;

public class GenerateRandomInt {
	public static int randomInt(int min,int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
