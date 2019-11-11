package cCalendar;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CCalendar_GUI extends JFrame {

	private JTextField yoil = new JTextField("��   ��   ȭ   ��   ��   ��   ��");
	private JTextField yoilsize = new JTextField(80);
	private JButton monthNextButton = new JButton(new ImageIcon("D:\\10�� �ּ���\\�޷�\\NextButton.png"));
	private JButton monthBeforeButton = new JButton(new ImageIcon("D:\\10�� �ּ���\\�޷�\\BeforeButton.png"));
	private JButton monthBeforeClickButton = new JButton(new ImageIcon("D:\\10�� �ּ���\\�޷�\\BeforeClickButton.png"));
	private JButton monthNextClickButton = new JButton(new ImageIcon("D:\\10�� �ּ���\\�޷�\\NextClickButton.png"));
	private JButton monthButton1 = new JButton("1");
	private JButton monthButton2 = new JButton("2");
	private JButton monthButton3 = new JButton("3");
	private JButton monthButton4 = new JButton("4");
	private JButton monthButton5 = new JButton("5");
	private JButton monthButton6 = new JButton("6");
	private JButton monthButton7 = new JButton("7");
	private JButton monthButton8 = new JButton("8");
	private JButton monthButton9 = new JButton("9");
	private JButton monthButton10 = new JButton("10");
	private JButton monthButton11 = new JButton("11");
	private JButton monthButton12 = new JButton("12");
	private JButton yoilButton1 = new JButton("��");
	private JButton yoilButton2 = new JButton("��");
	private JButton yoilButton3 = new JButton("ȭ");
	private JButton yoilButton4 = new JButton("��");
	private JButton yoilButton5 = new JButton("��");
	private JButton yoilButton6 = new JButton("��");
	private JButton yoilButton7 = new JButton("��");
	private JButton month2Button = new JButton(new ImageIcon("D:\\10�� �ּ���\\�޷�\\month2Image.png"));
	
	int i = 1;
	int buttonwidth = -260;
	
	ArrayList<JButton> yoilArray = new ArrayList<JButton>(
			Arrays.asList(yoilButton1, yoilButton2, yoilButton3, yoilButton4, yoilButton5, yoilButton6, yoilButton7 ));

	ArrayList<JButton> monthArray = new ArrayList<JButton>(
			Arrays.asList(monthButton1, monthButton2, monthButton3, monthButton4, monthButton5, monthButton6,
					monthButton7, monthButton8, monthButton9, monthButton10, monthButton11, monthButton12));

	public CCalendar_GUI() {
		setTitle("CCalendar"); // ����â �̸�
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ��ư ���� ����
		setResizable(true); // â ������ ��������
		setLayout(null); // ���̾ƿ� ����

		monthBeforeButton.setBounds(400, 50, 50, 50); // ��ư ��ġ,ũ��
		monthBeforeButton.setBorderPainted(false); // ��ư ���� ����
		monthBeforeButton.setContentAreaFilled(false); // ��ư �׵θ� ����
		monthBeforeButton.addMouseListener(new MouseListener() { // Before��ư ���콺������
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) { // ��ư�� ���콺�� �������� ���� �޷� ���ư��±��
				if (i == 0) {
					i++;
				} else if (i == 12) {
					i--;
				}
				if (i > 0) {
					i--;
				}
				monthButton1.setVisible(false);
				monthArray.get(i).setVisible(true);
				monthArray.get(i + 1).setVisible(false);
				monthArray.get(i).setBounds(580, 50, 50, 50);
				monthArray.get(i).setBorderPainted(false);
				monthArray.get(i).setContentAreaFilled(false);
				monthArray.get(i).setFocusPainted(false);
				add(monthArray.get(i));
				System.out.println(i);
			}

			@Override
			public void mouseExited(MouseEvent e) { // ���콺�� ��ư�� ��ġ���� ������ ���� ��ȭ
				monthBeforeClickButton.setVisible(false);
				monthBeforeButton.setVisible(true);
				monthBeforeClickButton.setBorderPainted(false);
				monthBeforeClickButton.setContentAreaFilled(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) { // ���콺�� ��ư�� ��ġ�Ҷ� ����ȭ
				monthBeforeButton.setVisible(false);
				monthBeforeClickButton.setVisible(true);
				monthBeforeClickButton.setBounds(400, 50, 50, 50);
				monthBeforeClickButton.setBorderPainted(false);
				monthBeforeClickButton.setContentAreaFilled(false);
				add(monthBeforeClickButton);

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		add(monthBeforeButton);

		monthNextButton.setBounds(750, 50, 50, 50);
		monthNextButton.setBorderPainted(false);
		monthNextButton.setContentAreaFilled(false);
		monthNextButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) { // ��ư�� �������� ���� �޷� �Ѿ�� ���
				if (i == 12) {
					i--;
				} else if (i == 0) {
					i++;
				}
				monthButton1.setVisible(false);
				monthArray.get(i - 1).setVisible(false);
				monthArray.get(i).setVisible(true);
				monthArray.get(i).setBounds(580, 50, 50, 50);
				monthArray.get(i).setBorderPainted(false);
				monthArray.get(i).setContentAreaFilled(false);
				monthArray.get(i).setFocusPainted(false);
				add(monthArray.get(i));
				if (i < 12) {
					i++;
				}
				System.out.println(i);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				monthNextClickButton.setVisible(false);
				monthNextButton.setVisible(true);
				monthNextButton.setBorderPainted(false);
				monthNextButton.setContentAreaFilled(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				monthNextButton.setVisible(false);
				monthNextClickButton.setVisible(true);
				monthNextClickButton.setBounds(750, 50, 50, 50);
				monthNextClickButton.setBorderPainted(false);
				monthNextClickButton.setContentAreaFilled(false);
				add(monthNextClickButton);

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		add(monthNextButton);
		
		for(int i = 1;i<=yoilArray.size();i++) {
			buttonwidth += 190;
			yoilArray.get(i-1).setBounds(buttonwidth,10,250,250);
			yoilArray.get(i-1).setBorderPainted(false);
			yoilArray.get(i-1).setContentAreaFilled(false);
			yoilArray.get(i-1).setFocusPainted(false);
			yoilArray.get(i-1).setFont(new Font("�������",Font.BOLD,40));
			add(yoilArray.get(i-1));
			
		}

		

		monthButton1.setBounds(580, 50, 50, 50);
		monthButton1.setBorderPainted(false);
		monthButton1.setContentAreaFilled(false);
		monthButton1.setFocusPainted(false);
		add(monthButton1);

		month2Button.setBounds(600, 50, 50, 50);
		month2Button.setBorderPainted(false);
		month2Button.setContentAreaFilled(false);
		add(month2Button);

		// CJbutton djbutton = new CJbutton();
		// djbutton.setVisible(true);
		// add(djbutton);

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ����â�� ũ��
		setVisible(true); // ����â ����
	}
}
