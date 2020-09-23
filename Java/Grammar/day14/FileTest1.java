package day14;

import java.io.File;
import java.util.Scanner;
public class FileTest1 {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
	  System.out.println("생성하려는 디렉토리명을 작성하세요 : ");
	  String dirName = scan.nextLine();
	  File f = new File(dirName);
      if(f.exists()) {
    	  System.out.println(dirName + "명의 디렉토리가 존재합니다.");
      } else {
    	  if(f.mkdirs()) { // mrdir은 바로 밑의 레벨 디렉토리만 만듬
    		  //mkdirs 는 하위 n개의 디렉토리 만들 수 있음.
    		  System.out.println(dirName + "명의 디렉토리가 생성되었습니다.");
    	  } else {
    		  System.out.println(dirName + "명의 디렉토리 생성에 실패했습니다.");
    	  }
      }
      scan.close();	     
    }
}
