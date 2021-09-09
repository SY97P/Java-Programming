package java_�߰��Ǳ�;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistogramMaker {

	
	public Map<Integer, Integer> makeHistogram(List<Integer> list)
	{
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : list)
		{
			System.out.print(i + " ");
		}
		for (int i = 0; i < list.size(); i++)
		{
			if (map.get(list.get(i)) == null)
			{
				map.put(list.get(i), 1);
				System.out.println("�� : " + map.get(list.get(i)));
			}
			else
			{
				int sum;
				
				sum = map.get(list.get(i));
				System.out.println("�հ� : " + sum);
				sum++;
				map.put(list.get(i), sum);
				System.out.println("����Ʈ : " + list.get(i));
				System.out.println("�� : " + map.get(list.get(i)));
			}
		}
		return map;
	}
	
	public static void main(String[] args)
	{
		Simulation simulation = new Simulation(2, 10);
		List<Integer> list = simulation.run();
		HistogramMaker maker = new HistogramMaker();
		Map<Integer, Integer> map = maker.makeHistogram(list);
		System.out.println(map);
	}
}
