package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		//setBounds�� ũ��� ��ġ�� �Բ� ������.
		setBounds(200, 200, 1500, 800);
		setTitle("���� ��ȭ����");
		
		//���� ��ȭ���� �����
		FileDialog fileDialog = new FileDialog(this, "���� ��ȭ����");
		//���丮 ����
		fileDialog.setDirectory("C:\\Users\\503-20\\Documents\\������\\0702~�ڹ�");
		//���� ��ȭ���ڸ� ȭ�鿡 ���
		fileDialog.setVisible(true);
		//������ ���� ��� ��������
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		Label label = new Label(filePath);
		add(label);
		
		setVisible(true);
	}
}
