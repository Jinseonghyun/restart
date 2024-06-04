package collectionEx;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

	public static void main(String[] args) {
		String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
		
		// �־��� �迭�κ��� Map ����
		Map<String, Integer> productMap = new HashMap<>();
		for (String[] product : productArr) {
			productMap.put(product[0], Integer.valueOf(product[1]));
		}
		
		//Map�� ��� ������ ���
		for (String key : productMap.keySet()) {
			System.out.println("��ǰ: " + key + ", ����: " + productMap.get(key));
		}

	}

}