
public class AccountHolder implements Runnable {
	//돈 찾는 사람 클래스
	Account acc =new Account();
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random() * 3 +1)*100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());		
		}
	}
}