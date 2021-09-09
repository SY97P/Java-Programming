package java_중간실기;

import java.util.List;
import java.util.Map;

public class Test
{
	public static void main(String[] args) {
		
		final int NUM_DICE = 10;	// 매 시행마다 던질 주사위 수
		final int TRIALS = 100000;	// 주사위 던지기를 몇 번 시행할 것인가?
		
		// 필요한 객체 구성
		
		Grapher grapher = new Grapher();
		HistogramMaker histogramMaker = new HistogramMaker();
		Simulation simulation = new Simulation(NUM_DICE, TRIALS);
		
		// 모의실험을 수행
		
		List<Integer> list = simulation.run();
		
		// 실험 데이터로부터 히스토그램을 작성
		
		Map<Integer, Integer> map = histogramMaker.makeHistogram(list);
		
		// 히스토그램을 그래프로 출력
		
		grapher.plot(map, 40);
		
	}
}
