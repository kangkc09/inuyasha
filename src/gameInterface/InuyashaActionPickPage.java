package gameInterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game.InuyashaActionPick;
import resource.Action;
import resource.ImgSrc;

public class InuyashaActionPickPage extends JFrame
{
	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 635;
	private static final int PLAYER1_POSITION_X = 0;
	private static final int PLAYER1_POSITION_Y = 0;
	private static final int PLAYER1_SIZE_X = 70;
	private static final int PLAYER1_SIZE_Y = 70;
	private static final int PLAYER2_POSITION_X = 715;
	private static final int PLAYER2_POSITION_Y = 0;
	private static final int PLAYER2_SIZE_X = 70;
	private static final int PLAYER2_SIZE_Y = 70;
	private static final int VERSUS_POSITION_X = 370;
	private static final int VERSUS_POSITION_Y = 5;
	private static final int VERSUS_SIZE_X = 50;
	private static final int VERSUS_SIZE_Y = 50;
	private static final int PLAYER1HP_POSITION_X = 80;
	private static final int PLAYER1HP_POSITION_Y = 0;
	private static final int PLAYER1HP_SIZE_X = 21;
	private static final int PLAYER1HP_SIZE_Y = 20;
	private static final int PLAYER1HP_BAR_POSITION_X = 115;
	private static final int PLAYER1HP_BAR_POSITION_Y = 0;
	private static final int PLAYER1HP_BAR_SIZE_X = 251;
	private static final int PLAYER1HP_BAR_SIZE_Y = 30;
	private static final int PLAYER1EN_POSITION_X = 80;
	private static final int PLAYER1EN_POSITION_Y = 30;
	private static final int PLAYER1EN_SIZE_X = 21;
	private static final int PLAYER1EN_SIZE_Y = 20;
	private static final int PLAYER1EN_BAR_POSITION_X = 115;
	private static final int PLAYER1EN_BAR_POSITION_Y = 30;
	private static final int PLAYER1EN_BAR_SIZE_X = 251;
	private static final int PLAYER1EN_BAR_SIZE_Y = 30;
	private static final int PLAYER2HP_POSITION_X = 685;
	private static final int PLAYER2HP_POSITION_Y = 0;
	private static final int PLAYER2HP_SIZE_X = 21;
	private static final int PLAYER2HP_SIZE_Y = 20;
	private static final int PLAYER2HP_BAR_POSITION_X = 425;
	private static final int PLAYER2HP_BAR_POSITION_Y = 0;
	private static final int PLAYER2HP_BAR_SIZE_X = 251;
	private static final int PLAYER2HP_BAR_SIZE_Y = 30;
	private static final int PLAYER2EN_POSITION_X = 685;
	private static final int PLAYER2EN_POSITION_Y = 30;
	private static final int PLAYER2EN_SIZE_X = 21;
	private static final int PLAYER2EN_SIZE_Y = 20;
	private static final int PLAYER2EN_BAR_POSITION_X = 425;
	private static final int PLAYER2EN_BAR_POSITION_Y = 30;
	private static final int PLAYER2EN_BAR_SIZE_X = 251;
	private static final int PLAYER2EN_BAR_SIZE_Y = 30;
	private static final int NEXT_POSITION_X = 630;
	private static final int NEXT_POSITION_Y = 408;
	private static final int NEXT_SIZE_X = 133;
	private static final int NEXT_SIZE_Y = 39;
	private static final int RANDOM_POSITION_X = 385;
	private static final int RANDOM_POSITION_Y = 460;
	private static final int RANDOM_SIZE_X = 120;
	private static final int RANDOM_SIZE_Y = 120;
	private static final int CLEAR_POSITION_X = 380;
	private static final int CLEAR_POSITION_Y = 415;
	private static final int CLEAR_SIZE_X = 131;
	private static final int CLEAR_SIZE_Y = 30;
	private static final int BAR_WIDTH = 250;
	private static final int BAR_HEIGHT = 30;
	private static final int NUMBER_OF_ACTION = 10;
	private static final int NUMBER_OF_LIST = 3;
	private static final int ACTION_SIZE_X = 110;
	private static final int ACTION_SIZE_Y = 117;
	private static final int INVALID_ACTION = -1;
	private static final int FIRST_LIST_INDEX = 0;
	private static final int SECOND_LIST_INDEX = 1;
	private static final int THIRD_LIST_INDEX = 2;
	private static final int MAP_ROW = 3;
	private static final int MAP_COLUMN = 4;
	private static final int SMALL_MAP_CHARACTER_SIZE_X = 30;
	private static final int SMALL_MAP_CHARACTER_SIZE_Y = 30;
	private static final int SMALL_MAP_RECT_SIZE_X = 62;
	private static final int SMALL_MAP_RECT_SIZE_Y = 41;
	private static final int SMALL_MAP_POSITION_X = 518;
	private static final int SMALL_MAP_POSITION_Y = 460;
	private static final int SMALL_MAP_SIZE_X = 250;
	private static final int SMALL_MAP_SIZE_Y = 125;
	ImgSrc imgsrc = new ImgSrc();
	private InuyashaActionPick actionPick;
	private Action actionEnum;
	private JPanel[] pnlAction = new JPanel[NUMBER_OF_ACTION];

