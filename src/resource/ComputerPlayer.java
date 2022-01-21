package resource;

import java.util.Arrays;
import java.util.Random;

public class ComputerPlayer
{
	private static final int NUMBER_OF_ACTION=10;
	private static final int NUMBER_OF_LIST=3;
	private static final int INVALID_ACTION=-1;
	private PlayableCharacter player, foePlayer;
	private boolean[] isValidAction=new boolean[NUMBER_OF_ACTION];
	private int[] actionCost=new int[NUMBER_OF_ACTION];
	private int ENPreview;
	private final Random randomSelecter = new Random();
	private int randomCardID;
	private int[] randomCardIDArray = new int[3];
	private Action actionEnum;

	public ComputerPlayer(PlayableCharacter player, PlayableCharacter foePlayer)
	{
		this.player = player;
		this.foePlayer=foePlayer;
		ENPreview = player.getEN();
		Arrays.fill(isValidAction, true);
		Arrays.fill(randomCardIDArray, INVALID_ACTION);
		actionCost[actionEnum.moveDown.ordinal()] = player.costMvDw();
		actionCost[actionEnum.moveUp.ordinal()] = player.costMvUp();
		actionCost[actionEnum.moveRight.ordinal()] = player.costMvRt();
		actionCost[actionEnum.moveLeft.ordinal()] = player.costMvLf();
		actionCost[actionEnum.Guard.ordinal()] = player.costGd();
		actionCost[actionEnum.skill1.ordinal()] = player.costSkill1();
		actionCost[actionEnum.skill2.ordinal()] = player.costSkill2();
		actionCost[actionEnum.skill3.ordinal()] = player.costSkill3();
		actionCost[actionEnum.skill4.ordinal()] = player.costSkill4();
		actionCost[actionEnum.energyUp.ordinal()] = player.costEnUP();
	}

	public int[] randomPickThree()
	{
		for (int i = 0; i < NUMBER_OF_LIST; i++)
		{
			randomCardIDArray[i] = randomPick();
		}
		return randomCardIDArray;
	}

	public int randomPick()
	{
		removeInvalidCard();
		while (true)
		{
			randomCardID=randomSelecter.nextInt(10);
			System.out.println(randomCardID);
			if (isValidAction[randomCardID])
			{
				isValidAction[randomCardID]=false;
				ENPreview-=actionCost[randomCardID];
				break;
			}
		}
		return randomCardID;
	}

	public void removeInvalidCard()
	{
		for (int i = 0; i < NUMBER_OF_ACTION; i++)
		{
			if (ENPreview < actionCost[i])
			{
				isValidAction[i]=false;
			} else if (randomCardIDArray[0] == i || randomCardIDArray[1] == i
					|| randomCardIDArray[2] == i)
			{
				isValidAction[i]=false;
			} else
			{
				isValidAction[i]=true;
			}
		}
		removeInefficientCard();
	}

	public void removeInefficientCard()
	{
		if (player.getX() == 0)
		{
			isValidAction[actionEnum.moveLeft.ordinal()]=false;
		}
		if (player.getX() == 3)
		{
			isValidAction[actionEnum.moveRight.ordinal()]=false;
		}
		if (player.getY() == 0)
		{
			isValidAction[actionEnum.moveUp.ordinal()]=false;
		}
		if (player.getY() == 2)
		{
			isValidAction[actionEnum.moveDown.ordinal()]=false;
		}
		if (ENPreview == 100)
		{
			isValidAction[actionEnum.energyUp.ordinal()]=false;
		}
	}

}
