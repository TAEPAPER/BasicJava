
public class SutdaCard {
	
	int num;
	boolean isKwang;
	
	//생성자 만들기
	 SutdaCard(){
		 this(1,true);
	 }
	 
  SutdaCard(int num, boolean isKwang ){
			this.num = num;
	this.isKwang = isKwang;
	
	 }
	
  
  
  String info() {
	 return num+(isKwang?"k":"");  //isKwang이 트루이니?그러면 k를 출력 아니면 아무것도 출력하지마
  }
  

  
  
  
 
  
	 
}
