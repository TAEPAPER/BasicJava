package g_oop2;

public class Time {
	private int hour;
	private int minute;
	private int second;

	@Override
	public String toString() { // 문자열로 해야할 상황에서 자동으로 호출
		return hour + ":" + minute + ":" + second;
	}

	public int getHour() { // get:변수의 값을 얻기위한 //변수에서는 잘못된 것을 막을 수 없지만 메서드는 로직을 통해서 막을 수 있다

		return hour;
	}

	public void setHour(int hour) { // set:변수의 값을 저장하기 위한
		if (hour < 0) {
			this.hour = 0;

		} else if (23 < hour) {
			this.hour = 23;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0) {
			this.minute = 0;
		} else if (minute > 59) {
			this.minute = 59;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			this.second = 0;
		} else if (59 < second) {
			this.second = 59;
		} else {
			this.second = second;
		}
	}
	
	void clock() {
		while(true) { //무한반복문 (1초씩 증가하면서 출력)
			System.out.println(toString());
			stop();
			setSecond(second +1);
		}
	}
private	void stop() {//파라미터로 넘긴 만큼 프로그램을 멈출 수 있음  //다른 클래스에서는 사용할 필요가 없기때문에 private을 앞에 써준다!
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	
	
}
