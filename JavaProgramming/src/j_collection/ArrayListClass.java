package j_collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collection Framework (다수의 데이터를 다루기 위한!) 
		 * -List-배열과 비슷하게 생김(인덱스 순서대로 데이터를 저장)
		 * -Map-데이터를 키에 저장을 한다
		 * -Set-중복된 값이 저장되지 않는다
		 * 
		 * 
		 * ArryList의 주요 메서드 --List의 자식 중 ArrayList를 쓰는 이유 : 가져오는 속도가 빠르다 
		 * -boolean add(object obj): 마지막 위치에 객체를 추가 후 성공여부를 반환한다--크기가 계속 증가 또는 감소 
		 * -void add(int index, object obj): 지정된 위치에 객체를 추가한다 --중간에 넣는 거기 때문에 한칸씩 뒤로 밀림 
		 * -object(리턴타입)set(int index, object obj) : 지정된 위치에 객체를 저장 후 **기존 객체를 반환**한다--덮어쓰기 
		 * -object get(int index) : 지정된 위치의 객체를 반환한다 
		 * -int size() : 저장된 객체의 수를 반환한다 --길이를 반환(몇개의 데이터가 저장이되었는가)
		 *  -object remove(int index) : 지정된 위치의 객체를 제거한다 --한칸씩 앞으로 댕겨짐
		 * 
		 */
		//1차원 어레이 리스트
		ArrayList sample = new ArrayList();
	
		// 타입상관없이 저장할 수 있다!
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		// 단점 : 꺼내올 때 무슨 타입인지 알기가 힘들다

		ArrayList<Integer> list = new ArrayList<Integer>(); // 제네릭 (타입을 지정)--가능하면 제네릭을 권장합니다

		list.add(10);
//		list.add("abc"); 컴파일에러 발생
		list.add(new Integer(20)); // 사용을 하려면 객체를 생성해야해 (원래는)
		/*
		 * Wrapper클래스 --기본형타입이 아니라 객체형태만 사용할 수 있을 때 사용한다 -byte : Byte    -short : Short
		 * -int : Integer 
		 * -long : Long //둘이는 자동으로 형변환이 된당 
		 * -float : Float 
		 * -double : Double 
		 *	-char : Character
		 *  -boolean : Boolean
		 * 
		 */

		System.out.println(list.add(30)); // 저장의성공여부가 반환이 된다
		System.out.println(list);

		list.add(1, 40);
		System.out.println(list); // 인덱스 지정 --원래것은 뒤로 밀려남

		// set
		int before = list.set(2, 50);   //전의 것을 반환한다
		System.out.println("before :" + before);
		System.out.println(list);

		// get
		int get = list.get(2);
		System.out.println(get);

		// size
		/*
		 * for(int i = 0; i<list.size(); i++) { list.remove(i+ ": "+ list.remove(i)); }
		 * System.out.println(list); //뒤에 있는 애들이 앞으로 댕겨지기 때문에 for문이 두번만 돌고 끝나게 된다
		 */

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + ": " + list.remove(i));
		}
		System.out.println(list); // 이렇게 해야 제대로 삭제가 된다

		// list에-100사이의 랜던값을 10개 저장해주세요

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(100) + 1);
		}
		System.out.println(list);
		
		// list에 저장된 값의 합계와 평균을 구해주세요
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		double avg = (double) sum / list.size();
		System.out.println(sum);
		System.out.println(avg);

		// list에서 최소값과 최대값을 구해주세요
		// 최소값
		int min = list.get(0);

		for (int j = 0; j < list.size(); j++) {
			if (min > list.get(j)) {
				min = list.get(j);
			}
		}
		System.out.println(min);
		// 최대값
		int max = list.get(0);
		for (int j = 0; j < list.size(); j++) {
			if (max < list.get(j)) {
				max = list.get(j);
			}
		}
		System.out.println(max);
		
		
		// list를 오름차순으로 정렬해주세요   작은 값부터 큰 값~
				// 선택정렬 //내가한것
		for(int i = 0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)>list.get(j)) {
						int temp = list.get(j);
						list.set(j,list.get(i));
						list.set(i, temp);
				}
			}
		}
		System.out.println(list);
		
		// 쌤이 한거//오름차순 정렬
	    for (int i = 0; i < list.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
			list.set(i, list.set(min, list.get(i))); // 한줄로 표현가능
		}
		System.out.println(list);

		// ArrayList도 2차원 배열 가능
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();

		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		list2.add(list); // 1차원 어레이 리스트를 저장해

		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);

		list2.add(list);

		System.out.println(list2);

		
		for (int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> list3 = list2.get(i);
			for (int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j));
			}
		}

		Integer integer = list2.get(0).get(1);
		System.out.println(integer);

		// 학생 3명의 5과목에 대한 -100점 랜덤한 점수를 2차원 ArrayList에 저장해주세요

		list2 = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 3; i++) {
			list = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				list.add(r.nextInt(100) + 1);
			}
			list2.add(list);
		}
		System.out.println(list2);
//		
//		for(int i =0; i<3; i++) {
//			list2.add(new ArrayList<Integer>());
//			for(int j =0; j<5; j++) {
//				list2.get(i).add((int)(Math.random()*101));
//			}
//		}
//		System.out.println(list2);

		// 각 학생별 합계와 평균을 구해주세요

		ArrayList<ArrayList<Integer>> sumavg = new ArrayList<ArrayList<Integer>>();

//		int[] psum = new int[3];
//		double[] pavg = new double[3];
//		
//		for(int i =0; i< list2.size(); i++) {
//			for(int j =0; j<5; j++) {
//				psum += list2.get(i).get(j);
//				sumavg.set(i,psum); 
//			}pavg[i] = psum[i]/5;
//		}
//	

		//앞으로 배열 대신 어레이리스트를 쓰세용
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		for (int i = 0; i < list2.size(); i++) {
			sum = 0;
			for (int j = 0; j < list2.get(i).size(); j++) {
				sum += list2.get(i).get(j);
			}
			sums.add(sum);
			avgs.add((double) sum / list2.get(i).size());
		}
		System.out.println(sums);
		System.out.println(avgs);
		
	}
}
