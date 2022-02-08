package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import gameInterface.InuyashaActionPickPage;
import gameInterface.InuyashaPlayPage;
import resource.Action;
import resource.PlayableCharacter;

public class InuyashaPlay
{
	private static final int NUMBER_OF_ACTION = 10;
	private static final int NUMBER_OF_LIST = 3;
	private static final int MAP_ROW = 3;
	private static final int MAP_COLUMN = 4;
	private static final int PLAYER1 = 1;
	private static final int PLAYER2 = 2;
	private static final int DOWN = 1;
	private static final int UP = 2;
	private static final int RIGHT = 3;
	private static final int LEFT = 4;
	private static final int PLAYER1_LIST_INIT_POSITION = 265;
	private static final int PLAYER2_LIST_INIT_POSITION = 400;
	private static final int PLAYER_LIST_TERM_SIZE = 115;
	private static final int SLEEP_TIME_1SEC = 1000;
	private static final int SLEEP_TIME_3SEC = 3000;
	private static final int SLEEP_TIME_MOVE = 5;
	private static final int SLEEP_TIME_KNOCKBACK = 4;
	private static final int RECOVERY_EN = 15;
	private static final int RECOVER_EN_END_TURN = 15;
	private static final int KNOCKBACK_DISTANCE = 30;
	private static final int REDUCE_DAMAGE_BY_GUARD = 15;
	private PlayableCharacter player1Character;
	private PlayableCharacter player2Character;
	private InuyashaPlayPage playPage;
	private int player1X = 0;
	private int player1Y = 0;
	private int player2X = 0;
	private int player2Y = 0;
	private boolean isDone = false;
	private boolean isPlayer1GuardOn = false, isPlayer2GuardOn = false;
	private boolean isPlayer1ENUp = false, isPlayer2ENUp = false;
	private boolean[] isOpenActionList = new boolean[NUMBER_OF_ACTION];
	private Action actionEnum;
	private ArrayList<Integer> redList = new ArrayList<Integer>();

	public InuyashaPlay(InuyashaPlayPage playPage)
	{
		Arrays.fill(isOpenActionList, false);
		this.playPage = playPage;
	}

	public void gameStart()
	{
		Turn turn = new Turn();
		turn.start();
	}

	class Turn extends Thread
	{
		class Action extends Thread
		{
			private int player;
			private int actionID;

			Action(int player, int actionID)
			{
				this.player = player;
				this.actionID = actionID;
			}

			@Override
			public void run()
			{
				switch (actionID)
				{
				case 0:
					moveDown();
					break;
				case 1:
					moveUp();
					break;
				case 2:
					moveRight();
					break;
				case 3:
					moveLeft();
					break;
				case 4:
					guard();
					break;
				case 5:
					if (player == PLAYER1)
					{
						skill(player, player1Character.getSkill1DamageList(), player1Character.getSkill1Damage(),
								player1Character.costSkill1());
					} else if (player == PLAYER2)
					{
						skill(player, player2Character.getSkill1DamageList(), player2Character.getSkill1Damage(),
								player2Character.costSkill1());
					}
					break;
				case 6:
					if (player == PLAYER1)
					{
						skill(player, player1Character.getSkill2DamageList(), player1Character.getSkill2Damage(),
								player1Character.costSkill2());
					} else if (player == PLAYER2)
					{
						skill(player, player2Character.getSkill2DamageList(), player2Character.getSkill2Damage(),
								player2Character.costSkill2());
					}
					break;
				case 7:
					if (player == PLAYER1)
					{
						skill(player, player1Character.getSkill3DamageList(), player1Character.getSkill3Damage(),
								player1Character.costSkill3());
					} else if (player == PLAYER2)
					{
						skill(player, player2Character.getSkill3DamageList(), player2Character.getSkill3Damage(),
								player2Character.costSkill3());
					}
					break;
				case 8:
					if (player == PLAYER1)
					{
						skill(player, player1Character.getSkill4DamageList(), player1Character.getSkill4Damage(),
								player1Character.costSkill4());
					} else if (player == PLAYER2)
					{
						skill(player, player2Character.getSkill4DamageList(), player2Character.getSkill4Damage(),
								player2Character.costSkill4());
					}
					break;
				case 9:
					energyUp();
					break;
				default:
					System.out.println("action error");
				}
				playPage.updatePlayerStatus();
			}

