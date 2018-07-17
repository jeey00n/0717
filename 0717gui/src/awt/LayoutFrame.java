package awt;

import java.awt.*;
//import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		// ��ġ�� ũ�� ����
		setBounds(1500, 800, 400, 200);
		// ���� ����
		setTitle("���̾ƿ� ����");

		Panel panel = new Panel();

		// panel�� ���̾ƿ��� ����
		// panel.setLayout(new FlowLayout());

		// // ������Ʈ ��ġ
		// Button btn = null;
		// for (int i = 1; i <= 10; i++) {
		// btn = new Button("��ư" + i);
		// panel.add(btn);
		// }

		// panel.setLayout(new BorderLayout()); (X) �̷��� ����� ��ư�� ��� ���� �� ������ ��ư�� ����
		// panel.setLayout(new BorderLayout());
		//
		// Button btnWest = new Button("����");
		// panel.add("West", btnWest);
		// Button btnSouth = new Button("����");
		// panel.add("South", btnSouth);
		// Button btnNorth = new Button("����");
		// panel.add("North", btnNorth);
		// Button btnEast = new Button("����");
		// panel.add("East", btnEast);
		// Button btnCenter = new Button("�߾�");
		// panel.add("Center", btnCenter);
		//

		// panel.setLayout(new GridLayout(2, 3, 10, 10));
		// //��ư�� 2*3���� ����������, �Ʒ����� ��ư ������ �÷��� �˾Ƽ� �þ ������ �������.
		// for(int i = 1; i<=10; i++) {
		// Button btn = new Button("��ư "+i);
		// panel.add(btn);
		// }

		// ������Ʈ�� ũ��� ��ġ�� ������� ������ �� �ִ�.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(20, 50, 30, 50);
		add(label);

		add(panel);
		// ȭ�� ũ�� ������ �� �ϵ��� ����
		setResizable(false);
		// ȭ�� ���
		setVisible(true);

		Thread thread = new Thread() {
			int sign = 10;

			public void run() {
				//���� �ݺ�
				while (true) {
					try {
						Thread.sleep(100);
						//���� ���̺��� ��ġ�� ��������
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
