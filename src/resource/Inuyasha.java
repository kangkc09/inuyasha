package resource;

import java.util.Stack;

public class Inuyasha extends PlayableCharacter
{
	public Inuyasha()
	{
		super(1);
	}

	@Override
	public int costSkill1()
	{
		return 25;
	}

	@Override
	public int costSkill2()
	{
		return 50;
	}

	@Override
	public int costSkill3()
	{
		return 25;
	}

	@Override
	public int costSkill4()
	{
		return 35;
	}

	@Override
	public int costMvDw()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int costMvUp()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int costMvRt()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int costMvLf()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int costGd()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int costEnUP()
	{
		// TODO Auto-generated method stub
		return -15;
	}

	@Override
	public Stack<Integer> getSkill1DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(8);
		damagelist.push(5);
		damagelist.push(2);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill2DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(5);
		damagelist.push(1);
		damagelist.push(2);
		damagelist.push(3);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill3DamageList()
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
	public Stack<Integer> getSkill4DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
		damagelist.push(7);
		damagelist.push(9);
		damagelist.push(5);
		damagelist.push(1);
		damagelist.push(3);

		return damagelist;
	}

	@Override
	public int getSkill1Damage()
	{
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int getSkill2Damage()
	{
		// TODO Auto-generated method stub
		return 50;
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
