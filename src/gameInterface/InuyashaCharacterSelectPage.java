package gameInterface;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import game.InuyashaCharacterSelect;
import resource.CharacterID;
import resource.ImgSrc;
import resource.Inuyasha;
import resource.Kagome;
import resource.Kagura;
import resource.Koga;
import resource.Miroku;
import resource.Naraku;
import resource.PlayableCharacter;
import resource.Sango;
import resource.Sesshomaru;

public class InuyashaCharacterSelectPage
{
	private static final int VERSUS_POSITION_X=340;
	private static final int VERSUS_POSITION_Y=40;
	private static final int VERSUS_SIZE_X=120;
	private static final int VERSUS_SIZE_Y=120;
	private static final int NEXT_POSITION_X=638;
	private static final int NEXT_POSITION_Y=489;
	private static final int NEXT_SIZE_X=120;
	private static final int NEXT_SIZE_Y=90;
	private static final int RANDOM_POSITION_X=330;
	private static final int RANDOM_POSITION_Y=460;
	private static final int RANDOM_SIZE_X=120;
	private static final int RANDOM_SIZE_Y=120;
	private static final int CHARACTER_PICK_SIZE_X=120;
	private static final int CHARACTER_PICK_SIZE_Y=120;
	private static final int PLAYER1_POSITION_X=175;
	private static final int PLAYER1_POSITION_Y=15;
	private static final int PLAYER1_SIZE_X=150;
	private static final int PLAYER1_SIZE_Y=150;
	private static final int PLAYER2_POSITION_X=470;
	private static final int PLAYER2_POSITION_Y=15;
	private static final int PLAYER2_SIZE_X=150;
	private static final int PLAYER2_SIZE_Y=150;

	private ImgSrc imgsrc = new ImgSrc();
	private InuyashaCharacterSelect characterSelect;
	private CharacterID characterEnum;

