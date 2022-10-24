package Cook;

public class Customer implements Runnable {
//�մ�
	
	private Table table;
	private String food;
	
	public Customer(Table table,String food) {
		//source->���ʳ� �������� ���� �ʵ� Ŭ��
		super();
		this.table = table;
        this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
            try {
            	Thread.sleep(100);
            	
            }catch(InterruptedException e) {
            	e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            table.remove(food);//�մ��� ������ �Ծ���
           	System.out.println(name + " ate " + food);
	}
}
}
