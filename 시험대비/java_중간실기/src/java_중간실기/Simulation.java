package java_�߰��Ǳ�;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

	private int num_dice; 			//�ֻ��� ����
	private int trials;				//������ �� �� ������ ���ΰ�?
	
	public Simulation(int num_dice, int trials)
	{
		this.num_dice = num_dice;
		this.trials = trials;
		
	}
	
	/**
	 * trial Ƚ����ŭ �ֻ������� ������
	 * ���� �������� �ֻ��� ���� ����
	 * ����Ʈ�� ���ʷ� �־� �� ����Ʈ�� ��ȯ��,
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
