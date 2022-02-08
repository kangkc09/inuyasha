package game;

import java.util.Arrays;

import gameInterface.InuyashaActionPickPage;
import gameInterface.InuyashaPlayPage;
import resource.Action;
import resource.ComputerPlayer;
import resource.PlayableCharacter;

public class InuyashaActionPick
{
	private static final int NUMBER_OF_ACTION = 10;
	private static final int NUMBER_OF_LIST = 3;
	private static final int INVALID_ACTION = -1;
	private PlayableCharacter player1Character, player2Character;
	private InuyashaActionPickPage actionPickPage;
	private Action actionEnum;
	private int[] actionCost = new int[NUMBER_OF_ACTION];
	private int[] actionList = new int[NUMBER_OF_LIST];
	private boolean[] isValidAction = new boolean[NUMBER_OF_ACTION];
	private boolean[] isOccupiedList = new boolean[NUMBER_OF_LIST];

	private int ENPreview;

	public InuyashaActionPick(InuyashaActionPickPage actionPickPage)
	{
		this.actionPickPage = actionPickPage;
		Arrays.fill(actionList, INVALID_ACTION);
		Arrays.fill(isOccupiedList, false);
		Arrays.fill(isValidAction, true);

	}

	public void initializeCostAndEN()
	{
		actionCost[actionEnum.moveDown.ordinal()] = player1Character.costMvDw();
		actionCost[actionEnum.moveUp.ordinal()] = player1Character.costMvUp();
		actionCost[actionEnum.moveRight.ordinal()] = player1Character.costMvRt();
		actionCost[actionEnum.moveLeft.ordinal()] = player1Character.costMvLf();
		actionCost[actionEnum.Guard.ordinal()] = player1Character.costGd();
		actionCost[actionEnum.skill1.ordinal()] = player1Character.costSkill1();
		actionCost[actionEnum.skill2.ordinal()] = player1Character.costSkill2();
		actionCost[actionEnum.skill3.ordinal()] = player1Character.costSkill3();
		actionCost[actionEnum.skill4.ordinal()] = player1Character.costSkill4();
		actionCost[actionEnum.energyUp.ordinal()] = player1Character.costEnUP();
		ENPreview = player1Character.getEN();
	}

	public void goToPlayPage()
	{
		if (isDone())
		{
			ComputerPlayer complayer = new ComputerPlayer(player2Character, player1Character);
			int[] compick = new int[NUMBER_OF_LIST];
			compick = complayer.randomPickThree();
			player2Character.setActionID(compick);
			player1Character.setActionID(actionList);
			actionPickPage.setVisible(false);
			InuyashaPlayPage playPage = new InuyashaPlayPage();
			InuyashaPlay play = new InuyashaPlay(playPage);
			play.setPlayer1Character(player1Character);
			play.setPlayer2Character(player2Character);
			playPage.setPlay(play);
			playPage.setUI();
			playPage.setMap();
			play.gameStart();
		}
	}

	public void randomActionPick()
	{
		ComputerPlayer complayer = new ComputerPlayer(player1Character, player2Character);
		int[] compick = new int[3];
		compick = complayer.randomPickThree();
		player1Character.setActionID(compick);
	}

	public int currentList()
	{
		if (!isOccupiedList[0])
			return 0;
		else if (!isOccupiedList[1])
			return 1;
		else if (!isOccupiedList[2])
			return 2;
		return INVALID_ACTION;
	}

	public void listOff(int listIndex)
	{
		ENPreview += actionCost[actionList[listIndex]];
		actionList[listIndex] = -1;
		isOccupiedList[listIndex] = false;
	}

	public void listOn(int cardID)
	{
		if (!isDone())
		{
			actionList[currentList()] = cardID;
			isOccupiedList[currentList()] = true;
			ENPreview -= actionCost[cardID];
		}

	}

	public boolean isInList(int cardID)
	{
		for (int i = 0; i < NUMBER_OF_LIST; i++)
		{
			if (actionList[i] == cardID)
			{
				return true;
			}
		}
		return false;
	}

	public boolean isNotEnoughEN(int cardID)
	{
		return (ENPreview < actionCost[cardID]);
	}

	public boolean getIsOccupiedList(int listIndex)
	{
		return isOccupiedList[listIndex];
	}

	public boolean getIsValidAction(int cardID)
	{
		return isValidAction[cardID];
	}

	public int[] getActionList()
	{
		return actionList;
	}

	public void setIsValidAction(int cardID, boolean valid)
	{
		isValidAction[cardID] = valid;
	}

	public void setPlayer1Character(PlayableCharacter character)
	{
		player1Character = character;
	}

	public void setPlayer2Character(PlayableCharacter character)
	{
		player2Character = character;
	}

	public PlayableCharacter getPlayer1Character()
	{
		return player1Character;
	}

	public PlayableCharacter getPlayer2Character()
	{
		return player2Character;
	}

	public int CalculateBarLength(int max, int value)
	{
		double result = 0.0;
		result = max * ((double) value / 100);
		return (int) result;
	}

	public boolean isDone()
	{
		if (isOccupiedList[0] && isOccupiedList[1] && isOccupiedList[2])
			return true;
		else
			return false;
	}

}
