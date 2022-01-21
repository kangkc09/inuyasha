package resource;

import java.util.Arrays;
import java.util.Stack;

public abstract class PlayableCharacter
{
	private static final int INVALID_ACTION=-1;
	private int playerHP;
	private int playerEN;
	private int playerID;
	private int playerX;
	private int playerY;
	private int[] actionID = new int[3];


	public PlayableCharacter(int ID)
	{
		playerHP = 100;
		playerEN = 100;
		playerID = ID;
		Arrays.fill(actionID, INVALID_ACTION);
	}
	public void setFirstPlayerXY() {
		playerX=0;
		playerY=1;
	}
	public void setSecondPlayerXY() {
		playerX=3;
		playerY=1;
	}
	public int getID()
	{
		return playerID;
	}

	public void setHP(int newHp)
	{
		if (newHp < 0)
		{
			newHp = 0;
		}
		playerHP = newHp;
	}

	public void setEN(int newEn)
	{
		playerEN = newEn;
		if (playerEN > 100)
		{
			playerEN = 100;
		}
	}

	public int getX()
	{
		return playerX;
	}

	public int getY()
	{
		return playerY;
	}

	public void setX(int newx)
	{
		playerX = newx;
	}

	public void setY(int newy)
	{
		playerY = newy;
	}

	public int getHP()
	{
		return playerHP;
	}

	public int getEN()
	{
		return playerEN;
	}

	public int[] getActionsID()
	{
		return actionID;
	}
	public void setActionID(int[] actionList) {
		this.actionID=actionList;
	}

	public abstract Stack<Integer> getSkill1DamageList();

	public abstract Stack<Integer> getSkill2DamageList();

	public abstract Stack<Integer> getSkill3DamageList();

	public abstract Stack<Integer> getSkill4DamageList();

	public abstract int getSkill1Damage();

	public abstract int getSkill2Damage();

	public abstract int getSkill3Damage();

	public abstract int getSkill4Damage();

	public abstract int costMvDw();

	public abstract int costMvUp();

	public abstract int costMvRt();

	public abstract int costMvLf();

	public abstract int costGd();

	public abstract int costEnUP();

	public abstract int costSkill1();

	public abstract int costSkill2();

	public abstract int costSkill3();

	public abstract int costSkill4();
}