	public InuyashaCharacterSelectPage(JFrame frm)
	{
		characterSelect=new InuyashaCharacterSelect(frm);
		
		/*
		 * JPanel versus, character, random, player1, player2
		 */
		
		JPanel pnlVersus = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcVersus(), 0, 0, null);
			}
		};
		pnlVersus.setBounds(VERSUS_POSITION_X, VERSUS_POSITION_Y, VERSUS_SIZE_X, VERSUS_SIZE_Y);
		frm.add(pnlVersus);

		JPanel pnlInuyasha = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.inuyasha.ordinal()), 0, 0, null);
			}
		};
		pnlInuyasha.setBounds(characterPositionX(characterEnum.inuyasha.ordinal()), characterPositionY(characterEnum.inuyasha.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlInuyasha);

		JPanel pnlKagome = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.kagome.ordinal()), 0, 0, null);
			}
		};
		pnlKagome.setBounds(characterPositionX(characterEnum.kagome.ordinal()), characterPositionY(characterEnum.kagome.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlKagome);
		
		JPanel pnlSango = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.sango.ordinal()), 0, 0, null);
			}
		};
		pnlSango.setBounds(characterPositionX(characterEnum.sango.ordinal()), characterPositionY(characterEnum.sango.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlSango);
		
		JPanel pnlMiroku = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.miroku.ordinal()), 0, 0, null);
			}
		};
		pnlMiroku.setBounds(characterPositionX(characterEnum.miroku.ordinal()), characterPositionY(characterEnum.miroku.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlMiroku);
		
		JPanel pnlKagura = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.kagura.ordinal()), 0, 0, null);
			}
		};
		pnlKagura.setBounds(characterPositionX(characterEnum.kagura.ordinal()), characterPositionY(characterEnum.kagura.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlKagura);
		
		JPanel pnlKoga = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.koga.ordinal()), 0, 0, null);
			}
		};
		pnlKoga.setBounds(characterPositionX(characterEnum.koga.ordinal()), characterPositionY(characterEnum.koga.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlKoga);
		
		JPanel pnlSesshomaru = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.sesshomaru.ordinal()), 0, 0, null);
			}
		};
		pnlSesshomaru.setBounds(characterPositionX(characterEnum.sesshomaru.ordinal()), characterPositionY(characterEnum.sesshomaru.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlSesshomaru);
		
		JPanel pnlNaraku = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcprofPlayerM(characterEnum.naraku.ordinal()), 0, 0, null);
			}
		};
		pnlNaraku.setBounds(characterPositionX(characterEnum.naraku.ordinal()), characterPositionY(characterEnum.naraku.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		frm.add(pnlNaraku);

		JPanel pnlNext = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcNext(), 0, 0, null);
			}
		};
		pnlNext.setBounds(NEXT_POSITION_X,NEXT_POSITION_Y, NEXT_SIZE_X,NEXT_SIZE_Y);
		frm.add(pnlNext);

		JPanel pnlRandom = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(imgsrc.srcRandom(), 0, 0, null);
			}
		};
		pnlRandom.setBounds(RANDOM_POSITION_X, RANDOM_POSITION_Y, RANDOM_SIZE_X, RANDOM_SIZE_Y);
		frm.add(pnlRandom);
		
		JPanel pnlPlayer1 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				if((characterSelect.getPlayer1CharacterID())!=0)
					g.drawImage(imgsrc.srcprofPlayerL(characterSelect.getPlayer1CharacterID()), 0, 0, null);
			}
		};
		pnlPlayer1.setBounds(PLAYER1_POSITION_X, PLAYER1_POSITION_Y, PLAYER1_SIZE_X, PLAYER1_SIZE_Y);
		frm.add(pnlPlayer1);
		
		JPanel pnlPlayer2 = new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				if(characterSelect.getPlayer2CharacterID()!=0)
					g.drawImage(imgsrc.srcprofPlayerL(characterSelect.getPlayer2CharacterID()), 0, 0, null);
			}
		};
		pnlPlayer2.setBounds(PLAYER2_POSITION_X, PLAYER2_POSITION_Y, PLAYER2_SIZE_X, PLAYER2_SIZE_Y);
		frm.add(pnlPlayer2);
		
		/*
		 * JButton character, player1, player2, next, random
		 */
		
		
		
		JButton btnInuyasha = new JButton();
		btnInuyasha.setBounds(characterPositionX(characterEnum.inuyasha.ordinal()), characterPositionY(characterEnum.inuyasha.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnInuyasha.setBorderPainted(false);
		btnInuyasha.setContentAreaFilled(false);
		frm.getContentPane().add(btnInuyasha);
		
		JButton btnKagome = new JButton();
		btnKagome.setBounds(characterPositionX(characterEnum.kagome.ordinal()), characterPositionY(characterEnum.kagome.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnKagome.setBorderPainted(false);
		btnKagome.setContentAreaFilled(false);
		frm.getContentPane().add(btnKagome);
		
		JButton btnSango = new JButton();
		btnSango.setBounds(characterPositionX(characterEnum.sango.ordinal()), characterPositionY(characterEnum.sango.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnSango.setBorderPainted(false);
		btnSango.setContentAreaFilled(false);
		frm.getContentPane().add(btnSango);
		
		JButton btnMiroku = new JButton();
		btnMiroku.setBounds(characterPositionX(characterEnum.miroku.ordinal()), characterPositionY(characterEnum.miroku.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnMiroku.setBorderPainted(false);
		btnMiroku.setContentAreaFilled(false);
		frm.getContentPane().add(btnMiroku);
		
		JButton btnKagura = new JButton();
		btnKagura.setBounds(characterPositionX(characterEnum.kagura.ordinal()), characterPositionY(characterEnum.kagura.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnKagura.setBorderPainted(false);
		btnKagura.setContentAreaFilled(false);
		frm.getContentPane().add(btnKagura);
		
		JButton btnKoga = new JButton();
		btnKoga.setBounds(characterPositionX(characterEnum.koga.ordinal()), characterPositionY(characterEnum.koga.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnKoga.setBorderPainted(false);
		btnKoga.setContentAreaFilled(false);
		frm.getContentPane().add(btnKoga);
		
		JButton btnSesshomaru = new JButton();
		btnSesshomaru.setBounds(characterPositionX(characterEnum.sesshomaru.ordinal()), characterPositionY(characterEnum.sesshomaru.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnSesshomaru.setBorderPainted(false);
		btnSesshomaru.setContentAreaFilled(false);
		frm.getContentPane().add(btnSesshomaru);
		
		JButton btnNaraku = new JButton();
		btnNaraku.setBounds(characterPositionX(characterEnum.naraku.ordinal()), characterPositionY(characterEnum.naraku.ordinal()), CHARACTER_PICK_SIZE_X, CHARACTER_PICK_SIZE_Y);
		btnNaraku.setBorderPainted(false);
		btnNaraku.setContentAreaFilled(false);
		frm.getContentPane().add(btnNaraku);
		
		JButton btnPlayer1 = new JButton();
		btnPlayer1.setBounds(PLAYER1_POSITION_X, PLAYER1_POSITION_Y, PLAYER1_SIZE_X, PLAYER1_SIZE_Y);
		btnPlayer1.setBorderPainted(false);
		btnPlayer1.setContentAreaFilled(false);
		frm.getContentPane().add(btnPlayer1);
		
		JButton btnPlayer2 = new JButton();
		btnPlayer2.setBounds(PLAYER2_POSITION_X, PLAYER2_POSITION_Y, PLAYER2_SIZE_X, PLAYER2_SIZE_Y);
		btnPlayer2.setBorderPainted(false);
		btnPlayer2.setContentAreaFilled(false);
		frm.getContentPane().add(btnPlayer2);

		JButton btnNext = new JButton();
		btnNext.setBounds(NEXT_POSITION_X, NEXT_POSITION_Y, NEXT_SIZE_X, NEXT_SIZE_Y);
		btnNext.setBorderPainted(false);
		btnNext.setContentAreaFilled(false);
		frm.getContentPane().add(btnNext);

		JButton btnRandom = new JButton();
		btnRandom.setBounds(RANDOM_POSITION_X, RANDOM_POSITION_Y, RANDOM_SIZE_X, RANDOM_SIZE_Y);
		btnRandom.setBorderPainted(false);
		btnRandom.setContentAreaFilled(false);
		frm.getContentPane().add(btnRandom);

		
		/*
		 * JButton actionLisener player1, player2, next, random
		 */
		
		
		btnPlayer1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				characterSelect.cancelPlayer1Character();
			}
		});
		
		btnPlayer2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				characterSelect.cancelPlayer2Character();
			}
		});
		
		btnNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				characterSelect.goToActionPickPage();
			}
		});
		btnRandom.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				characterSelect.pickRandom();
			}
		});
		
		/*
		 * JButton mouseListener character
		 */
		
		btnInuyasha.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.inuyasha.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.inuyasha.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});

		btnKagome.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.kagome.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.kagome.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnSango.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.sango.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.sango.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnMiroku.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.miroku.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.miroku.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnKagura.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.kagura.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.kagura.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnKoga.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.koga.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.koga.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnSesshomaru.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.sesshomaru.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.sesshomaru.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
		
		btnNaraku.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e)
			{
				characterSelect.pickCharacter(characterEnum.naraku.ordinal());
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.naraku.ordinal());
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				characterSelect.showCharacter(characterEnum.none.ordinal());
			}
			
		});
	}

	private static final int characterPositionX(int characterID) {
		switch(characterID) {
		//inuyasha
		case 1:					
			return 125;
		//kagome
		case 2:
			return 250;
		//sango
		case 3:
			return 125;
		//miroku
		case 4:
			return 250;
		//kagura
		case 5:
			return 413;
		//koga
		case 6:
			return 538;
		//sesshomaru
		case 7:
			return 413;
		//naraku
		case 8:
			return 538;
		}
		System.out.println("invalid characterPosition X");
		return -1;
	}
	private static final int characterPositionY(int characterID) {
		switch(characterID) {
		//inuyasha
		case 1:					
			return 192;
		//kagome
		case 2:
			return 192;
		//sango
		case 3:
			return 319;
		//miroku
		case 4:
			return 319;
		//kagura
		case 5:
			return 192;
		//koga
		case 6:
			return 192;
		//sesshomaru
		case 7:
			return 319;
		//naraku
		case 8:
			return 319;
		}
		System.out.println("invalid characterPosition Y");
		return -1;
	}
}
