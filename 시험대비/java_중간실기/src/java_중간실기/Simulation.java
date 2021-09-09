package java_중간실기;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

	private int num_dice; 			//주사위 갯수
	private int trials;				//실험을 몇 번 시행할 것인가?
	
	public Simulation(int num_dice, int trials)
	{
		this.num_dice = num_dice;
		this.trials = trials;
		
	}
	
	/**
	 * trial 횟수만큼 주사위들을 던지고
	 * 던질 때마다의 주사위 값의 합을
	 * 리스트에 차례로 넣어 그 리스트를 반환단,
	 */
	public List<Integer> run()
	{
		Dice dice = new Dice(num_dice);
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<trials; i++)
		{
			dice.cast();
			int sum =0;
			sum += dice.sum();
			list.add(sum);
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		Simulation simulation = new Simulation(2, 10);
		List<Integer> list = simulation.run();
		System.out.println(list);
	}
}
