package java_중간실기;

import java.util.HashSet;

import java.util.Set;

/**
 * 정육면체 주사위 한 세트
 * @author samsung
 *
 */
public class Dice {

	private Set<Die> dice;		//주사위들을 저장할 그릇
	
	/**
	 * 구성자(Constructor)
	 * 주어진 갯수의 주사위 세트를 구성한다.
	 * @param n 주사위 수
	 */
	public Dice(int n)
	{
		dice = new HashSet<Die>();
		
		for(int i=0; i<n; i++)
		{
			dice.add(new Die());
		}
	}
	
	/**
	 * 주사위 세트에 있는 모든 주사위를 던진다.
	 */
	public void cast()
	{
		for(Die d : dice)
		{
			d.cast();
		}
	}
	
	/**
	 * 주사위 세트에 있는 모든 주사위들의 값을 읽어 차례로 출력한다.
	 */
	public void print()
	{
		for(Die d : dice)
		{
			System.out.print(d.read()+" ");
		}
	}
	
	/**
	 * 주사위 세트에 있는 모든 주사위들이 값의 합을 구한다.
	 * @return
	 */
	public int sum()
	{
		int addition = 0;
		for(Die d : dice)
		{
			addition += d.read();
		}
		return addition;
	}
	
	public static void main(String[] args)
	{
		Dice dice = new Dice(10);
		dice.cast();
		dice.print();
	}
}
