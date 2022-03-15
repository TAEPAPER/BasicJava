package EndOfTheEarth;

public class RandomThread extends Thread{
@Override
public void run() {
	String [] heroArray = {"친절한 이웃 스파이더맨🕸️","닥터스트레인지۞","캡틴아메리카⍟","아이언맨⎊","헐크✇","토르ϟ","호크아이➳","완다ᗢ",
			"앤트맨꘩","팔콘⩔"};
	
	for(int i =0; i<heroArray.length; i++) {
		System.out.println("  "+heroArray[i]);
		try {Thread.sleep(300);}catch(InterruptedException e) {}
	}
	
	
	}
	




}
	
	
	

