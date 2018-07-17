package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
	// ������ - �ν��Ͻ��� ���� �� ȣ���ϴ� �޼ҵ�
	public LoginWindow() {
		// ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(500, 500);
		setLocation(1500, 800);
		setTitle("�α���");

		// �г� ����
		Panel panel = new Panel();

		Label lblId = new Label("���̵�");
		TextField txtId = new TextField(20);
		panel.add(lblId);
		panel.add(txtId);

		Label lblPw = new Label("��й�ȣ");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		panel.add(lblPw);
		panel.add(txtPw);

		TextArea ta = new TextArea(10, 50);

		panel.add(ta);

		// �г��� �����ӿ� ����
		add(panel);
		
		//�޴� �� �����
		MenuBar menuBar = new MenuBar();
		
		//�޴� ����
		Menu file = new Menu("����(F)");
		
		//�޴��� �޴��ٿ� ����
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("���� �����");
		file.add(newFile);
		Menu save = new Menu("�����ϱ⢹");
		MenuItem newSave = new MenuItem("�ٸ� �̸����� �����ϱ�");
		MenuItem saveAdd = new MenuItem("���� �׸� �����ϱ�");
		save.add(newSave);
		save.add(saveAdd);
		file.add(save);
		
		MenuItem getFile = new MenuItem("�ҷ�����");
		file.add(getFile);		
		
		Menu edit = new Menu("�����ϱ⢹");
		MenuItem copy = new MenuItem("�����ϱ�");
		MenuItem paste = new MenuItem("�ٿ��ֱ�");
		edit.add(copy);
		edit.add(paste);
		file.add(edit);
		
		MenuItem del = new MenuItem("�����ϱ�");
		file.add(del);
		
		//�޴��ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);

		// ȭ�� ���
		setVisible(true);
	}
}
