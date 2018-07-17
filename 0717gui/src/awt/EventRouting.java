package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class EventRouting extends Frame {
	public EventRouting() {
		// 윈도우의 시작 좌표와 크기 설정
		setBounds(1500, 800, 200, 300);
		// 윈도우의 제목 설정
		setTitle("이벤트 라우팅");

		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label();

		Panel centerPanel = new Panel();
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		add("Center", centerPanel);

		add("South", label);


//		ActionListener listener1 = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				label.setText("안녕하세요");
//			}
//		};
//		ActionListener listener2 = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				label.setText("Hello");
//			}
//		};
//		ActionListener listener3 = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		};
//		btn1.addActionListener(listener1);
//		btn2.addActionListener(listener2);
//		btn3.addActionListener(listener3);
		
		//e.getActionCommand()예약
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
				switch(e.getActionCommand()) {
				case "한국어":
					label.setText("안녕하세요");
					break;
				case "영어":
					label. setText("Hello");
					break;
				case "종료":
					System.exit(0);
					break;
				}
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		
		// 윈도우를 화면에 출력
		setVisible(true);
	}
}
