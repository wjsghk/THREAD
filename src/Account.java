import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private int balance =1000;
	       //synchronized : ��״� ����(Lock)
	public /*synchronized*/ void withdraw(int money) {
		synchronized(this) {//����ȭó�� : ������ ���Ѽ� ����ϰ� �ȴ�.<= �����尡 �������� ��µ�����
		if(balance >= money) {
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;//�����Ǵ� �ڵ�
		}
	}
	
}
}



