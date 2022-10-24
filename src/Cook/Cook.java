package Cook;

public class Cook implements Runnable{
//요리사
	private Table table;
	
	public Cook(Table table) {//source->제너널 컨스럴털 유싱 필드 클릭
		super();
		this.table = table;
        	
	}
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishName());//0~2까지의 음식난수
			table.add(table.dishNames[idx]);//요리사가 테이블에 음식을 만드는 코드
            try {
            	Thread.sleep(10);
            }catch(InterruptedException e) {
            	e.printStackTrace();
            }
		}
	}

}