			public void setxy()
			{
				if (player == PLAYER1)
				{
					player1X = playPage.largeMapPlayer1PositionX(player1Character.getX());
					player1Y = playPage.largeMapPositionY(player1Character.getY());
				} else if (player == PLAYER2)
				{
					player2X = playPage.largeMapPlayer2PositionX(player2Character.getX());
					player2Y = playPage.largeMapPositionY(player2Character.getY());
				}
			}

			public void move(int start, int finish, int type)
			{
				while (start != finish)
				{
					if (player == PLAYER1)
					{
						switch (type)
						{
						case DOWN:
							start = ++player1Y;
							break;
						case UP:
							start = --player1Y;
							break;
						case RIGHT:
							start = ++player1X;
							break;
						case LEFT:
							start = --player1X;
							break;
						default:
							break;
						}
					} else if (player == PLAYER2)
					{
						switch (type)
						{
						case DOWN:
							start = ++player2Y;
							break;
						case UP:
							start = --player2Y;
							break;
						case RIGHT:
							start = ++player2X;
							break;
						case LEFT:
							start = --player2X;
							break;
						default:
							break;
						}
					}
					playPage.move(player);
					try
					{
						Thread.sleep(SLEEP_TIME_MOVE);
					} catch (InterruptedException e)
					{
						System.out.println(e);
					}

				}
			}

			public void moveDown()
			{
				setxy();
				if (player == PLAYER1)
				{
					if (player1Character.getY() < MAP_ROW - 1)
						player1Character.setY(player1Character.getY() + 1);
					move(player1Y, playPage.largeMapPositionY(player1Character.getY()), DOWN);
				} else if (player == PLAYER2)
				{
					if (player2Character.getY() < MAP_ROW - 1)
						player2Character.setY(player2Character.getY() + 1);
					move(player2Y, playPage.largeMapPositionY(player2Character.getY()), DOWN);
				}
			}

			public void moveUp()
			{
				setxy();
				if (player == PLAYER1)
				{
					if (player1Character.getY() > 0)
						player1Character.setY(player1Character.getY() - 1);
					move(player1Y, playPage.largeMapPositionY(player1Character.getY()), UP);
				} else if (player == PLAYER2)
				{
					if (player2Character.getY() > 0)
						player2Character.setY(player2Character.getY() - 1);
					move(player2Y, playPage.largeMapPositionY(player2Character.getY()), UP);
				}
			}

			public void moveRight()
			{
				setxy();
				if (player == PLAYER1)
				{
					if (player1Character.getX() < MAP_COLUMN - 1)
						player1Character.setX(player1Character.getX() + 1);
					move(player1X, playPage.largeMapPlayer1PositionX(player1Character.getX()), RIGHT);
				} else if (player == PLAYER2)
				{
					if (player2Character.getX() < MAP_COLUMN - 1)
						player2Character.setX(player2Character.getX() + 1);
					move(player2X, playPage.largeMapPlayer2PositionX(player2Character.getX()), RIGHT);
				}
			}

			public void moveLeft()
			{
				setxy();
				if (player == PLAYER1)
				{
					if (player1Character.getX() > 0)
						player1Character.setX(player1Character.getX() - 1);
					move(player1X, playPage.largeMapPlayer1PositionX(player1Character.getX()), LEFT);
				} else if (player == PLAYER2)
				{
					if (player2Character.getX() > 0)
						player2Character.setX(player2Character.getX() - 1);
					move(player2X, playPage.largeMapPlayer2PositionX(player2Character.getX()), LEFT);
				}
			}

			public void guard()
			{
				if (player == PLAYER1)
					isPlayer1GuardOn = true;
				else if (player == PLAYER2)
					isPlayer2GuardOn = true;
				playPage.repaintPlayer(player);
			}

