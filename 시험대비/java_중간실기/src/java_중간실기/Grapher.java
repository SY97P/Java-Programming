package java_�߰��Ǳ�;

import java.util.Map;
import java.util.Set;

/**
 * ������׷��� �׷����� �׷��ִ� Ŭ����
 */
public class Grapher
{
	/**
	 * ������׷��� �׷����� �׸���.
	 * �׷����� �� ���� '*'�� �μ��� �׸���.
	 * 
	 * �� ���� �ϳ��� �ܼ��� 1�� �ǹ��ϵ��� �ϸ�
	 * �迭�� ��� �ִ� ���ڵ��� ū ���� �� 
	 * �� ���ڸ� �ʹ� ���� �׷��� �ϹǷ� (�׷����� �ʹ� Ŀ���Ƿ�)
	 * �迭�� ��� �ִ� ���ڰ� �󸶳� ū �������� ����
	 * �� ���� �ϳ��� �ǹ��ϴ� ũ�Ⱑ �����ǵ��� �Ѵ�.
	 * 
	 * height�� �����Ϳ� ��� �ִ� ���ڵ� �� ���� ū ����
	 * �� ���� ��� ǥ���� �������� �������ش�.
	 * �������� �� �� ���� ū ���� 910�̰�
	 * height�� 50�̶�� 
	 * �� ���� �ϳ��� 910/50 = 18.2�� �ǹ��ϰ� �ȴ�.
	 * 
	 * @param map ������׷� ������
	 * @param height �׷����� �ִ� ����
	 *               ���� ū ���� �� ���� �� ���� �׸� ���ΰ��� ��Ÿ�� 
	 */

	public void plot(Map<Integer, Integer> map, int height) {

		int maximum = max(map);		// value �� ���� ū ��		
		float quantum;				// �� ���� �ϳ��� ���� �󸶿� �ش��ϳ�?
		quantum = (float)maximum/height;

		// �� value�� ���� �׿� �����Ǵ� ������ �� ���ڸ� �׸�
		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.print(i + ":" + map.get(i) + "\t");
			for (int j = 0; j < Math.round(map.get(i)/quantum); j++)
				System.out.print('*');
			System.out.println();
			
		}
	}
	
	/*
	 * map�� ��� �ִ� value �� ���� ū ���� �˾Ƴ���.
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
