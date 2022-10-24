package Cook;

public class Cook implements Runnable{
//�丮��
	private Table table;
	
	public Cook(Table table) {//source->���ʳ� �������� ���� �ʵ� Ŭ��
		super();
		this.table = table;
        	
	}
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishName());//0~2������ ���ĳ���
			table.add(table.dishNames[idx]);//�丮�簡 ���̺� ������ ����� �ڵ�
            try {
            	Thread.sleep(10);
            }catch(InterruptedException e) {
            	e.printStackTrace();
            }
		}
	}

}
