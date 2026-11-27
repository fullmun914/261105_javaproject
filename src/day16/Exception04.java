package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception04 {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("글자를 입력하세요");
		String name ="";
		name = br.readLine();
		System.out.println(name);
		
		ir.close();
	}

}
