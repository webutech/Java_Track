import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class SecondApproach {

	public static void main(String[] args) throws IOException {
		int id;
		String name;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		id=Integer.parseInt(br.readLine());
		
		System.out.println("Enter name");
		name=br.readLine();
		
		System.out.println(id+" , "+name);
		
		

	}

}
