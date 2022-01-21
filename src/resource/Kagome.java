package resource;

import java.util.Stack;

public class Kagome extends PlayableCharacter
{
	public Kagome()
	{
		super(2);
	}

	@Override
	public int costSkill1()
	{
		return 50;
	}

	@Override
	public int costSkill2()
	{
		return 15;
	}

	@Override
	public int costSkill3()
	{
		return 15;
	}

	@Override
	public int costSkill4()
	{
		return 25;
	}

	@Override
	public int costMvDw()
	{
		return 0;
	}

	@Override
	public int costMvUp()
	{
		return 0;
	}

	@Override
	public int costMvRt()
	{
		return 0;
	}

	@Override
	public int costMvLf()
	{
		return 0;
	}

	@Override
	public int costGd()
	{
		return 0;
	}

	@Override
	public int costEnUP()
	{
		return -15;
	}

	@Override
	public Stack<Integer> getSkill1DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(7);
		damagelist.push(9);
		damagelist.push(5);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill2DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(7);
		damagelist.push(8);
		damagelist.push(9);
		damagelist.push(4);
		damagelist.push(5);
		damagelist.push(6);
		damagelist.push(1);
		damagelist.push(2);
		damagelist.push(3);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill3DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(4);
		damagelist.push(5);
		damagelist.push(6);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill4DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(8);
		damagelist.push(4);
		damagelist.push(5);
		damagelist.push(6);
		damagelist.push(2);

		return damagelist;
	}

	@Override
	public int getSkill1Damage()
	{
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getSkill2Damage()
	{
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int getSkill3Damage()
	{
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public int getSkill4Damage()
	{
		// TODO Auto-generated method stub
		return 25;
	}
}
