package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * object put(object key,object value) : 지정된 키와 값을 저장한다 
		 * object remove(object key): 지정된 키로 저장된 값을 제거한다 
		 * object get(object key) : 지정된 키의값 (없으면 null)을 반환한다
		 * Set keySet(): 저장된 모든 키를 Set으로 반환한다 (set형태로 반환한다(중복되지 않는값을 저장한다))
		 * 
		 */
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());

		System.out.println(map); // 저장되는데 순서라는게 없다! 어떤 순서로 출력될지 알 수 없어!

		// 저장된 값 수정하기
		map.put("name", "이순신");
		System.out.println(map); // 제거하는 것은 없고 덮어쓰는 것!

		map.remove("date");
		System.out.println(map);

		Object value = map.get("name"); // 오브젝트 타입

		System.out.println(((String) value).substring(0, 2)); // 형변환을 해줘야 스트링 타입의 메서드를 사용가능!

		String value2 = (String) map.get("name");

		Set<String> keys = map.keySet();

		for (String key : keys) { // 하나 꺼내서 변수에 저장
			System.out.println(key + ":" + map.get(key));
		}

		// HashMap은 테이블 표현할 때 사용한다!!
		// 1)해쉬맵에 컬럼명과 값을 저장! 해쉬맵으로 한줄의 데이터 표현가능!
		// 2)클래스를 만들어서 클래스 안에 변수(컬럼명)를 만들어서
		// 어레이리스트에 묶어서 테이블을 만들어
		// 변수는 데이터를 담는 그릇이당
		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");

		lprodTable.add(lprod);

		Set<String> keys1 = lprod.keySet();
		for (String key : keys1) { // 하나 꺼내서 변수에 저장
			System.out.println(key + ":" + lprod.get(key));
		}

		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		lprodTable.add(lprod);

		Set<String> keys2 = lprod.keySet();
		for (String key : keys2) { // 하나 꺼내서 변수에 저장
			System.out.println(key + ":" + lprod.get(key));
		}

		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P103");
		lprod.put("LPROD_NM", "여성캐쥬얼");

		lprodTable.add(lprod);

		Set<String> keys3 = lprod.keySet();
		for (String key : keys3) { // 하나 꺼내서 변수에 저장
			System.out.println(key + ":" + lprod.get(key));
		}

		System.out.println(lprodTable);

		for (int i = 0; i < lprodTable.size(); i++) {
			lprod = lprodTable.get(i);
			for (String key : lprod.keySet()) {
				System.out.print(lprod.get(key) + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
