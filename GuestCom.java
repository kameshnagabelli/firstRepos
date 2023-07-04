package opps.com;

import java.util.Scanner;

public class GuestCom {

	
public void read() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("guest only accesble to read");
	System.out.println("please eneter ur age");
	int number;
	number=scanner.nextInt();
	scanner.close();
	if(number>18) {
		System.out.println("your an adulut");
	}else {
		System.out.println("your minor");
	}
}
	
}
		
	
	

	