			public void skill(int player, Stack<Integer> damagelist, int damage, int cost)
			{
				fillRedRect(player, damagelist);
				Thread knockback = new Thread()
				{
					@Override
					public void run()
					{
						if (player == PLAYER2)
						{
							player1X = playPage.largeMapPlayer1PositionX(player1Character.getX());
							player1Y = playPage.largeMapPositionY(player1Character.getY());
						} else if (player == PLAYER1)
						{
							player2X = playPage.largeMapPlayer2PositionX(player2Character.getX());
							player2Y = playPage.largeMapPositionY(player2Character.getY());
						}
						for (int i = 0; i < KNOCKBACK_DISTANCE; i++)
						{
							if (i < KNOCKBACK_DISTANCE / 2)
							{
								if (player == PLAYER2)
								{
									if (player1Character.getX() > player2Character.getX())
										player1X++;
									else
										player1X--;
								} else if (player == PLAYER1)
								{
									if (player1Character.getX() > player2Character.getX())
										player2X--;
									else
										player2X++;
								}
							} else
							{
								if (player == PLAYER2)
								{
									if (player1Character.getX() > player2Character.getX())
										player1X--;
									else
										player1X++;
								} else if (player == PLAYER1)
								{
									if (player1Character.getX() > player2Character.getX())
										player2X++;
									else
										player2X--;
								}
							}
							playPage.move(3 - player); // the foe player
							try
							{
								Thread.sleep(SLEEP_TIME_KNOCKBACK);
							} catch (InterruptedException e)
							{
								System.out.println(e);
							}
						}
					}
				};
				if (player == PLAYER1)
				{
					player1Character.setEN(player1Character.getEN() - cost);
					if (isInRange(PLAYER2))
					{
						if (isPlayer2GuardOn)
						{
							player2Character.setHP(player2Character.getHP() - damage + REDUCE_DAMAGE_BY_GUARD);
						} else
						{
							player2Character.setHP(player2Character.getHP() - damage);
							knockback.start();
							try
							{
								knockback.join();
							} catch (InterruptedException e)
							{
								e.printStackTrace();
							}
						}

					}
				} else if (player == PLAYER2)
				{
					player2Character.setEN(player2Character.getEN() - cost);
					if (isInRange(PLAYER1))
					{
						if (isPlayer1GuardOn)
						{
							player1Character.setHP(player1Character.getHP() - damage + REDUCE_DAMAGE_BY_GUARD);
						} else
						{
							player1Character.setHP(player1Character.getHP() - damage);
							knockback.start();
							try
							{
								knockback.join();
							} catch (InterruptedException e)
							{
								e.printStackTrace();
							}
						}
					}
				}
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				clearRedRect();
			}

			public void energyUp()
			{
				if (player == PLAYER1)
				{
					player1Character.setEN(player1Character.getEN() + RECOVERY_EN);
					isPlayer1ENUp = true;
				} else if (player == PLAYER2)
				{
					player2Character.setEN(player2Character.getEN() + RECOVERY_EN);
					isPlayer2ENUp = true;
				}
				playPage.repaintPlayer(player);
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				if (player == PLAYER1)
				{
					isPlayer1ENUp = false;
				} else if (player == PLAYER2)
				{
					isPlayer2ENUp = false;
				}
				playPage.repaintPlayer(player);
			}
		}

