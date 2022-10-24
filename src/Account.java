import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private int balance =1000;
	       //synchronized : 잠그는 느낌(Lock)
	public /*synchronized*/ void withdraw(int money) {
		synchronized(this) {//동기화처리 : 순서를 지켜서 사용하게 된다.<= 스레드가 무작위로 출력되지만
		if(balance >= money) {
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;//차감되는 코드
		}
	}
	
}
}



