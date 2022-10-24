package Cook;
import java.util.ArrayList;

public class Table {
	String[]dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6; //������ ������ 6���� �����ص�
	
	private ArrayList<String> dishes = new ArrayList<String>();//���� ��Ȱ�� ������� �÷��� ����
	//"notify or wait "�� ��� �� ��� =>synchronized�� ����ؾ��ϰ�  ������� ����Ѵ�
	public synchronized void add(String dish) {//�丮�簡 ���� ����� ���ÿ� ������ �߰��ϴ�  �뵵
		while(dishes.size()>= MAX_FOOD) {
			String name =Thread.currentThread().getName();
			//Dishes : [donut, donut, donut, donut, donut, donut]
			//������ MAC�� �� =>Cook1 is waiting ���´�
			System.out.println(name + " is waiting");
			try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		dishes.add(dish);
		notify();//���������
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public synchronized void remove(String dishName) {//���� ������ �Դ´� (=������ �Ծ��� �� ���ø� ���ش�.)
		String name = Thread.currentThread().getName();
		
		while(dishes.size()==0) {
			System.out.println(name + " is waiting");
			
			try {
			wait();
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		while(true) {
			for(int i= 0; i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
				    notify();
				    return;
				}
			}
			
			try {
				System.out.println(name + "is waiting");
		        wait();
			    Thread.sleep(500);
		    }catch(InterruptedException e) {
			   e.printStackTrace();
		    }
		}
	}
	
	public int dishName() {
		return dishNames.length;
	}
}