		@Override
		public void run()
		{
			for (int i = 0; i < NUMBER_OF_LIST; i++)
			{
				Action player1 = new Action(PLAYER1, player1Character.getActionsID()[i]);
				Action player2 = new Action(PLAYER2, player2Character.getActionsID()[i]);
				/*
				 * 1. 카드를 깐다.
				 */
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				isOpenActionList[i] = true;
				playPage.updateActionList();

				/*
				 * 2. 각 플레이어마다 액션을 취한다.
				 */
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				if (player1Character.getActionsID()[i] < actionEnum.skill1.ordinal()
						&& player2Character.getActionsID()[i] >= actionEnum.skill1.ordinal())
				{
					player1.start();
					try
					{
						player1.join();
						Thread.sleep(SLEEP_TIME_1SEC);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					player2.start();
					try
					{
						player2.join();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				} else
				{
					player2.start();
					try
					{
						player2.join();
						Thread.sleep(SLEEP_TIME_1SEC);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					player1.start();
					try
					{
						player1.join();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				if (isPlayer1GuardOn)
				{
					isPlayer1GuardOn = false;
					playPage.repaintPlayer(PLAYER1);
				}
				if (isPlayer2GuardOn)
				{
					isPlayer2GuardOn = false;
					playPage.repaintPlayer(PLAYER2);
				}
				try
				{
					Thread.sleep(SLEEP_TIME_1SEC);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
				/*
				 * 3. 카드를 옮긴다.
				 */
				int k = 0;
				for (int j = i; j < NUMBER_OF_LIST - 1; j++)
				{
					playPage.setPositionActionList(PLAYER1, j + 1,
							PLAYER1_LIST_INIT_POSITION - PLAYER_LIST_TERM_SIZE * k);
					playPage.setPositionActionList(PLAYER2, j + 1,
							PLAYER2_LIST_INIT_POSITION + PLAYER_LIST_TERM_SIZE * k);
					k++;
				}
				if (i < NUMBER_OF_LIST - 1)
				{
					playPage.setInvisibleActionList(PLAYER1, i);
					playPage.setInvisibleActionList(PLAYER2, i);
				}
				if (player1Character.getHP() == 0)
				{
					playPage.winGame(PLAYER2);
					try
					{
						Thread.sleep(SLEEP_TIME_3SEC);
					} catch (InterruptedException e)
					{
						System.out.println(e);
					}
					System.exit(0);
				} else if (player2Character.getHP() == 0)
				{
					playPage.winGame(PLAYER1);
					try
					{
						Thread.sleep(SLEEP_TIME_3SEC);
					} catch (InterruptedException e)
					{
						System.out.println(e);
					}
					System.exit(0);
				}
			}
			isDone = true;
			playPage.setVisibleNextRound();
			player1Character.setEN(player1Character.getEN() + RECOVER_EN_END_TURN);
			player2Character.setEN(player2Character.getEN() + RECOVER_EN_END_TURN);
		}
	}

	public void goToActionPickPage()
	{
		if (isDone)
		{
			InuyashaActionPickPage actionPickPage = new InuyashaActionPickPage();
			InuyashaActionPick actionPick = new InuyashaActionPick(actionPickPage);
			actionPick.setPlayer1Character(player1Character);
			actionPick.setPlayer2Character(player2Character);
			actionPick.initializeCostAndEN();
			actionPickPage.setActionPick(actionPick);
			actionPickPage.setMap();
			actionPickPage.setUI();
			playPage.setVisible(false);
		}
	}

	public boolean isInRange(int player)
	{
		if (player == PLAYER1)
		{
			if (redList.contains(XYToIndex(player1Character.getX(), player1Character.getY())))
			{
				return true;
			} else
				return false;
		} else if (player == PLAYER2)
		{
			if (redList.contains(XYToIndex(player2Character.getX(), player2Character.getY())))
			{
				return true;
			} else
				return false;
		}
		return false;
	}

	public void fillRedRect(int player, Stack<Integer> damagelist)
	{
		while (!damagelist.isEmpty())
		{
			int elem = damagelist.pop();
			switch (elem)
			{
			case 1:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() - 1, player1Character.getY() + 1))
						redList.add(XYToIndex(player1Character.getX() - 1, player1Character.getY() + 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() - 1, player2Character.getY() + 1))
						;
					redList.add(XYToIndex(player2Character.getX() - 1, player2Character.getY() + 1));
				}
				break;
			case 2:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX(), player1Character.getY() + 1))
						redList.add(XYToIndex(player1Character.getX(), player1Character.getY() + 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX(), player2Character.getY() + 1))
						redList.add(XYToIndex(player2Character.getX(), player2Character.getY() + 1));
				}
				break;
			case 3:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() + 1, player1Character.getY() + 1))
						redList.add(XYToIndex(player1Character.getX() + 1, player1Character.getY() + 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() + 1, player2Character.getY() + 1))
						redList.add(XYToIndex(player2Character.getX() + 1, player2Character.getY() + 1));
				}
				break;
			case 4:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() - 1, player1Character.getY()))
						redList.add(XYToIndex(player1Character.getX() - 1, player1Character.getY()));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() - 1, player2Character.getY()))
						redList.add(XYToIndex(player2Character.getX() - 1, player2Character.getY()));
				}
				break;
			case 5:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX(), player1Character.getY()))
						redList.add(XYToIndex(player1Character.getX(), player1Character.getY()));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX(), player2Character.getY()))
						redList.add(XYToIndex(player2Character.getX(), player2Character.getY()));
				}
				break;
			case 6:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() + 1, player1Character.getY()))
						redList.add(XYToIndex(player1Character.getX() + 1, player1Character.getY()));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() + 1, player2Character.getY()))
						redList.add(XYToIndex(player2Character.getX() + 1, player2Character.getY()));
				}
				break;
			case 7:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() - 1, player1Character.getY() - 1))
						redList.add(XYToIndex(player1Character.getX() - 1, player1Character.getY() - 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() - 1, player2Character.getY() - 1))
						redList.add(XYToIndex(player2Character.getX() - 1, player2Character.getY() - 1));
				}
				break;
			case 8:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX(), player1Character.getY() - 1))
						redList.add(XYToIndex(player1Character.getX(), player1Character.getY() - 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX(), player2Character.getY() - 1))
						redList.add(XYToIndex(player2Character.getX(), player2Character.getY() - 1));
				}
				break;
			case 9:
				if (player == PLAYER1)
				{
					if (canFill(player1Character.getX() + 1, player1Character.getY() - 1))
						redList.add(XYToIndex(player1Character.getX() + 1, player1Character.getY() - 1));
				} else if (player == PLAYER2)
				{
					if (canFill(player2Character.getX() + 1, player2Character.getY() - 1))
						redList.add(XYToIndex(player2Character.getX() + 1, player2Character.getY() - 1));
				}
				break;
			default:
				System.out.println("damagelist error");
				break;
			}
		}
		playPage.repaintMap();
	}

	public boolean isInRedList(int x, int y)
	{
		return redList.contains(XYToIndex(x, y));
	}

	public void clearRedRect()
	{
		redList.clear();
		playPage.repaintMap();
	}

	public boolean canFill(int x, int y)
	{
		return (x >= 0 && x < MAP_COLUMN && y >= 0 && y < MAP_ROW);
	}

	public int XYToIndex(int X, int Y)
	{
		if (Y == 0)
		{
			switch (X)
			{
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 4;
			}
		} else if (Y == 1)
		{
			switch (X)
			{
			case 0:
				return 5;
			case 1:
				return 6;
			case 2:
				return 7;
			case 3:
				return 8;
			}
		} else if (Y == 2)
		{
			switch (X)
			{
			case 0:
				return 9;
			case 1:
				return 10;
			case 2:
				return 11;
			case 3:
				return 12;
			}
		}
		return 0;
	}

	public int getPlayer1X()
	{
		return player1X;
	}

	public int getPlayer1Y()
	{
		return player1Y;
	}

	public int getPlayer2X()
	{
		return player2X;
	}

	public int getPlayer2Y()
	{
		return player2Y;
	}

	public void setPlayer1X(int x)
	{
		player1X = x;
	}

	public void setPlayer1Y(int y)
	{
		player1Y = y;
	}

	public void setPlayer2X(int x)
	{
		player2X = x;
	}

	public void setPlayer2Y(int y)
	{
		player2Y = y;
	}

	public boolean getIsPlayer1ENUp()
	{
		return isPlayer1ENUp;
	}

	public boolean getIsPlayer2ENUp()
	{
		return isPlayer2ENUp;
	}

	public boolean getIsPlayer1GuardOn()
	{
		return isPlayer1GuardOn;
	}

	public boolean getIsPlayer2GuardOn()
	{
		return isPlayer2GuardOn;
	}

	public boolean[] getIsOpenActionList()
	{
		return isOpenActionList;
	}

	public boolean getIsDone()
	{
		return isDone;
	}

	public int CalculateBarLength(int max, int value)
	{
		double result = 0.0;
		result = max * ((double) value / 100);
		return (int) result;
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
}
