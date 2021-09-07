package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		   HashMap : 사전
                     apple -> 사과
                     key : value 		  
                     tree 구조 (검색에 용이하다)
                     key로 관리 (key값이 중복이 되면 안된다)
                     
           TreeMap : HashMap + sorting(key를 기준으로)
                  
		*/
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가
		hMap.put(1, "하나");
		hMap.put(new Integer(2), "둘");
		hMap.put(3, "셋");
		
		// 값을 산출 -> key를 넣으면 value가 나옴
		String value = hMap.get(2);  // -> 2는 key값
		
		
		// 삭제
		String del = hMap.remove(2);
		

		// 검색
		// key값이 있다/없다로 찾는다
		boolean b = hMap.containsKey(2);
		if(b == true) {
			String val = hMap.get(2);
			System.out.println(val);
		}
		
		// 수정
		hMap.replace(3, "쓰리");
		
		
		// 추가
		hMap.put(3, "삼");
		
		
		hMap.put(4, "사");
		hMap.put(5, "오");
		
		// map에 들어 있는 모든 키와 값을 출력
		
		Iterator<Integer> it = hMap.keySet().iterator();
		/*
		while(it.hasNext()) {
			
			Integer key = it.next();
			System.out.print("key: " + key + " ");
			
			String v = hMap.get(key);
			System.out.println("value: " + v);
			
		}
		*/
		
		// 좋아하는 과일 5개
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("grape", "포도");
		map.put("pineapple", "파인애플");
		map.put("orange", "오렌지");
		
		Iterator<String> ite = map.keySet().iterator();
		
		while(ite.hasNext()) {
			String k = ite.next();
			String v = map.get(k);
			System.out.println("key: " + k + "value: " + v);
			
		}
		
		// TreeMap
		TreeMap<String, String> tMap = new TreeMap<String, String>(map);
		
		// 오름
	//	Iterator<String> itKey = tMap.keySet().iterator();
		
		
		
		// 내림
		Iterator<String> itKey = tMap.descendingKeySet().iterator();
		
		while(itKey.hasNext()) {
			String k = itKey.next();
			String v = tMap.get(k);
			
			System.out.println("key: " + k + "value: " + v);
		}

		
		
	}

}
