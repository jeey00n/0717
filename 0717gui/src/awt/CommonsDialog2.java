package awt;

import java.awt.*;

public class CommonsDialog2 extends Frame {
	//������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
	public CommonsDialog2() {
		//��ġ�� ũ�� ����
		setBounds(100, 100, 500, 500);
		//���� ����
		setTitle("���� ��ȭ ����");
		
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ�
		//������ ���� ��θ� ���̺� ���
		//FileDialog�� ������ �� ù ��° �Ű������� Dialog�� Frame�� �ּ��ε�
		//������ ���� this�� �����ϸ� �ȴ�.
		
		//FileDialog �ν��Ͻ� ����
		FileDialog fileDialog = new FileDialog(this);
		//ȭ�� ���
		fileDialog.setVisible(true);
		//������ ���丮�� ���� �̸� ��������
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		
		//���̺� ����, frame�� �÷��� ȭ�鿡�� ����.
		Label label = new Label(filePath);
		add(label);
		
		//ȭ�� ���
		setVisible(true);
	}
}
