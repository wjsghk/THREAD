
public class Count extends Thread {

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//�����带 �ѹ��� �ݺ��ɶ� 1�ʿ� �ѹ��� �����ϴ� �ڵ�
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		super.run();//source->�������̵� ���ø���Ʈ �޼ҵ�->run Ŭ��
	}

}
