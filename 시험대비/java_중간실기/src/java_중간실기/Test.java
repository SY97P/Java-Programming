package java_�߰��Ǳ�;

import java.util.List;
import java.util.Map;

public class Test
{
	public static void main(String[] args) {
		
		final int NUM_DICE = 10;	// �� ���ึ�� ���� �ֻ��� ��
		final int TRIALS = 100000;	// �ֻ��� �����⸦ �� �� ������ ���ΰ�?
		
		// �ʿ��� ��ü ����
		
		Grapher grapher = new Grapher();
		HistogramMaker histogramMaker = new HistogramMaker();
		Simulation simulation = new Simulation(NUM_DICE, TRIALS);
		
		// ���ǽ����� ����
		
		List<Integer> list = simulation.run();
		
		// ���� �����ͷκ��� ������׷��� �ۼ�
		
		Map<Integer, Integer> map = histogramMaker.makeHistogram(list);
		
		// ������׷��� �׷����� ���
		
		grapher.plot(map, 40);
		
	}
}
