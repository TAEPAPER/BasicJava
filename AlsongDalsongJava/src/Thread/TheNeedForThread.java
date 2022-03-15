package Thread;

class SMIFileThread extends Thread{
	@Override
	public void run() {
	
	
	String[] strArray = {"하나","둘","셋","넷","다섯"};
	try {Thread.sleep(200);}catch(InterruptedException e) {
	};
	
	for(int i = 0; i<strArray.length; i++) {
		System.out.println("-(자막번호)"+strArray[i]);
		try {Thread.sleep(200);}catch(InterruptedException e) {
		};
	}
	
	
	}
}

public class TheNeedForThread {

	public static void main(String[] args) {
		
	Thread smiFileThread  = new SMIFileThread();
	smiFileThread.start();
	
	int[] intArray = {1,2,3,4,5};
	
	for(int i = 0; i<intArray.length; i++) {
		System.out.println("(비디오프레임)"+);
	}
		
		
		

	}

}
