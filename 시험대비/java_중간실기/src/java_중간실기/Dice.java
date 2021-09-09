package java_�߰��Ǳ�;

import java.util.HashSet;

import java.util.Set;

/**
 * ������ü �ֻ��� �� ��Ʈ
 * @author samsung
 *
 */
public class Dice {

	private Set<Die> dice;		//�ֻ������� ������ �׸�
	
	/**
	 * ������(Constructor)
	 * �־��� ������ �ֻ��� ��Ʈ�� �����Ѵ�.
	 * @param n �ֻ��� ��
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
	 * �ֻ��� ��Ʈ�� �ִ� ��� �ֻ����� ������.
	 */
	public void cast()
	{
		for(Die d : dice)
		{
			d.cast();
		}
	}
	
	/**
	 * �ֻ��� ��Ʈ�� �ִ� ��� �ֻ������� ���� �о� ���ʷ� ����Ѵ�.
	 */
	public void print()
	{
		for(Die d : dice)
		{
			System.out.print(d.read()+" ");
		}
	}
	
	/**
	 * �ֻ��� ��Ʈ�� �ִ� ��� �ֻ������� ���� ���� ���Ѵ�.
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
