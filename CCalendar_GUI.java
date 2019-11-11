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

	private JTextField yoil = new JTextField("일   월   화   수   목   금   토");
	private JTextField yoilsize = new JTextField(80);
	private JButton monthNextButton = new JButton(new ImageIcon("D:\\10월 최성원\\달력\\NextButton.png"));
	private JButton monthBeforeButton = new JButton(new ImageIcon("D:\\10월 최성원\\달력\\BeforeButton.png"));
	private JButton monthBeforeClickButton = new JButton(new ImageIcon("D:\\10월 최성원\\달력\\BeforeClickButton.png"));
	private JButton monthNextClickButton = new JButton(new ImageIcon("D:\\10월 최성원\\달력\\NextClickButton.png"));
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
	private JButton yoilButton1 = new JButton("일");
	private JButton yoilButton2 = new JButton("월");
	private JButton yoilButton3 = new JButton("화");
	private JButton yoilButton4 = new JButton("수");
	private JButton yoilButton5 = new JButton("목");
	private JButton yoilButton6 = new JButton("금");
	private JButton yoilButton7 = new JButton("토");
	private JButton month2Button = new JButton(new ImageIcon("D:\\10월 최성원\\달력\\month2Image.png"));
	
	int i = 1;
	int buttonwidth = -260;
	
	ArrayList<JButton> yoilArray = new ArrayList<JButton>(
			Arrays.asList(yoilButton1, yoilButton2, yoilButton3, yoilButton4, yoilButton5, yoilButton6, yoilButton7 ));

	ArrayList<JButton> monthArray = new ArrayList<JButton>(
			Arrays.asList(monthButton1, monthButton2, monthButton3, monthButton4, monthButton5, monthButton6,
					monthButton7, monthButton8, monthButton9, monthButton10, monthButton11, monthButton12));

	public CCalendar_GUI() {
		setTitle("CCalendar"); // 실행창 이름
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼 실행 가능
		setResizable(true); // 창 사이즈 조절가능
		setLayout(null); // 레이아웃 없음

		monthBeforeButton.setBounds(400, 50, 50, 50); // 버튼 위치,크기
		monthBeforeButton.setBorderPainted(false); // 버튼 내용 투명
		monthBeforeButton.setContentAreaFilled(false); // 버튼 테두리 투명
		monthBeforeButton.addMouseListener(new MouseListener() { // Before버튼 마우스리스너
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) { // 버튼을 마우스로 눌렀을때 이전 달로 돌아가는기능
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
			public void mouseExited(MouseEvent e) { // 마우스가 버튼에 위치하지 않을때 색깔 변화
				monthBeforeClickButton.setVisible(false);
				monthBeforeButton.setVisible(true);
				monthBeforeClickButton.setBorderPainted(false);
				monthBeforeClickButton.setContentAreaFilled(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) { // 마우스가 버튼에 위치할때 색깔변화
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
			public void mousePressed(MouseEvent e) { // 버튼을 눌렀을때 다음 달로 넘어가는 기능
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
			yoilArray.get(i-1).setFont(new Font("나눔고딕",Font.BOLD,40));
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

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 실행창의 크기
		setVisible(true); // 실행창 띄우기
	}
}
