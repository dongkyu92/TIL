/*package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}

		try (FileWriter writer = new FileWriter("c:/iotest/sample_yyyy_mm_dd.txt", true);
				FileReader reader = new FileReader("c:/iotest/sample_yyyy_mm_dd.txt");
				BufferedReader br = new BufferedReader(reader);
		FileOutputStream fos = new FileOutputStream("c:/iotest/sample_yyyy_mm_dd.txt");)// try catch with resource
		{
		 writer.append(fos.toString());
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);


			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}*/
package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyExam {

	public static void main(String args[]) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			String path = "C:/iotest";
	        
			File isDir = new File(path);
	        if (!isDir.exists()) {
	        	isDir.mkdirs();
	        }
			
			fr = new FileReader(path+"/sample.txt");
			BufferedReader br = new BufferedReader(fr);
			LocalDate currentDate = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			fw = new FileWriter(path+"/"+currentDate.format(formatter)+".txt",true);
			String data = "";
			while (true) {
				data = br.readLine();
				if(data == null)
					break;
				fw.write(data+"\r\n");			
			}
		}catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : "+e.getMessage());
		}  finally {
			try {
				if (fw != null) 
					fw.close();
				if (fr != null) 
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}

/*
package day15;

import java.io.*;
import java.util.*;

public class CopyExam {

	public static void main(String[] args) {
		FileReader reader=null;
		FileWriter writer=null;
		try {
			GregorianCalendar gc=new GregorianCalendar();
			reader=new FileReader("C:/iotest/sample.txt");
			int data=0;
			char ch=0;
			String address=String.format("C:/iotest/sample_%d_%d_%d.txt",gc.get(Calendar.YEAR),gc.get(Calendar.MONTH),gc.get(Calendar.DATE));
			System.out.println(address);
			writer=new FileWriter(address);
			while(true) {
				data=reader.read();
				if(data==-1) {
					break;
				}
				ch=(char) data;
				writer.write(ch);
			}
			System.out.println("저장 완료되었습니다.");
		}catch (FileNotFoundException fnfe) {
			System.out.println("처리하는 동안 오류가 발생했습니다.");
	    }catch (IOException ioe) {
	    	System.out.println("처리하는 동안 오류가 발생했습니다.");
	    }finally {
	    	try {
	    		if(writer!=null) {
	    			writer.close();
	    		}
	    	}catch(Exception e) {
	    		System.out.println("처리하는 동안 오류가 발생했습니다.");
	    	}
	    }
		
	}

}
*/