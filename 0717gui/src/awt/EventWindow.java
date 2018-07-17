package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {
	public EventWindow() {
		//�������� ���� ��ǥ�� ũ�� ����
		setBounds(1500, 800, 500, 200);
		//�������� ���� ����
		setTitle("�̺�Ʈ ó��");
		
		//��ư ����
		Button btn1 = new Button("��ư 1");
		//���� ���� ������Ʈ���� ���� �� �г� ����
		Panel panel = new Panel();
		//�гο� ��ư �߰�
		panel.add(btn1);
		//�г��� �����쿡 �߰�
		add(panel);
		//�����츦 ȭ�鿡 ���
		setVisible(true);
		
		//��ư�� ���� �� �̺�Ʈ ó���� ActionListener �������̽��� ó���Ѵ�.
		ActionListener listener1 = new ActionListener() {
			@Override
			//��ư�� ������ ȣ��Ǵ� �޼ҵ�
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		//��ư�� ������ ����
		//btn1�� ActionEvent�� �߻��ϸ�
		//listener1�� �޼ҵ带 ȣ���ϵ��� ����
		btn1.addActionListener(listener1);
	}
}
