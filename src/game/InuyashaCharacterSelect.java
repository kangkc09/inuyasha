package game;

import java.util.Random;

import javax.swing.JFrame;

import gameInterface.InuyashaActionPickPage;
import resource.Inuyasha;
import resource.Kagome;
import resource.Kagura;
import resource.Koga;
import resource.Miroku;
import resource.Naraku;
import resource.PlayableCharacter;
import resource.Sango;
import resource.Sesshomaru;

public class InuyashaCharacterSelect
{
	private static final int PLAYER1_POSITION_X = 175;
	private static final int PLAYER1_POSITION_Y = 15;
	private static final int PLAYER1_SIZE_X = 150;
	private static final int PLAYER1_SIZE_Y = 150;

	private int player1CharacterID = 0;
	private int player2CharacterID = 0;
	private boolean isPlayer1Picked = false;
	private boolean isPlayer2Picked = false;
	private JFrame frm;

	public InuyashaCharacterSelect(JFrame frm)
	{
		this.frm = frm;
	}

	public void showPlayer1Character(int characterID)
	{
		player1CharacterID = characterID;
		frm.repaint();
	}

	public void showPlayer2Character(int characterID)
	{
		player2CharacterID = characterID;
		frm.repaint();
	}

	public void cancelPlayer1Character()
	{
		if (!isPlayer2Picked)
		{
			isPlayer1Picked = false;
			player1CharacterID = 0;
			frm.repaint();
		}
	}

	public void cancelPlayer2Character()
	{
		isPlayer2Picked = false;
		player2CharacterID = 0;
		frm.repaint();
	}

	public void showCharacter(int characterID)
	{
		if (!isPlayer1Picked)
		{
			showPlayer1Character(characterID);
		} else if (!isPlayer2Picked)
		{
			showPlayer2Character(characterID);
		}
	}

	public void pickCharacter(int characterID)
	{
		showCharacter(characterID);
		if (!isPlayer1Picked)
		{
			player1CharacterID = characterID;
			isPlayer1Picked = true;
		} else if (!isPlayer2Picked)
		{
			player2CharacterID = characterID;
			isPlayer2Picked = true;
		}

	}

	public void pickRandom()
	{
		Random randomSelecter = new Random();
		int randomID = (randomSelecter.nextInt(8)) + 1;
		pickCharacter(randomID);
	}

	public int getPlayer1CharacterID()
	{
		return player1CharacterID;
	}

	public int getPlayer2CharacterID()
	{
		return player2CharacterID;
	}

	public void goToActionPickPage()
	{
		if (isPlayer2Picked)
		{
			PlayableCharacter player1Character = constructCharacter(player1CharacterID);
			PlayableCharacter player2Character = constructCharacter(player2CharacterID);
			player1Character.setFirstPlayerXY();
			player2Character.setSecondPlayerXY();
			InuyashaActionPickPage actionPickPage = new InuyashaActionPickPage();
			InuyashaActionPick actionPick = new InuyashaActionPick(actionPickPage);
			actionPick.setPlayer1Character(player1Character);
			actionPick.setPlayer2Character(player2Character);
			actionPick.initializeCostAndEN();
			actionPickPage.setActionPick(actionPick);
			actionPickPage.setUI();
			actionPickPage.setMap();
			frm.setVisible(false);
		}
	}

	public PlayableCharacter constructCharacter(int playerID)
	{
		switch (playerID)
		{
		case 1:
			return new Inuyasha();
		case 2:
			return new Kagome();
		case 3:
			return new Sango();
		case 4:
			return new Miroku();
		case 5:
			return new Kagura();
		case 6:
			return new Koga();
		case 7:
			return new Sesshomaru();
		case 8:
			return new Naraku();
		default:
			System.out.println("characterID case error");
			System.exit(0);
			break;
		}
		return null;
	}

}
