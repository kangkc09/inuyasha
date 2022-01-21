package resource;

import java.util.Stack;

public class Naraku extends PlayableCharacter
{
	public Naraku()
	{
		super(8);
	}

	@Override
	public int costSkill1()
	{
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public int costSkill2()
	{
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int costSkill3()
	{
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int costSkill4()
	{
		// TODO Auto-generated method stub
		return 20;
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
		damagelist.push(4);
		damagelist.push(6);

		return damagelist;
	}

	@Override
	public Stack<Integer> getSkill2DamageList()
	{
		Stack<Integer> damagelist = new Stack<>();
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
		return 0;
	}

	@Override
	public int getSkill2Damage()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSkill3Damage()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSkill4Damage()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
