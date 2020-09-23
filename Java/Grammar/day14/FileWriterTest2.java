package day14;
import java.io.*;
public class FileWriterTest2 {
    public static void main(String args[]) {      
        try (FileWriter  writer = new FileWriter("c:/iotest/output2.txt");){         
        	// 자바5부터 객체생성을 try() 괄호 안에다가 할 수 있도록 변경하였음.
        	// 이러면 트라이 캐치 후 중괄호안에있늑 거 자동으로 close 수행됨.
        	// db연동시 편함.
            char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write('\n');
            writer.write(arr);
            writer.write('\n');
            writer.write("OCJP 시험 대비!!");
            writer.write('\n');  
            System.out.println("파일에 출력 완료!!");
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        } 
    }
}
