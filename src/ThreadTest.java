import javax.swing.JOptionPane;
public class ThreadTest {
	public static void main(String[] args) {
		//���α׷��� ��ġ�ϸ� �����̵ǰ� ���μ������ �ϸ�(������,���ǵ��,���ӵ��)
		//������ �� ���α׷��� �������� ������ �Ǵ°�(��Ƽ������=��Ƽ�½�ŷ)
		//exī�� ���Ϻ����鼭 �̸�Ƽ�� ������ ���
		//��� ���α׷��� �⺻������ �����尡 ���۵ȴ�.(�ּ�1���̻��� �����尡 �ִ�)
		//������ ����� ��� 1.ThreadŬ������ ���  2.Runnable�������̽� ���
		
//		for(int i=0;i<10;i++){
//			System.out.println(i);
//		}
//		for(int j=0;j<10;j++) {
//			System.out.println(j);//0~9 0~9
//		}	
	
		
		//count Ŭ���� ����
//      //ThreadŬ������ ��� �������
//		Count cnt =new Count();
//		cnt.start();//start�� ����ϸ鼭 ī��Ʈ Ŭ������ ȣ���Ѵ�.  
		
		
		//count2 Ŭ���� ����
		//Runnable �������̽��� ��ӹ��� ���
//		Runnable r = new Count2();
//		//'Count2 cnt2 = new Count2();' �̷��� �ᵵ �ȴ�
//		Thread cnt2 = new Thread(r);
//		cnt2.start();		
//		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է�");
//		System.out.println("�Է°���" + input + "�Դϴ�.");
		
		
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);//�����带 �ѹ��� �ݺ��ɶ� 1�ʿ� �ѹ��� �����ϴ� �ڵ�
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}//10�Է½� 1�ʿ� �ѹ��� 9,8,7...0�� �ڵ����� ��µȴ�.
		
		
		//Threadex5����
//        Threadex5 th = new Threadex5();
//        th.start();
//        
//		for(int i=0;i<500;i++) {
//				System.out.print("-");//---|||���ÿ� �����̵ȴ�
//			}
		
		//Thread6����//������ 4���� �����ϰ� �ִ�
		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			//���� �ڽ��� ȣ���ϴ� �����带 sleep�Ѵ�.(�Ͻ������Ѵٴ� ��)
			th1.suspend();//2�� �� th1�� �����带 �Ͻ������Ѵ�.//* ����� �ȵȴ�.
			Thread.sleep(1000);//1��
			th2.suspend();//3�� �� th2�� �����带 �Ͻ������Ѵ�.//** ����� �ȵȴ�.
			Thread.sleep(3000);//3��
			th1.resume(); //6�� �� �����带 ������·� ����Ѵ�
			Thread.sleep(3000);
		    th2.resume();//9���� ������ ���� �Ǹ鼭 ����Ѵ�
		    Thread.sleep(3000);
		    th1.stop();
		    th2.stop();//'*or**'�� �������� �ȳ����Եȴ�.
		}catch(InterruptedException e) {
            e.printStackTrace();
		}//1�ʿ� �ѹ��� *,**,*** �������� ��� ����ȴ�
			
	}

}
