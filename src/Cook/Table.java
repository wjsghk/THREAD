package Cook;
import java.util.ArrayList;

public class Table {
	String[]dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6; //음식의 개수는 6개로 설정해둠
	
	private ArrayList<String> dishes = new ArrayList<String>();//접시 역활로 만들어진 컬렉션 변수
	//"notify or wait "를 사용 할 경우 =>synchronized를 사용해야하고  순서대로 출력한다
	public synchronized void add(String dish) {//요리사가 음식 만들고 접시에 음식을 추가하는  용도
		while(dishes.size()>= MAX_FOOD) {
			String name =Thread.currentThread().getName();
			//Dishes : [donut, donut, donut, donut, donut, donut]
			//음식이 MAC일 때 =>Cook1 is waiting 나온다
			System.out.println(name + " is waiting");
			try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		dishes.add(dish);
		notify();//실행대기상태
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public synchronized void remove(String dishName) {//고객이 음식을 먹는다 (=음식을 먹었을 때 접시를 빼준다.)
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
