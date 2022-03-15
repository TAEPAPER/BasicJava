package JDBCHOMEWORK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practiceTest {

	public static void main(String[] args) {
		//조회 결과가 한줄인 경우
		//물음표 없는
		String sql = "select *"
				+ " from A_DEPT"
				+ " where dep_no=10";
		Map<String, Object> map = new HashMap<String, Object>();
		map = JDBCU.one(sql);
		System.out.println(map);
		System.out.println();
		
		//조회 결과가 한줄, 물음표 있는 경우
		sql = "select * from a_dept where dep_name =?"
				+ " and loc =? "; 
		List<Object> param = new ArrayList<Object>();
		param.add(0,"영업부");
		param.add(1, "부산");
		map = new HashMap<String,Object>();
		map = JDBCU.oneQue(sql, param);
		System.out.println(map);
		System.out.println();
		
		//조회 결과 여러줄, 물음표 없는
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		sql = "select * from a_dept where dep_no >20 ";
		list = JDBCU.ListNoQue(sql);
		System.out.println(list);
		System.out.println();
		
		//조회 결과 여러줄, 물음표 있는
		list = new  ArrayList<Map<String, Object>>();
		param = new ArrayList<Object>();
		param.add(30);
		sql = "select * from a_dept where dep_no >? ";
		list = JDBCU.ListQue(sql, param);
		System.out.println(list);
		System.out.println();
		
		//업데이트, 물음표 없을 때
		sql = "update a_dept set loc = '대구' where dep_no = 40";
		int result;
		result = JDBCU.update(sql);
		System.out.println(result);
		System.out.println();
		
		//업데이트 물음표 있을 때
		sql = "update a_dept set loc = ? where dep_no = 40";
		param = new ArrayList<Object>();
		param.add("광주");
		result = JDBCU.updateQue(sql,param);
		System.out.println(result);

				
		

	}

}
