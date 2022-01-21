package gameInterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game.InuyashaPlay;
import resource.ImgSrc;

public class InuyashaPlayPage extends JFrame
{
	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 635;
	private static final int MAP_ROW = 3;
	private static final int MAP_COLUMN = 4;
	private static final int PLAYER1_POSITION_X=0;
	private static final int PLAYER1_POSITION_Y=0;
	private static final int PLAYER1_SIZE_X=70;
	private static final int PLAYER1_SIZE_Y=70;
	private static final int PLAYER2_POSITION_X=715;
	private static final int PLAYER2_POSITION_Y=0;
	private static final int PLAYER2_SIZE_X=70;
	private static final int PLAYER2_SIZE_Y=70;
	private static final int VERSUS_POSITION_X=370;
	private static final int VERSUS_POSITION_Y=5;
	private static final int VERSUS_SIZE_X=50;
	private static final int VERSUS_SIZE_Y=50;
	private static final int PLAYER1HP_POSITION_X=80;
	private static final int PLAYER1HP_POSITION_Y=0;
	private static final int PLAYER1HP_SIZE_X=21;
	private static final int PLAYER1HP_SIZE_Y=20;
	private static final int PLAYER1HP_BAR_POSITION_X=115;
	private static final int PLAYER1HP_BAR_POSITION_Y=0;
	private static final int PLAYER1HP_BAR_SIZE_X=251;
	private static final int PLAYER1HP_BAR_SIZE_Y=30;
	private static final int PLAYER1EN_POSITION_X=80;
	private static final int PLAYER1EN_POSITION_Y=30;
	private static final int PLAYER1EN_SIZE_X=21;
	private static final int PLAYER1EN_SIZE_Y=20;
	private static final int PLAYER1EN_BAR_POSITION_X=115;
	private static final int PLAYER1EN_BAR_POSITION_Y=30;
	private static final int PLAYER1EN_BAR_SIZE_X=251;
	private static final int PLAYER1EN_BAR_SIZE_Y=30;
	private static final int PLAYER2HP_POSITION_X=685;
	private static final int PLAYER2HP_POSITION_Y=0;
	private static final int PLAYER2HP_SIZE_X=21;
	private static final int PLAYER2HP_SIZE_Y=20;
	private static final int PLAYER2HP_BAR_POSITION_X=425;
	private static final int PLAYER2HP_BAR_POSITION_Y=0;
	private static final int PLAYER2HP_BAR_SIZE_X=251;
	private static final int PLAYER2HP_BAR_SIZE_Y=30;
	private static final int PLAYER2EN_POSITION_X=685;
	private static final int PLAYER2EN_POSITION_Y=30;
	private static final int PLAYER2EN_SIZE_X=21;
	private static final int PLAYER2EN_SIZE_Y=20;
	private static final int PLAYER2EN_BAR_POSITION_X=425;
	private static final int PLAYER2EN_BAR_POSITION_Y=30;
	private static final int PLAYER2EN_BAR_SIZE_X=251;
	private static final int PLAYER2EN_BAR_SIZE_Y=30;
	private static final int NEXT_POSITION_X=275;
	private static final int NEXT_POSITION_Y=435;
	private static final int NEXT_SIZE_X=223;
	private static final int NEXT_SIZE_Y=24;
	private static final int BAR_WIDTH=250;
	private static final int BAR_HEIGHT=30;
	private static final int NUMBER_OF_LIST=3;
	private static final int ACTION_SIZE_X=110;
	private static final int ACTION_SIZE_Y=117;
	private static final int INVALID_ACTION=-1;
	private static final int FIRST_LIST_INDEX=0;
	private static final int SECOND_LIST_INDEX=1;
	private static final int THIRD_LIST_INDEX=2;
	private static final int PLAYER1=1;
	private static final int PLAYER2=2;
	private static final int[] PLAYER1_GUARD_POSITION_X = { 25, 55, 88, 88, 55, 25 };
	private static final int[] PLAYER2_GUARD_POSITION_X ={ 7, 40, 70, 70, 40, 7 };
	private static final int[] PLAYER_GUARD_POSITION_Y = { 22, 31, 22, 79, 97, 79 };
	private static final int PLAYER_ENUP_POSITION_X= 0;
	private static final int[] PLAYER_ENUP_POSITION_Y= {32,53,74};
	private static final int PLAYER_ENUP_SIZE_X=95;
	private static final int PLAYER_ENUP_SIZE_Y=16;
	private static final int LARGE_MAP_CHARACTER_SIZE_X=95;
	private static final int LARGE_MAP_CHARACTER_SIZE_Y=110;
	private static final int LARGE_MAP_RECT_SIZE_X=192;
	private static final int LARGE_MAP_RECT_SIZE_Y=80;
	private static final int LARGE_MAP_POSITION_X=7;
	private static final int LARGE_MAP_POSITION_Y=178;
	private static final int LARGE_MAP_SIZE_X=775;
	private static final int LARGE_MAP_SIZE_Y=245;
	private ImgSrc imgsrc = new ImgSrc();
	private JLabel player1HPValue, player1ENValue, player2HPValue, player2ENValue;
	private JPanel pnlPlayer1HPBar, pnlPlayer1ENBar, pnlPlayer2HPBar, pnlPlayer2ENBar;
	private JPanel pnlLargeMap;
	private JPanel pnlPlayer1MapL, pnlPlayer2MapL;
	private JPanel pnlNextRound;
	private JPanel[] player1ActionList = new JPanel[NUMBER_OF_LIST];
	private JPanel[] player2ActionList = new JPanel[NUMBER_OF_LIST];

