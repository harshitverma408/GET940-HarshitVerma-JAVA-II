

public class Banking {
	
	public static void main(String[] args) {
				System.out.println("Welcome to banking \n=====================");
				BankAccount b = new BankAccount(1234, "Harshit", 10000d);
				b.setBankName("Canara Bank");
				b.displayAccount();	
				System.out.println("====================");
				
				BankAccount b2 = new BankAccount();
				b2.displayAccount();
			}
		}

class BankAccount
	{	
		static String bankName;
		int accountNo;
		String accountPassword;
		double accountBalance;
		
		BankAccount(){
		
		}
		BankAccount(int accountNo, String accountPassword, double accountBalance) {
			this.accountNo = accountNo;
			this.accountPassword = accountPassword;
			this.accountBalance = accountBalance;
		}

		void setBankAccount(int acno, String pass, double bal) {
			accountNo = acno;
			accountPassword = pass;
			accountBalance = bal;
		}
		
		void displayAccount() {
			System.out.println("Acc number = "+accountNo);
			System.out.println("Bank name = " +bankName);
			System.out.println("Acc balance = "+accountBalance);
		}
		
		void setBankName(String bname) {
			bankName = bname;
		}
		
	}