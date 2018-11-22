package basics;
import java.io.File;

public class CreateFileFolder {

	public static void main(String args[]) {
		new File("/path/directory").mkdirs();
	}
}
