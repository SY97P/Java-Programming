package java_중간실기;

import java.util.Random;

public class Die {

	private int face;		//윗면에 보이는 수
	private Random random;
	
	public Die()
	{
		random = new Random();
	}
	
	/**
	 * 주사위를 던진다
	 */
	public void cast()
	{
		face = random.nextInt(6)+1;
	}
	
	/**
	 * 주사위를 새로 던지지 않은채
	 * 기존의 주사위 윗면 수를 읽는다.
	 * @return 주사위 윗면 수
	 */
	public int read()
	{
		return face;
	}
}
