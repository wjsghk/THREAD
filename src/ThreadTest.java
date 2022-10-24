import javax.swing.JOptionPane;
public class ThreadTest {
	public static void main(String[] args) {
		//프로그램을 설치하면 실행이되고 프로세스라고 하며(동영상,음악듣기,게임등등)
		//스레드 한 프로그램에 여러개의 동작이 되는거(멀티스레드=멀티태스킹)
		//ex카톡 파일보내면서 이모티콘 보내기 등등
		//모든 프로그램은 기본적으로 스레드가 동작된다.(최소1개이상의 스레드가 있다)
		//스레드 만드는 방법 1.Thread클래스를 상속  2.Runnable인터페이스 상속
		
//		for(int i=0;i<10;i++){
//			System.out.println(i);
//		}
//		for(int j=0;j<10;j++) {
//			System.out.println(j);//0~9 0~9
//		}	
	
		
		//count 클래스 참고
//      //Thread클래스를 상속 받은경우
//		Count cnt =new Count();
//		cnt.start();//start를 사용하면서 카운트 클래스를 호출한다.  
		
		
		//count2 클래스 참고
		//Runnable 인터페이스를 상속받은 경우
//		Runnable r = new Count2();
//		//'Count2 cnt2 = new Count2();' 이렇게 써도 된다
//		Thread cnt2 = new Thread(r);
//		cnt2.start();		
//		String input = JOptionPane.showInputDialog("아무값이나 입력");
//		System.out.println("입력값은" + input + "입니다.");
		
		
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);//스레드를 한번씩 반복될때 1초에 한번씩 제어하는 코드
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}//10입력시 1초에 한번씩 9,8,7...0이 자동으로 출력된다.
		
		
		//Threadex5참고
//        Threadex5 th = new Threadex5();
//        th.start();
//        
//		for(int i=0;i<500;i++) {
//				System.out.print("-");//---|||동시에 진행이된다
//			}
		
		//Thread6참고//스레드 4개가 동작하고 있다
		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			//현재 자신을 호출하는 스레드를 sleep한다.(일시정지한다는 뜻)
			th1.suspend();//2초 후 th1의 스레드를 일시정지한다.//* 출력이 안된다.
			Thread.sleep(1000);//1초
			th2.suspend();//3초 후 th2의 스레드를 일시정지한다.//** 출력이 안된다.
			Thread.sleep(3000);//3초
			th1.resume(); //6초 후 스레드를 실행상태로 출력한다
			Thread.sleep(3000);
		    th2.resume();//9초후 스데르 실행 되면서 출력한다
		    Thread.sleep(3000);
		    th1.stop();
		    th2.stop();//'*or**'이 랜덤으로 안나오게된다.
		}catch(InterruptedException e) {
            e.printStackTrace();
		}//1초에 한번씩 *,**,*** 랜덤으로 계속 진행된다
			
	}

}
