package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class LocalFileController {
	
	public void makeDir(String dir) {
		new File(dir).mkdirs();
	}
	
	public File readFile(String uri) {
		return new File(uri);
	}
	
	public void deleteFile(String uri) {
		 File file = new File(uri);
	        if(file.delete()){
	            System.out.println(uri+" File deleted");
	        }else System.out.println(uri+" doesn't exists");
	}
	
	public boolean storeFile(String dirName, File file) {
		this.makeDir(dirName);
		File outFile = new File (dirName, file.getName());
		
		try {
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(outFile)) {
                FileChannel inChannel = fis.getChannel();
                FileChannel outChannel = fos.getChannel();
                inChannel.transferTo(0, inChannel.size(), outChannel);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalFileController thisController=new LocalFileController();
		File file=thisController.readFile("C:\\Software\\Java\\test directory\\test.txt");
		System.out.println(file.length());
		thisController.storeFile("C:\\Software\\Java\\test directory 1\\", file);

	}

}
