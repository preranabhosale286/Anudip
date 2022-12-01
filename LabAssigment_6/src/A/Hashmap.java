package A;
	public class Hashmap {
		//define private data member
			private String acconted_name;
			private long account_balance;
			
			//getter method of acconted_name
			public String getAcconted_name()
			{
				return acconted_name;
			}
			
			//setter method of acconted_name
			public void setAcconted_name(String acconted_name) 
			{
				this.acconted_name = acconted_name;
			}
			public long getAccount_balance()
			{
				return account_balance;
			}
			public void setAccount_balance(long account_balance)
			{
				this.account_balance = account_balance;
			}
			public void deposite()
			{
				long amt=5000;
				account_balance=account_balance+amt;
				System.out.println("Account Balance after Deposite:"+account_balance);
				
			}
			
			//withdraw() method to withdraw amount from account_balance
			public void withdraw()
			{
				long amt=2000;
				account_balance=account_balance-amt;
				System.out.println("Account Balance after withdraw:"+account_balance);
			}
			

		}

