package awt;

import java.awt.*;

public class CommonsDialog2 extends Frame {
	//생성자 - 인스턴스를 생성할 때 호출하는 메소드
	public CommonsDialog2() {
		//위치와 크기 설정
		setBounds(100, 100, 500, 500);
		//제목 설정
		setTitle("공통 대화 상자");
		
		//FileDialog 객체를 생성해서 화면에 출력하고
		//선택한 파일 경로를 레이블에 출력
		//FileDialog를 생성할 때 첫 번째 매개변수가 Dialog나 Frame의 주소인데
		//지금의 경우는 this를 대입하면 된다.
		
		//FileDialog 인스턴스 생성
		FileDialog fileDialog = new FileDialog(this);
		//화면 출력
		fileDialog.setVisible(true);
		//선택한 디렉토리와 파일 이름 가져오기
		String filePath = fileDialog.getDirectory()+fileDialog.getFile();
		
		//레이블 생성, frame에 올려야 화면에서 보임.
		Label label = new Label(filePath);
		add(label);
		
		//화면 출력
		setVisible(true);
	}
}