	private InuyashaPlay play;
	
	public InuyashaPlayPage()
	{
		setTitle("Inuyasha");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	public void setPlay(InuyashaPlay play) {
		this.play=play;
	}
	public void setUI()
	{
		JPanel pnlPlayer1 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerS(play.getPlayer1Character().getID()), 0, 0, null);
			}
		};
		pnlPlayer1.setBounds(PLAYER1_POSITION_X, PLAYER1_POSITION_Y, PLAYER1_SIZE_X, PLAYER1_SIZE_Y);
		add(pnlPlayer1);

		JPanel pnlPlayer2 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerS(play.getPlayer2Character().getID()), 0, 0, null);
			}
		};
		pnlPlayer2.setBounds(PLAYER2_POSITION_X, PLAYER2_POSITION_Y, PLAYER2_SIZE_X, PLAYER2_SIZE_Y);
		add(pnlPlayer2);

		JPanel pnlVersus = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcVersusS(), 0, 0, null);
			}
		};
		pnlVersus.setBounds(VERSUS_POSITION_X, VERSUS_POSITION_Y, VERSUS_SIZE_X, VERSUS_SIZE_Y);
		add(pnlVersus);
		
		JPanel pnlPlayer1HP = new JPanel();
		player1HPValue = new JLabel(Integer.toString(play.getPlayer1Character().getHP()));
		pnlPlayer1HP.add(player1HPValue);
		pnlPlayer1HP.setBounds(PLAYER1HP_POSITION_X, PLAYER1HP_POSITION_Y, PLAYER1HP_SIZE_X, PLAYER1HP_SIZE_Y);
		add(pnlPlayer1HP);
		
		pnlPlayer1HPBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.red);
				g.fillRect(0, 0, play.CalculateBarLength(BAR_WIDTH, play.getPlayer1Character().getHP()), BAR_HEIGHT);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT);
			}
		};
		pnlPlayer1HPBar.setBounds(PLAYER1HP_BAR_POSITION_X, PLAYER1HP_BAR_POSITION_Y, PLAYER1HP_BAR_SIZE_X, PLAYER1HP_BAR_SIZE_Y);
		add(pnlPlayer1HPBar);

		JPanel pnlPlayer1EN = new JPanel();
		player1ENValue = new JLabel(Integer.toString(play.getPlayer1Character().getEN()));
		pnlPlayer1EN.add(player1ENValue);
		pnlPlayer1EN.setBounds(PLAYER1EN_POSITION_X, PLAYER1EN_POSITION_Y, PLAYER1EN_SIZE_X, PLAYER1EN_SIZE_Y);
		add(pnlPlayer1EN);

		pnlPlayer1ENBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.orange);
				g.fillRect(0, 0, play.CalculateBarLength(BAR_WIDTH, play.getPlayer1Character().getEN()), BAR_HEIGHT);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT-1);
			}
		};
		pnlPlayer1ENBar.setBounds(PLAYER1EN_BAR_POSITION_X, PLAYER1EN_BAR_POSITION_Y, PLAYER1EN_BAR_SIZE_X, PLAYER1EN_BAR_SIZE_Y);
		add(pnlPlayer1ENBar);

		JPanel pnlPlayer2HP = new JPanel();
		player2HPValue = new JLabel(Integer.toString(play.getPlayer2Character().getHP()));
		pnlPlayer2HP.add(player2HPValue);
		pnlPlayer2HP.setBounds(PLAYER2HP_POSITION_X, PLAYER2HP_POSITION_Y, PLAYER2HP_SIZE_X, PLAYER2HP_SIZE_Y);
		add(pnlPlayer2HP);

		pnlPlayer2HPBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.red);
				g.fillRect(BAR_WIDTH - play.CalculateBarLength(BAR_WIDTH, play.getPlayer2Character().getHP()), 0, play.CalculateBarLength(BAR_WIDTH, play.getPlayer2Character().getHP()),30);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT);
			}
		};
		pnlPlayer2HPBar.setBounds(PLAYER2HP_BAR_POSITION_X, PLAYER2HP_BAR_POSITION_Y, PLAYER2HP_BAR_SIZE_X, PLAYER2HP_BAR_SIZE_Y);
		add(pnlPlayer2HPBar);

		JPanel pnlPlayer2EN = new JPanel();
		player2ENValue = new JLabel(Integer.toString(play.getPlayer2Character().getEN()));
		pnlPlayer2EN.add(player2ENValue);
		pnlPlayer2EN.setBounds(PLAYER2EN_POSITION_X, PLAYER2EN_POSITION_Y, PLAYER2EN_SIZE_X, PLAYER2EN_SIZE_Y);
		add(pnlPlayer2EN);

		pnlPlayer2ENBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.orange);
				g.fillRect(BAR_WIDTH - play.CalculateBarLength(BAR_WIDTH, play.getPlayer2Character().getEN()), 0, play.CalculateBarLength(BAR_WIDTH, play.getPlayer2Character().getEN()),30);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT-1);
			}
		};
		pnlPlayer2ENBar.setBounds(PLAYER2EN_BAR_POSITION_X, PLAYER2EN_BAR_POSITION_Y, PLAYER2EN_BAR_SIZE_X, PLAYER2EN_BAR_SIZE_Y);
		add(pnlPlayer2ENBar);

		pnlNextRound = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcNextRound(), 0, 0, null);
			}
		};
		pnlNextRound.setBounds(NEXT_POSITION_X, NEXT_POSITION_Y, NEXT_SIZE_X, NEXT_SIZE_Y);
		add(pnlNextRound);
		pnlNextRound.setVisible(false);

		JButton btnNextRound = new JButton();
		btnNextRound.setBounds(NEXT_POSITION_X, NEXT_POSITION_Y, NEXT_SIZE_X, NEXT_SIZE_Y);
		btnNextRound.setBorderPainted(false);
		btnNextRound.setContentAreaFilled(false);
		getContentPane().add(btnNextRound);

		btnNextRound.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				play.goToActionPickPage();
			}
		});

		JPanel pnlPlayer1FirstAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[FIRST_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer1Character().getID(), play.getPlayer1Character().getActionsID()[FIRST_LIST_INDEX]), 0, 0, null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer1FirstAction.setBounds(actionListPositionX(PLAYER1,FIRST_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer1FirstAction);
		player1ActionList[FIRST_LIST_INDEX] = pnlPlayer1FirstAction;
		
		JPanel pnlPlayer1SecondAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[SECOND_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer1Character().getID(), play.getPlayer1Character().getActionsID()[SECOND_LIST_INDEX]), 0, 0, null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer1SecondAction.setBounds(actionListPositionX(PLAYER1,SECOND_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer1SecondAction);
		player1ActionList[SECOND_LIST_INDEX] = pnlPlayer1SecondAction;
		
		JPanel pnlPlayer1ThirdAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[THIRD_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer1Character().getID(), play.getPlayer1Character().getActionsID()[THIRD_LIST_INDEX]), 0, 0, null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer1ThirdAction.setBounds(actionListPositionX(PLAYER1,THIRD_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer1ThirdAction);
		player1ActionList[THIRD_LIST_INDEX] = pnlPlayer1ThirdAction;

		JPanel pnlPlayer2FirstAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[FIRST_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer2Character().getID(), play.getPlayer2Character().getActionsID()[FIRST_LIST_INDEX]), 0, 0,
							null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer2FirstAction.setBounds(actionListPositionX(PLAYER2,FIRST_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer2FirstAction);
		player2ActionList[FIRST_LIST_INDEX] = pnlPlayer2FirstAction;
		
		JPanel pnlPlayer2SecondAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[SECOND_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer2Character().getID(), play.getPlayer2Character().getActionsID()[SECOND_LIST_INDEX]), 0, 0,
							null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer2SecondAction.setBounds(actionListPositionX(PLAYER2,SECOND_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer2SecondAction);
		player2ActionList[SECOND_LIST_INDEX] = pnlPlayer2SecondAction;
		
		JPanel pnlPlayer2ThirdAction = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				if (play.getIsOpenActionList()[THIRD_LIST_INDEX])
					g.drawImage(imgsrc.srcComboCards(play.getPlayer2Character().getID(), play.getPlayer2Character().getActionsID()[THIRD_LIST_INDEX]), 0, 0,
							null);
				else
					g.drawImage(imgsrc.srcBackCard(), 0, 0, null);
			}
		};
		pnlPlayer2ThirdAction.setBounds(actionListPositionX(PLAYER2,THIRD_LIST_INDEX), actionListPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(pnlPlayer2ThirdAction);
		player2ActionList[THIRD_LIST_INDEX] = pnlPlayer2ThirdAction;
	}

	public void updatePlayerStatus()
	{
		player1HPValue.setText(Integer.toString(play.getPlayer1Character().getHP()));
		player1ENValue.setText(Integer.toString(play.getPlayer1Character().getEN()));
		player2HPValue.setText(Integer.toString(play.getPlayer2Character().getHP()));
		player2ENValue.setText(Integer.toString(play.getPlayer2Character().getEN()));
		pnlPlayer1HPBar.repaint();
		pnlPlayer1ENBar.repaint();
		pnlPlayer2HPBar.repaint();
		pnlPlayer2ENBar.repaint();
	}
	public void updateActionList() {
		for(int i=0;i<NUMBER_OF_LIST;i++) {
			player1ActionList[i].repaint();
			player2ActionList[i].repaint();
		}
	}
	public void setPositionActionList(int player, int listIndex, int x) {
		if(player==PLAYER1) {
			player1ActionList[listIndex].setBounds(x,actionListPositionY(),ACTION_SIZE_X,ACTION_SIZE_Y);
		}
		else if(player==PLAYER2) {
			player2ActionList[listIndex].setBounds(x,actionListPositionY(),ACTION_SIZE_X,ACTION_SIZE_Y);
		}
	}
	public void setInvisibleActionList(int player, int listIndex) {
		if(player==PLAYER1) {
			player1ActionList[listIndex].setVisible(false);
		}
		else if(player==PLAYER2) {
			player2ActionList[listIndex].setVisible(false);
		}
	}
	public void setVisibleNextRound() {
		pnlNextRound.setVisible(true);
	}
	public void setMap() {
		
		pnlPlayer1MapL = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				if(play.getPlayer1Character().getX()>play.getPlayer2Character().getX()) {
					g.drawImage(imgsrc.srcMapPlayerL(PLAYER2, play.getPlayer1Character().getID()), 0, 0, null);
				}
				else {
					g.drawImage(imgsrc.srcMapPlayerL(PLAYER1, play.getPlayer1Character().getID()), 0, 0, null);
				}
				if (play.getIsPlayer1GuardOn())
				{
					g.setColor(Color.blue);
					g.fillPolygon(PLAYER1_GUARD_POSITION_X, PLAYER_GUARD_POSITION_Y, PLAYER1_GUARD_POSITION_X.length);
				}
				if (play.getIsPlayer1ENUp())
				{
					g.setColor(Color.cyan);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[0], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[1], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[2], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
				}
			}
		};
		pnlPlayer1MapL.setBounds(largeMapPlayer1PositionX(play.getPlayer1Character().getX()), largeMapPositionY(play.getPlayer1Character().getY()), LARGE_MAP_CHARACTER_SIZE_X, LARGE_MAP_CHARACTER_SIZE_Y);
		add(pnlPlayer1MapL);
		
		pnlPlayer2MapL = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				if(play.getPlayer2Character().getX()<play.getPlayer1Character().getX()) {
					g.drawImage(imgsrc.srcMapPlayerL(PLAYER1, play.getPlayer2Character().getID()), 0, 0, null);
				}
				else {
					g.drawImage(imgsrc.srcMapPlayerL(PLAYER2, play.getPlayer2Character().getID()), 0, 0, null);
				}
				if (play.getIsPlayer2GuardOn())
				{
					g.setColor(Color.blue);
					g.fillPolygon(PLAYER2_GUARD_POSITION_X, PLAYER_GUARD_POSITION_Y, PLAYER2_GUARD_POSITION_X.length);
				}
				if (play.getIsPlayer2ENUp())
				{
					g.setColor(Color.cyan);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[0], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[1], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
					g.fillOval(PLAYER_ENUP_POSITION_X, PLAYER_ENUP_POSITION_Y[2], PLAYER_ENUP_SIZE_X, PLAYER_ENUP_SIZE_Y);
				}
			}
		};
		pnlPlayer2MapL.setBounds(largeMapPlayer2PositionX(play.getPlayer2Character().getX()), largeMapPositionY(play.getPlayer2Character().getY()), LARGE_MAP_CHARACTER_SIZE_X, LARGE_MAP_CHARACTER_SIZE_Y);
		add(pnlPlayer2MapL);
		
		pnlLargeMap = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				pnlPlayer1MapL.repaint();
				pnlPlayer2MapL.repaint();
				for (int i = 0; i < MAP_ROW; i++)
				{
					for (int j = 0; j < MAP_COLUMN; j++)
					{
						if (play.isInRedList(j, i))
						{
							g.setColor(Color.red);
							g.fillRect((LARGE_MAP_RECT_SIZE_X+1) * j, (LARGE_MAP_RECT_SIZE_Y+1) * i, LARGE_MAP_RECT_SIZE_X, LARGE_MAP_RECT_SIZE_Y);
						} else
						{
							g.setColor(Color.black);
							g.drawRect((LARGE_MAP_RECT_SIZE_X+1) * j, (LARGE_MAP_RECT_SIZE_Y+1) * i, LARGE_MAP_RECT_SIZE_X, LARGE_MAP_RECT_SIZE_Y);
						}
					}
				}

			}
		};
		pnlLargeMap.setBounds(LARGE_MAP_POSITION_X, LARGE_MAP_POSITION_Y, LARGE_MAP_SIZE_X, LARGE_MAP_SIZE_Y);
		add(pnlLargeMap);
	}
	public void move(int player) {
		if (player == PLAYER1)
		{
			pnlPlayer1MapL.setBounds(play.getPlayer1X(), play.getPlayer1Y(), LARGE_MAP_CHARACTER_SIZE_X, LARGE_MAP_CHARACTER_SIZE_Y);
			pnlPlayer1MapL.repaint();
		}
		if (player == PLAYER2)
		{
			pnlPlayer2MapL.setBounds(play.getPlayer2X(), play.getPlayer2Y(), LARGE_MAP_CHARACTER_SIZE_X, LARGE_MAP_CHARACTER_SIZE_Y);
			pnlPlayer2MapL.repaint();
		}
	}
	public void repaintPlayer(int player) {
		if (player == PLAYER1)
			pnlPlayer1MapL.repaint();
		else if (player == PLAYER2)
			pnlPlayer2MapL.repaint();
	}
	public void repaintMap() {
		pnlLargeMap.repaint();
	}
	public int largeMapPlayer1PositionX(int x)
	{
		switch (x)
		{
		case 0:
			return 8;
		case 1:
			return 201;
		case 2:
			return 394;
		case 3:
			return 587;
		default:
			System.out.println("mapSp1 x location error");
			return -1;
		}
	}

	public int largeMapPositionY(int y)
	{
		switch (y)
		{
		case 0:
			return 138;
		case 1:
			return 219;
		case 2:
			return 300;
		default:
			System.out.println("mapS y location error");
			return -1;
		}
	}

	public int largeMapPlayer2PositionX(int x)
	{
		switch (x)
		{
		case 0:
			return 104;
		case 1:
			return 297;
		case 2:
			return 490;
		case 3:
			return 683;
		default:
			System.out.println("mapSp2 x location error");
			return -1;
		}
	}
	private static final int actionListPositionX(int player, int listIndex) {
		if(player==PLAYER1) {
			switch(listIndex) {
			case FIRST_LIST_INDEX:
				return 265;
			case SECOND_LIST_INDEX:
				return 150;
			case THIRD_LIST_INDEX:
				return 35;
			}
		}
		else if(player==PLAYER2) {
			switch(listIndex) {
			case FIRST_LIST_INDEX:
				return 400;
			case SECOND_LIST_INDEX:
				return 515;
			case THIRD_LIST_INDEX:
				return 630;
			}
		}
		return INVALID_ACTION;
	}
	private static final int actionListPositionY() {
		return 465;
	}
}
