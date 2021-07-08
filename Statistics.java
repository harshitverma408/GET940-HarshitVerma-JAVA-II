import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		
		int six = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int zero = 0;
		int total_runs=0;
		
		
		for(int i=0;i<30;i++) {
			int run = sc.nextInt();
			switch(run) {
			case 0: 
				zero++;
				break;
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 6:
				six++;
				break;
			}
			total_runs = total_runs+run;
			
		}
		
		
		System.out.println("Six : "+six+"\nOne : "+one+"\nTwo : "+two+"\nThree : "+three+ "\nFour : " +four+"\nZeros : "+zero);
		System.out.println("Total runs : "+total_runs);
		System.out.println("Strike rate : "+(total_runs/30f)+" runs per ball");
		
	}
	}
}
