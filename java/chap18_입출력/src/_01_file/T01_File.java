package _01_file;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		// java.io.File 클래스
		
		
		try {
			// 1.경로를 지정하지 않은 상태에서 파일 생성 : project하위에 만들어짐
			File f1 = new File("test.txt");
			f1.createNewFile();  // 메소드까지 실행해야 실제 파일이 생성된다.
			System.out.println("파일의 절대 경로 : " + f1.getAbsolutePath());
			
			// 2. 경로 지정하여 파일 생성
			// File f2 = new File("D:\\test2.txt");
			File f2 = new File("C:/Users/tj/test.txt");
			f2.createNewFile();
			
			// 3. 폴더를 생성하고 파일까지 생성
			File tempFolder = new File("C:/temp");
			tempFolder.mkdir();
			
			File f3 = new File("C:/temp/test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()); // f1파일은 존재하는가? = true
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			System.out.println("파일명 : " + f3.getName());
			System.out.println("절대경로 : " + f3.getAbsolutePath());
			System.out.println("파일의 용량 : " + f3.length());
			System.out.println("상위 폴더 : " + f3.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		
		
		
		
		
		
		
		
		
		
	}

}