	public InuyashaActionPickPage()
	{
		setTitle("Inuyasha");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
	}

	public void setActionPick(InuyashaActionPick actionPick)
	{
		this.actionPick = actionPick;
	}

	public void setUI()
	{
		JPanel pnlPlayer1 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerS(actionPick.getPlayer1Character().getID()), 0, 0, null);
			}
		};
		pnlPlayer1.setBounds(PLAYER1_POSITION_X, PLAYER1_POSITION_Y, PLAYER1_SIZE_X, PLAYER1_SIZE_Y);
		add(pnlPlayer1);

		JPanel pnlPlayer2 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerS(actionPick.getPlayer2Character().getID()), 0, 0, null);
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
		JLabel player1HPValue = new JLabel(Integer.toString(actionPick.getPlayer1Character().getHP()));
		pnlPlayer1HP.add(player1HPValue);
		pnlPlayer1HP.setBounds(PLAYER1HP_POSITION_X, PLAYER1HP_POSITION_Y, PLAYER1HP_SIZE_X, PLAYER1HP_SIZE_Y);
		add(pnlPlayer1HP);

		JPanel pnlPlayer1HPBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.red);
				g.fillRect(0, 0, actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer1Character().getHP()),
						BAR_HEIGHT);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT);
			}
		};
		pnlPlayer1HPBar.setBounds(PLAYER1HP_BAR_POSITION_X, PLAYER1HP_BAR_POSITION_Y, PLAYER1HP_BAR_SIZE_X,
				PLAYER1HP_BAR_SIZE_Y);
		add(pnlPlayer1HPBar);

		JPanel pnlPlayer1EN = new JPanel();
		JLabel player1ENValue = new JLabel(Integer.toString(actionPick.getPlayer1Character().getEN()));
		pnlPlayer1EN.add(player1ENValue);
		pnlPlayer1EN.setBounds(PLAYER1EN_POSITION_X, PLAYER1EN_POSITION_Y, PLAYER1EN_SIZE_X, PLAYER1EN_SIZE_Y);
		add(pnlPlayer1EN);

		JPanel pnlPlayer1ENBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.orange);
				g.fillRect(0, 0, actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer1Character().getEN()),
						BAR_HEIGHT);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT - 1);
			}
		};
		pnlPlayer1ENBar.setBounds(PLAYER1EN_BAR_POSITION_X, PLAYER1EN_BAR_POSITION_Y, PLAYER1EN_BAR_SIZE_X,
				PLAYER1EN_BAR_SIZE_Y);
		add(pnlPlayer1ENBar);

		JPanel pnlPlayer2HP = new JPanel();
		JLabel player2HPValue = new JLabel(Integer.toString(actionPick.getPlayer2Character().getHP()));
		pnlPlayer2HP.add(player2HPValue);
		pnlPlayer2HP.setBounds(PLAYER2HP_POSITION_X, PLAYER2HP_POSITION_Y, PLAYER2HP_SIZE_X, PLAYER2HP_SIZE_Y);
		add(pnlPlayer2HP);

		JPanel pnlPlayer2HPBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.red);
				g.fillRect(
						BAR_WIDTH - actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer2Character().getHP()),
						0, actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer2Character().getHP()), 30);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT);
			}
		};
		pnlPlayer2HPBar.setBounds(PLAYER2HP_BAR_POSITION_X, PLAYER2HP_BAR_POSITION_Y, PLAYER2HP_BAR_SIZE_X,
				PLAYER2HP_BAR_SIZE_Y);
		add(pnlPlayer2HPBar);

		JPanel pnlPlayer2EN = new JPanel();
		JLabel player2ENValue = new JLabel(Integer.toString(actionPick.getPlayer2Character().getEN()));
		pnlPlayer2EN.add(player2ENValue);
		pnlPlayer2EN.setBounds(PLAYER2EN_POSITION_X, PLAYER2EN_POSITION_Y, PLAYER2EN_SIZE_X, PLAYER2EN_SIZE_Y);
		add(pnlPlayer2EN);

		JPanel pnlPlayer2ENBar = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.orange);
				g.fillRect(
						BAR_WIDTH - actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer2Character().getEN()),
						0, actionPick.CalculateBarLength(BAR_WIDTH, actionPick.getPlayer2Character().getEN()), 30);
				g.setColor(Color.black);
				g.drawRect(0, 0, BAR_WIDTH, BAR_HEIGHT - 1);
			}
		};
		pnlPlayer2ENBar.setBounds(PLAYER2EN_BAR_POSITION_X, PLAYER2EN_BAR_POSITION_Y, PLAYER2EN_BAR_SIZE_X,
				PLAYER2EN_BAR_SIZE_Y);
		add(pnlPlayer2ENBar);

		JPanel pnlNext = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcContinue(), 0, 0, null);
			}
		};
		pnlNext.setBounds(NEXT_POSITION_X, NEXT_POSITION_Y, NEXT_SIZE_X, NEXT_SIZE_Y);
		add(pnlNext);

		JPanel pnlRandom = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcRandom(), 0, 0, null);
			}
		};
		pnlRandom.setBounds(RANDOM_POSITION_X, RANDOM_POSITION_Y, RANDOM_SIZE_X, RANDOM_SIZE_Y);
		add(pnlRandom);

		JPanel pnlClear = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcClear(), 0, 0, null);
			}
		};
		pnlClear.setBounds(CLEAR_POSITION_X, CLEAR_POSITION_Y, CLEAR_SIZE_X, CLEAR_SIZE_Y);
		add(pnlClear);

		JButton btnNext = new JButton();
		btnNext.setBounds(NEXT_POSITION_X, NEXT_POSITION_Y, NEXT_SIZE_X, NEXT_SIZE_Y);
		btnNext.setBorderPainted(false);
		btnNext.setContentAreaFilled(false);
		getContentPane().add(btnNext);

		JButton btnRandom = new JButton();
		btnRandom.setBounds(RANDOM_POSITION_X, RANDOM_POSITION_Y, RANDOM_SIZE_X, RANDOM_SIZE_Y);
		btnRandom.setBorderPainted(false);
		btnRandom.setContentAreaFilled(false);
		getContentPane().add(btnRandom);

		JButton btnClear = new JButton();
		btnClear.setBounds(CLEAR_POSITION_X, CLEAR_POSITION_Y, CLEAR_SIZE_X, CLEAR_SIZE_Y);
		btnClear.setBorderPainted(false);
		btnClear.setContentAreaFilled(false);
		getContentPane().add(btnClear);

		btnNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionPick.goToPlayPage();
			}
		});

		btnRandom.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				clear();
				actionPick.randomActionPick();
				for (int i = 0; i < NUMBER_OF_LIST; i++)
				{
					listOn(actionPick.getPlayer1Character().getActionsID()[i]);
				}
			}
		});
		btnClear.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				clear();
			}
		});

		/*
		 * Combo Cards
		 */

		JPanel mvDw = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(
						imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.moveDown.ordinal()),
						0, 0, null);
			}
		};
		mvDw.setBounds(actionPositionX(actionEnum.moveDown.ordinal()), actionPositionY(actionEnum.moveDown.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(mvDw);
		pnlAction[actionEnum.moveDown.ordinal()] = mvDw;

		JPanel mvUp = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.moveUp.ordinal()),
						0, 0, null);
			}
		};
		mvUp.setBounds(actionPositionX(actionEnum.moveUp.ordinal()), actionPositionY(actionEnum.moveUp.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(mvUp);
		pnlAction[actionEnum.moveUp.ordinal()] = mvUp;

		JPanel mvRt = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(
						imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.moveRight.ordinal()),
						0, 0, null);
			}
		};
		mvRt.setBounds(actionPositionX(actionEnum.moveRight.ordinal()), actionPositionY(actionEnum.moveRight.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(mvRt);
		pnlAction[actionEnum.moveRight.ordinal()] = mvRt;

		JPanel mvLf = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(
						imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.moveLeft.ordinal()),
						0, 0, null);
			}
		};
		mvLf.setBounds(actionPositionX(actionEnum.moveLeft.ordinal()), actionPositionY(actionEnum.moveLeft.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(mvLf);
		pnlAction[actionEnum.moveLeft.ordinal()] = mvLf;

		JPanel gd = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.Guard.ordinal()),
						0, 0, null);
			}
		};
		gd.setBounds(actionPositionX(actionEnum.Guard.ordinal()), actionPositionY(actionEnum.Guard.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(gd);
		pnlAction[actionEnum.Guard.ordinal()] = gd;

		JPanel skill1 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.skill1.ordinal()),
						0, 0, null);
			}
		};
		skill1.setBounds(actionPositionX(actionEnum.skill1.ordinal()), actionPositionY(actionEnum.skill1.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(skill1);
		pnlAction[actionEnum.skill1.ordinal()] = skill1;

		JPanel skill2 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.skill2.ordinal()),
						0, 0, null);
			}
		};
		skill2.setBounds(actionPositionX(actionEnum.skill2.ordinal()), actionPositionY(actionEnum.skill2.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(skill2);
		pnlAction[actionEnum.skill2.ordinal()] = skill2;

		JPanel skill3 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.skill3.ordinal()),
						0, 0, null);
			}
		};
		skill3.setBounds(actionPositionX(actionEnum.skill3.ordinal()), actionPositionY(actionEnum.skill3.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(skill3);
		pnlAction[actionEnum.skill3.ordinal()] = skill3;

		JPanel skill4 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.skill4.ordinal()),
						0, 0, null);
			}
		};
		skill4.setBounds(actionPositionX(actionEnum.skill4.ordinal()), actionPositionY(actionEnum.skill4.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(skill4);
		pnlAction[actionEnum.skill4.ordinal()] = skill4;

		JPanel enUP = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(
						imgsrc.srcComboCards(actionPick.getPlayer1Character().getID(), actionEnum.energyUp.ordinal()),
						0, 0, null);
			}
		};
		enUP.setBounds(actionPositionX(actionEnum.energyUp.ordinal()), actionPositionY(actionEnum.energyUp.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		add(enUP);
		pnlAction[actionEnum.energyUp.ordinal()] = enUP;

		JButton btnmvDw = new JButton();
		btnmvDw.setBounds(actionPositionX(actionEnum.moveDown.ordinal()),
				actionPositionY(actionEnum.moveDown.ordinal()), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnmvDw.setBorderPainted(false);
		btnmvDw.setContentAreaFilled(false);
		getContentPane().add(btnmvDw);

		JButton btnmvUp = new JButton();
		btnmvUp.setBounds(actionPositionX(actionEnum.moveUp.ordinal()), actionPositionY(actionEnum.moveUp.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnmvUp.setBorderPainted(false);
		btnmvUp.setContentAreaFilled(false);
		getContentPane().add(btnmvUp);

		JButton btnmvRt = new JButton();
		btnmvRt.setBounds(actionPositionX(actionEnum.moveRight.ordinal()),
				actionPositionY(actionEnum.moveRight.ordinal()), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnmvRt.setBorderPainted(false);
		btnmvRt.setContentAreaFilled(false);
		getContentPane().add(btnmvRt);

		JButton btnmvLf = new JButton();
		btnmvLf.setBounds(actionPositionX(actionEnum.moveLeft.ordinal()),
				actionPositionY(actionEnum.moveLeft.ordinal()), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnmvLf.setBorderPainted(false);
		btnmvLf.setContentAreaFilled(false);
		getContentPane().add(btnmvLf);

		JButton btnGd = new JButton();
		btnGd.setBounds(actionPositionX(actionEnum.Guard.ordinal()), actionPositionY(actionEnum.Guard.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnGd.setBorderPainted(false);
		btnGd.setContentAreaFilled(false);
		getContentPane().add(btnGd);

		JButton btnskill1 = new JButton();
		btnskill1.setBounds(actionPositionX(actionEnum.skill1.ordinal()), actionPositionY(actionEnum.skill1.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnskill1.setBorderPainted(false);
		btnskill1.setContentAreaFilled(false);
		getContentPane().add(btnskill1);

		JButton btnskill2 = new JButton();
		btnskill2.setBounds(actionPositionX(actionEnum.skill2.ordinal()), actionPositionY(actionEnum.skill2.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnskill2.setBorderPainted(false);
		btnskill2.setContentAreaFilled(false);
		getContentPane().add(btnskill2);

		JButton btnskill3 = new JButton();
		btnskill3.setBounds(actionPositionX(actionEnum.skill3.ordinal()), actionPositionY(actionEnum.skill3.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnskill3.setBorderPainted(false);
		btnskill3.setContentAreaFilled(false);
		getContentPane().add(btnskill3);

		JButton btnskill4 = new JButton();
		btnskill4.setBounds(actionPositionX(actionEnum.skill4.ordinal()), actionPositionY(actionEnum.skill4.ordinal()),
				ACTION_SIZE_X, ACTION_SIZE_Y);
		btnskill4.setBorderPainted(false);
		btnskill4.setContentAreaFilled(false);
		getContentPane().add(btnskill4);

		JButton btnenUp = new JButton();
		btnenUp.setBounds(actionPositionX(actionEnum.energyUp.ordinal()),
				actionPositionY(actionEnum.energyUp.ordinal()), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnenUp.setBorderPainted(false);
		btnenUp.setContentAreaFilled(false);
		getContentPane().add(btnenUp);

		btnmvDw.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.moveDown.ordinal()))
				{
					listOn(actionEnum.moveDown.ordinal());
				}
			}
		});
		btnmvUp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.moveUp.ordinal()))
				{
					listOn(actionEnum.moveUp.ordinal());
				}
			}
		});
		btnmvRt.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.moveRight.ordinal()))
				{
					listOn(actionEnum.moveRight.ordinal());
				}
			}
		});
		btnmvLf.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.moveLeft.ordinal()))
				{
					listOn(actionEnum.moveLeft.ordinal());
				}
			}
		});
		btnGd.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.Guard.ordinal()))
				{
					listOn(actionEnum.Guard.ordinal());
				}
			}
		});
		btnskill1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.skill1.ordinal()))
				{
					listOn(actionEnum.skill1.ordinal());
				}
			}
		});
		btnskill2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.skill2.ordinal()))
				{
					listOn(actionEnum.skill2.ordinal());
				}
			}
		});
		btnskill3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.skill3.ordinal()))
				{
					listOn(actionEnum.skill3.ordinal());
				}
			}
		});
		btnskill4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.skill4.ordinal()))
				{
					listOn(actionEnum.skill4.ordinal());
				}
			}
		});
		btnenUp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsValidAction(actionEnum.energyUp.ordinal()))
				{
					listOn(actionEnum.energyUp.ordinal());
				}
			}
		});
		/*
		 * Combo list
		 */

		JPanel combo1 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcCombo1(), 0, 0, null);
			}
		};
		combo1.setBounds(listPositionX(FIRST_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(combo1);

		JPanel combo2 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcCombo2(), 0, 0, null);
			}
		};
		combo2.setBounds(listPositionX(SECOND_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(combo2);

		JPanel combo3 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				g.drawImage(imgsrc.srcCombo3(), 0, 0, null);
			}
		};
		combo3.setBounds(listPositionX(THIRD_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		add(combo3);

		JButton btnCombo1 = new JButton();
		btnCombo1.setBounds(listPositionX(FIRST_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnCombo1.setBorderPainted(false);
		btnCombo1.setContentAreaFilled(false);
		getContentPane().add(btnCombo1);

		JButton btnCombo2 = new JButton();
		btnCombo2.setBounds(listPositionX(SECOND_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnCombo2.setContentAreaFilled(false);
		getContentPane().add(btnCombo2);

		JButton btnCombo3 = new JButton();
		btnCombo3.setBounds(listPositionX(THIRD_LIST_INDEX), listPositionY(), ACTION_SIZE_X, ACTION_SIZE_Y);
		btnCombo3.setBorderPainted(false);
		btnCombo3.setContentAreaFilled(false);
		getContentPane().add(btnCombo3);

		btnCombo1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsOccupiedList(FIRST_LIST_INDEX))
				{
					listOff(FIRST_LIST_INDEX);
				}
			}
		});

		btnCombo2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsOccupiedList(SECOND_LIST_INDEX))
				{
					listOff(SECOND_LIST_INDEX);
				}
			}
		});

		btnCombo3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (actionPick.getIsOccupiedList(THIRD_LIST_INDEX))
				{
					listOff(THIRD_LIST_INDEX);
				}
			}
		});
		hideInvalidAction();

	}

	public void hideInvalidAction()
	{
		for (int i = 0; i < NUMBER_OF_ACTION; i++)
		{
			if (actionPick.isNotEnoughEN(i))
			{
				if (!actionPick.isInList(i))
				{
					pnlAction[i].setVisible(false);
					actionPick.setIsValidAction(i, false);
				}
			} else
			{
				if (actionPick.isInList(i))
					actionPick.setIsValidAction(i, false);
				else
				{
					pnlAction[i].setVisible(true);
					actionPick.setIsValidAction(i, true);
				}
			}
		}
	}

	public void listOn(int cardID)
	{
		if (!actionPick.isDone())
		{
			pnlAction[cardID].setBounds(listPositionX(actionPick.currentList()), listPositionY(), ACTION_SIZE_X,
					ACTION_SIZE_Y);
			actionPick.listOn(cardID);
			hideInvalidAction();
		}
	}

	public void listOff(int listIndex)
	{
		pnlAction[actionPick.getActionList()[listIndex]].setBounds(
				actionPositionX(actionPick.getActionList()[listIndex]),
				actionPositionY(actionPick.getActionList()[listIndex]), ACTION_SIZE_X, ACTION_SIZE_Y);
		actionPick.listOff(listIndex);
		hideInvalidAction();
	}

	public void clear()
	{
		if (actionPick.getIsOccupiedList(THIRD_LIST_INDEX))
		{
			listOff(THIRD_LIST_INDEX);
			hideInvalidAction();
		}
		if (actionPick.getIsOccupiedList(SECOND_LIST_INDEX))
		{
			listOff(SECOND_LIST_INDEX);
			hideInvalidAction();
		}
		if (actionPick.getIsOccupiedList(FIRST_LIST_INDEX))
		{
			listOff(FIRST_LIST_INDEX);
			hideInvalidAction();
		}
	}

	public void setMap()
	{

		JPanel pnlPlayer1MapS = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcMapPlayerS(actionPick.getPlayer1Character().getID()), 0, 0, null);
			}
		};
		pnlPlayer1MapS.setBounds(smallMapPlayer1PositionX(actionPick.getPlayer1Character().getX()),
				smallMapPositionY(actionPick.getPlayer1Character().getY()), SMALL_MAP_CHARACTER_SIZE_X,
				SMALL_MAP_CHARACTER_SIZE_Y);
		add(pnlPlayer1MapS);

		JPanel pnlPlayer2MapS = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcMapPlayerS(actionPick.getPlayer2Character().getID()), 0, 0, null);
			}
		};
		pnlPlayer2MapS.setBounds(smallMapPlayer2PositionX(actionPick.getPlayer2Character().getX()),
				smallMapPositionY(actionPick.getPlayer2Character().getY()), SMALL_MAP_CHARACTER_SIZE_X,
				SMALL_MAP_CHARACTER_SIZE_Y);
		add(pnlPlayer2MapS);

		JPanel pnlSmallMap = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.setColor(Color.black);
				for (int i = 0; i < MAP_ROW; i++)
				{
					for (int j = 0; j < MAP_COLUMN; j++)
					{
						g.drawRect(SMALL_MAP_RECT_SIZE_X * j, SMALL_MAP_RECT_SIZE_Y * i, SMALL_MAP_RECT_SIZE_X,
								SMALL_MAP_RECT_SIZE_Y);
					}
				}
			}
		};
		pnlSmallMap.setBounds(SMALL_MAP_POSITION_X, SMALL_MAP_POSITION_Y, SMALL_MAP_SIZE_X, SMALL_MAP_SIZE_Y);
		add(pnlSmallMap);
	}

	private static final int smallMapPlayer1PositionX(int x)
	{
		switch (x)
		{
		case 0:
			return 520;
		case 1:
			return 582;
		case 2:
			return 644;
		case 3:
			return 706;
		default:
			System.out.println("mapSp1 x location error");
			return INVALID_ACTION;
		}
	}

	private static final int smallMapPositionY(int y)
	{
		switch (y)
		{
		case 0:
			return 465;
		case 1:
			return 509;
		case 2:
			return 549;
		default:
			System.out.println("mapS y location error");
			return INVALID_ACTION;
		}
	}

	private static final int smallMapPlayer2PositionX(int x)
	{
		switch (x)
		{
		case 0:
			return 550;
		case 1:
			return 612;
		case 2:
			return 674;
		case 3:
			return 736;
		default:
			System.out.println("mapSp2 x location error");
			return INVALID_ACTION;
		}
	}

	private static final int actionPositionX(int x)
	{
		if (x >= 5)
			x -= 5;
		switch (x)
		{
		case 0:
			return 114;
		case 1:
			return 229;
		case 2:
			return 342;
		case 3:
			return 455;
		case 4:
			return 568;
		default:
			System.out.println("invalid combo x location");
			return INVALID_ACTION;
		}
	}

	private static final int actionPositionY(int y)
	{
		y /= 5;
		switch (y)
		{
		case 0:
			return 75;
		case 1:
			return 198;
		default:
			System.out.println("invalid combo y location");
			return INVALID_ACTION;
		}
	}

	private static final int listPositionX(int x)
	{
		switch (x)
		{
		case 0:
			return 35;
		case 1:
			return 150;
		case 2:
			return 265;
		default:
			System.out.println("invalid combolist x location");
			return INVALID_ACTION;
		}
	}

	private static final int listPositionY()
	{
		return 465;
	}

}
