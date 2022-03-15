package j_collectionTeacher;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * - List
		 * - Map
		 * - Set
		 * 
		 * ArrayList의 주요 메서드
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다.
		 * - Object remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
//		list.add("abc");
		list.add(new Integer(20));
		/*
		 * Wrapper클래스
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean
		 */
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40);
		System.out.println(list);
		
		
		//set
		int before = list.set(2, 50);
		System.out.println("before : " + before);
		System.out.println(list);
		
		//get
		int get = list.get(2);
		System.out.println(get);
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.remove(i));
//		}
//		System.out.println(list);
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		
		
		
		//list에 1~100사아의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++) {
			min = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(min)) {
					min = j;
				}
			}
//			int temp = list.get(i);
//			list.set(i, list.get(min));
//			list.set(min, temp);
			
			list.set(i, list.set(min, list.get(i)));
		}
		System.out.println(list);
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> list3 = list2.get(i);
			for(int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j));
			}
		}
		
		Integer integer = list2.get(0).get(1);
		System.out.println(integer);
		
		//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요.
		list2 = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < 3; i++) {
			list2.add(new ArrayList<Integer>());
			for(int j = 0; j < 5; j++) {
				list2.get(i).add((int)(Math.random() * 101));
			}
		}
		System.out.println(list2);
		
		//각 학생별 합계와 평균을 구해주세요.
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		
		for(int i = 0; i < list2.size(); i++) {
			sum = 0;
			for(int j = 0; j < list2.get(i).size(); j++) {
				sum += list2.get(i).get(j);
			}
			sums.add(sum);
			avgs.add((double)sum / list2.get(i).size());
		}
		System.out.println(sums);
		System.out.println(avgs);
	}

}


















