package day14;

import java.io.*;
public class FileReaderTest {
    public static void main(String args[]) {
       FileReader reader = null;
       try {
           reader = new FileReader("c:/iotest/output.txt");
           while (true) {
               int data = reader.read();
               if (data == -1)
                   break;
               char ch = (char) data;
               System.out.print(ch);
           }
       } catch (FileNotFoundException fnfe) {
           System.out.println("파일이 존재하지 않습니다.");
       } catch (IOException ioe) {
           System.out.println("파일을 읽을 수 없습니다.");
       } finally {
          try {
        	  if(reader !=null)// 파일리더 객체가 생성되지 않은것임.
               reader.close();
          } catch (Exception e) {
        	  e.printStackTrace();
          }
       }
    }
}




