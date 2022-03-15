package g_oop2;
	


public class SampleChild extends SampleParent{

	void childMethod() {
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);//상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드
		
		
	}
	
	//오버라이딩 - 상속받은 메서드의 변화가 필요한 경우에 (메서드 내용을 바꾸고 싶을 때)
	//super,super() (부모클래스의 멤버와 자식클래스의 멤버가 똑같을 때 구분을 하기 위해 사용함(this와 비슷) (super()는 자식 클래스에서 부모클래스를 호출할때
	//다형성 (다양한 형태를 가질 수 있는 성질)- 부모타입의 변수로 자식타입의 객체를 사용한다 
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것 //이게 오버라이드가 맞는지 아닌지 체크해주는 역할
	int method(int a,int b) {
		return a*b;   //*****선언하는 부분은 부모와 같아야함******
	 }
	
	//super, super()
	int var; //그냥 선언만 해서 디폴트 값 '0'!!
	void test(double var) {
		System.out.println(var);//지역변수 //기본적으로 지역변수가 들어감
		System.out.println(this.var);//인스턴스 변수
		System.out.println(super.var);//부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다
		
		
		
	}
	
	SampleChild(){//생성자
//		this(); //같은 클래스내의 다른 생성자를 호출하는 것 //둘다 생성자 안에서 가장 첫줄에 사용할 수 있다 //동시에 사용할 수 없다 
		super(); //부모클래스의 생성자 호출
		//this()가 없는 생성자에서만 super()를 호출한다.
		
		
	}
	
	//다형성 : 부모타입의 변수로 자식타입의 객체를 사용하는 것  --이번에 게임 과제(히어르들의 이름 능력치 등을 설정할 때 사용하자!)
		public static void main(String[] args) {
			
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); //자식 객체를 부모변수에 넣어서 사용함
		//변수(부모)의 타입에 있는 멤버만 사용할 수 있다
		System.out.println(sp.var);
		sp.method(10, 20);
		
		System.out.println(sc.var);
		
		
		
		
		
	//객체(자식)의 타입에 있는 멤버는 사용할 수 없다
	//	sp.childMethod();사용불가
	//	sp.test(); 사용불가
	
		
	}
	
}
