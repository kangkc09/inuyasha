package resource;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgSrc
{
	private BufferedImage img = null;
	
	public BufferedImage srcPlayer1Win()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/inuplayer1win.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcPlayer2Win()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/inuplayer2win.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}
	public BufferedImage srcNextRound()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/nextround.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcClear()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/clear.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcBackCard()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/backcard.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcContinue()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/continue.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcStartPage()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/startpage.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcCharacterSelectPage()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/selectCharacter.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcVersus()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/versus.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcVersusS()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/versusS.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcNext()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/rightarrow.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcRandom()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/randombox.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srctest()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/inuyasha.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcCombo1()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/combo1.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcCombo2()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/combo2.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcCombo3()
	{
		try
		{
			img = ImageIO.read(new File("src/resourceFile/combo3.png"));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcprofPlayerL(int id)
	{
		String source = null;
		switch (id)
		{
		case 1:
			source = "src/resourceFile/profInuyashaL.png";
			break;
		case 2:
			source = "src/resourceFile/profKagomeL.png";
			break;
		case 3:
			source = "src/resourceFile/profSangoL.png";
			break;
		case 4:
			source = "src/resourceFile/profMirokuL.png";
			break;
		case 5:
			source = "src/resourceFile/profKaguraL.png";
			break;
		case 6:
			source = "src/resourceFile/profKogaL.png";
			break;
		case 7:
			source = "src/resourceFile/profSesshomaruL.png";
			break;
		case 8:
			source = "src/resourceFile/profNarakuL.png";
			break;
		default:
			System.out.println("PlayerL error");
			System.exit(0);
			break;
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcprofPlayerM(int id)
	{
		String source = null;
		switch (id)
		{
		case 1:
			source = "src/resourceFile/profInuyashaM.png";
			break;
		case 2:
			source = "src/resourceFile/profKagomeM.png";
			break;
		case 3:
			source = "src/resourceFile/profSangoM.png";
			break;
		case 4:
			source = "src/resourceFile/profMirokuM.png";
			break;
		case 5:
			source = "src/resourceFile/profKaguraM.png";
			break;
		case 6:
			source = "src/resourceFile/profKogaM.png";
			break;
		case 7:
			source = "src/resourceFile/profSesshomaruM.png";
			break;
		case 8:
			source = "src/resourceFile/profNarakuM.png";
			break;
		default:
			System.out.println("PlayerM case error");
			System.exit(0);
			break;
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcprofPlayerS(int id)
	{
		String source = null;
		switch (id)
		{
		case 1:
			source = "src/resourceFile/profInuyashaS.png";
			break;
		case 2:
			source = "src/resourceFile/profKagomeS.png";
			break;
		case 3:
			source = "src/resourceFile/profSangoS.png";
			break;
		case 4:
			source = "src/resourceFile/profMirokuS.png";
			break;
		case 5:
			source = "src/resourceFile/profKaguraS.png";
			break;
		case 6:
			source = "src/resourceFile/profKogaS.png";
			break;
		case 7:
			source = "src/resourceFile/profSesshomaruS.png";
			break;
		case 8:
			source = "src/resourceFile/profNarakuS.png";
			break;
		default:
			System.out.println("PlayerM case error");
			System.exit(0);
			break;
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcMapPlayerS(int id)
	{
		String source = null;
		switch (id)
		{
		case 1:
			source = "src/resourceFile/mapinuS.png";
			break;
		case 2:
			source = "src/resourceFile/mapkgmS.png";
			break;
		case 3:
			source = "src/resourceFile/mapsanS.png";
			break;
		case 4:
			source = "src/resourceFile/mapmirS.png";
			break;
		case 5:
			source = "src/resourceFile/mapkgrS.png";
			break;
		case 6:
			source = "src/resourceFile/mapkogS.png";
			break;
		case 7:
			source = "src/resourceFile/mapssmS.png";
			break;
		case 8:
			source = "src/resourceFile/mapnarS.png";
			break;
		default:
			System.out.println("mapS char case error");
			System.exit(0);
			break;
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcMapPlayerL(int player, int id)
	{
		String source = null;
		if (player == 1)
		{
			switch (id)
			{
			case 1:
				source = "src/resourceFile/1pinuyasha.png";
				break;
			case 2:
				source = "src/resourceFile/1pkagome.png";
				break;
			case 3:
				source = "src/resourceFile/1psango.png";
				break;
			case 4:
				source = "src/resourceFile/1pmiroku.png";
				break;
			case 5:
				source = "src/resourceFile/1pkagura.png";
				break;
			case 6:
				source = "src/resourceFile/1pkoga.png";
				break;
			case 7:
				source = "src/resourceFile/1psesshomaru.png";
				break;
			case 8:
				source = "src/resourceFile/1pnaraku.png";
				break;
			default:
				System.out.println("mapL char case error");
				System.exit(0);
				break;
			}
		} else if (player == 2)
		{
			switch (id)
			{
			case 1:
				source = "src/resourceFile/2pinuyasha.png";
				break;
			case 2:
				source = "src/resourceFile/2pkagome.png";
				break;
			case 3:
				source = "src/resourceFile/2psango.png";
				break;
			case 4:
				source = "src/resourceFile/2pmiroku.png";
				break;
			case 5:
				source = "src/resourceFile/2pkagura.png";
				break;
			case 6:
				source = "src/resourceFile/2pkoga.png";
				break;
			case 7:
				source = "src/resourceFile/2psesshomaru.png";
				break;
			case 8:
				source = "src/resourceFile/2pnaraku.png";
				break;
			default:
				System.out.println("mapL char case error");
				System.exit(0);
				break;
			}
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(e);
		}
		return img;
	}

	public BufferedImage srcComboCards(int characterID, int cardID)
	{
		String source = null;
		switch (characterID)
		{
		case 1:
			source = inuyashaCard(cardID);
			break;
		case 2:
			source = kagomeCard(cardID);
			break;
		case 3:
			source = sangoCard(cardID);
			break;
		case 4:
			source = mirokuCard(cardID);
			break;
		case 5:
			source = kaguraCard(cardID);
			break;
		case 6:
			source = kogaCard(cardID);
			break;
		case 7:
			source = sesshomaruCard(cardID);
			break;
		case 8:
			source = narakuCard(cardID);
			break;
		default:
			System.out.println("characterID case error");
			System.exit(0);
			break;
		}
		try
		{
			img = ImageIO.read(new File(source));
		} catch (IOException e)
		{
			System.out.println(source);
		}
		return img;
	}

	public String inuyashaCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/inuMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/inuMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/inuMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/inuMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/inuGd.png";
			break;
		case 5:
			source = "src/resourceFile/inuSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/inuSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/inuSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/inuSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/inuEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String kagomeCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/kgmMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/kgmMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/kgmMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/kgmMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/kgmGd.png";
			break;
		case 5:
			source = "src/resourceFile/kgmSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/kgmSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/kgmSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/kgmSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/kgmEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String sangoCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/sanMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/sanMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/sanMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/sanMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/sanGd.png";
			break;
		case 5:
			source = "src/resourceFile/sanSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/sanSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/sanSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/sanSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/sanEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String mirokuCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/mirMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/mirMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/mirMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/mirMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/mirGd.png";
			break;
		case 5:
			source = "src/resourceFile/mirSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/mirSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/mirSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/mirSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/mirEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String kaguraCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/kgrMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/kgrMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/kgrMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/kgrMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/kgrGd.png";
			break;
		case 5:
			source = "src/resourceFile/kgrSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/kgrSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/kgrSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/kgrSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/kgrEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String kogaCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/kogMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/kogMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/kogMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/kogMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/kogGd.png";
			break;
		case 5:
			source = "src/resourceFile/kogSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/kogSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/kogSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/kogSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/kogEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String sesshomaruCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/ssmMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/ssmMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/ssmMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/ssmMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/ssmGd.png";
			break;
		case 5:
			source = "src/resourceFile/ssmSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/ssmSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/ssmSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/ssmSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/ssmEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

	public String narakuCard(int cardID)
	{
		String source = null;
		switch (cardID)
		{
		case 0:
			source = "src/resourceFile/narMvDw.png";
			break;
		case 1:
			source = "src/resourceFile/narMvUp.png";
			break;
		case 2:
			source = "src/resourceFile/narMvRt.png";
			break;
		case 3:
			source = "src/resourceFile/narMvLf.png";
			break;
		case 4:
			source = "src/resourceFile/narGd.png";
			break;
		case 5:
			source = "src/resourceFile/narSkill1.png";
			break;
		case 6:
			source = "src/resourceFile/narSkill2.png";
			break;
		case 7:
			source = "src/resourceFile/narSkill3.png";
			break;
		case 8:
			source = "src/resourceFile/narSkill4.png";
			break;
		case 9:
			source = "src/resourceFile/narEnUp.png";
			break;
		default:
			System.out.println("cardID case error");
			System.exit(0);
			break;
		}
		return source;
	}

}
