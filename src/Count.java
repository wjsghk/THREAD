
public class Count extends Thread {

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
		super.run();//source->오버라이드 임플리먼트 메소드->run 클릭
	}

}
