package Cook;

public class Customer implements Runnable {
//¼Õ´Ô
	
	private Table table;
	private String food;
	
	public Customer(Table table,String food) {
		//source->Á¦³Ê³Î ÄÁ½º·²ÅÐ À¯½Ì ÇÊµå Å¬¸¯
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
            table.remove(food);//¼Õ´ÔÀÌ À½½ÄÀ» ¸Ô¾ú´Ù
           	System.out.println(name + " ate " + food);
	}
}
}
