package basics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadWriteTxt {

	public static void main(String args[]){
		// TODO Auto-generated constructor stub
		String pathname = "D:\\twitter\\13_9_6\\dataset\\en\\input.txt"; 
		File filename = new File(pathname); 
		InputStreamReader reader=null;
		try {
			reader = new InputStreamReader(new FileInputStream(filename)); 
			BufferedReader br = new BufferedReader( reader); 
			String line = "";
			line = br.readLine();
			while (line != null) {
			line = br.readLine(); // 一次读入一行数�?�
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
		File writename = new File(".\\result\\en\\output.txt"); // 相对路径，如果没有则�?建立一个新的output。txt文件
		writename.createNewFile(); // 创建新文件
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		out.write("我会写入文件啦\r\n"); // \r\n�?�为�?�行
		out.flush(); // 把缓存区内容压入文件
		out.close(); // 最�?�记得关闭文件
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// write at the end without erasing   FileWriter(file name, true) 第二个�?�数为append param
		BufferedWriter out = new BufferedWriter(new FileWriter(file,true));

	}

}
