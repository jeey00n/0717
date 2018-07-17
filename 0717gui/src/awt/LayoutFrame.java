package awt;

import java.awt.*;
//import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		// 위치와 크기 설정
		setBounds(1500, 800, 400, 200);
		// 제목 설정
		setTitle("레이아웃 연습");

		Panel panel = new Panel();

		// panel의 레이아웃을 설정
		// panel.setLayout(new FlowLayout());

		// // 컴포넌트 배치
		// Button btn = null;
		// for (int i = 1; i <= 10; i++) {
		// btn = new Button("버튼" + i);
		// panel.add(btn);
		// }

		// panel.setLayout(new BorderLayout()); (X) 이렇게 만들면 버튼이 모두 겹쳐 맨 마지막 버튼만 보임
		// panel.setLayout(new BorderLayout());
		//
		// Button btnWest = new Button("서쪽");
		// panel.add("West", btnWest);
		// Button btnSouth = new Button("남쪽");
		// panel.add("South", btnSouth);
		// Button btnNorth = new Button("북쪽");
		// panel.add("North", btnNorth);
		// Button btnEast = new Button("동쪽");
		// panel.add("East", btnEast);
		// Button btnCenter = new Button("중앙");
		// panel.add("Center", btnCenter);
		//

		// panel.setLayout(new GridLayout(2, 3, 10, 10));
		// //버튼을 2*3으로 설정했지만, 아래에서 버튼 개수를 늘려도 알아서 늘어난 개수가 만들어짐.
		// for(int i = 1; i<=10; i++) {
		// Button btn = new Button("버튼 "+i);
		// panel.add(btn);
		// }

		// 컴포넌트의 크기와 위치를 마음대로 변경할 수 있다.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(20, 50, 30, 50);
		add(label);

		add(panel);
		// 화면 크기 조절을 못 하도록 설정
		setResizable(false);
		// 화면 출력
		setVisible(true);

		Thread thread = new Thread() {
			int sign = 10;

			public void run() {
				//무한 반복
				while (true) {
					try {
						Thread.sleep(100);
						//현재 레이블의 위치를 가져오기
						int x = label.getLocation().x;
						int y = label.getLocation().y;
						if (x >= 370) {
							sign = -10;
						}
						if (x <= 10) {
							sign = 10;
						}
						label.setLocation(x + sign, y);
						
						
//						Random r = new Random();
//						label.setLocation(r.nextInt(400), r.nextInt(200));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
	}
}
