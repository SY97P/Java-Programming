package java_중간실기;

import java.util.Map;
import java.util.Set;

/**
 * 히스토그램을 그래프로 그려주는 클래스
 */
public class Grapher
{
	/**
	 * 히스토그램을 그래프로 그린다.
	 * 그래프는 별 문자 '*'를 인쇄해 그린다.
	 * 
	 * 별 문자 하나가 단순히 1을 의미하도록 하면
	 * 배열에 들어 있는 숫자들이 큰 값일 때 
	 * 별 문자를 너무 많이 그려야 하므로 (그래프가 너무 커지므로)
	 * 배열에 들어 있는 숫자가 얼마나 큰 수인지에 따라
	 * 별 문자 하나가 의미하는 크기가 조정되도록 한다.
	 * 
	 * height는 데이터에 들어 있는 숫자들 중 가장 큰 수를
	 * 별 문자 몇개로 표현할 것인지를 지정해준다.
	 * 데이터의 수 중 가장 큰 수가 910이고
	 * height가 50이라면 
	 * 별 문자 하나는 910/50 = 18.2를 의미하게 된다.
	 * 
	 * @param map 히스토그램 데이터
	 * @param height 그래프의 최대 높이
	 *               가장 큰 수를 별 문자 몇 개로 그릴 것인가를 나타냄 
	 */

	public void plot(Map<Integer, Integer> map, int height) {

		int maximum = max(map);		// value 중 가장 큰 수		
		float quantum;				// 별 문자 하나가 숫자 얼마에 해당하나?
		quantum = (float)maximum/height;

		// 각 value에 대해 그에 대응되는 갯수의 별 문자를 그림
		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.print(i + ":" + map.get(i) + "\t");
			for (int j = 0; j < Math.round(map.get(i)/quantum); j++)
				System.out.print('*');
			System.out.println();
			
		}
	}
	
	/*
	 * map에 들어 있는 value 중 가장 큰 값을 알아낸다.
	 */
	private int max(Map<Integer, Integer> map) {
		
		int max = Integer.MIN_VALUE;
		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			if (max < map.get(i))
				max = map.get(i);
		}
		return max;
			
	}
}
