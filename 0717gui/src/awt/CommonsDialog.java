package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		//setBounds는 크기와 위치를 함께 설정함.
		setBounds(200, 200, 1500, 800);
		setTitle("공통 대화상자");
		
		//파일 대화상자 만들기
		FileDialog fileDialog = new FileDialog(this, "파일 대화상자");
		//디렉토리 설정
		fileDialog.setDirectory("C:\\Users\\503-20\\Documents\\정지윤\\0702~자바");
		//파일 대화상자를 화면에 출력
		fileDialog.setVisible(true);
		//선택한 파일 경로 가져오기
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		Label label = new Label(filePath);
		add(label);
		
		setVisible(true);
	}
}
