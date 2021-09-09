package java_�߰��Ǳ�;

import java.util.Random;

public class Die {

	private int face;		//���鿡 ���̴� ��
	private Random random;
	
	public Die()
	{
		random = new Random();
	}
	
	/**
	 * �ֻ����� ������
	 */
	public void cast()
	{
		face = random.nextInt(6)+1;
	}
	
	/**
	 * �ֻ����� ���� ������ ����ä
	 * ������ �ֻ��� ���� ���� �д´�.
	 * @return �ֻ��� ���� ��
	 */
	public int read()
	{
		return face;
	}
}
