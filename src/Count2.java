
public class Count2 implements Runnable {//클래스 생성할때 인터페이스 부분에 add 클릭

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//스레드를 한번씩 반복될때 1초에 한번씩 제어하는 코드
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
