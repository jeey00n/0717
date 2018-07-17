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
	// 생성자 - 인스턴스를 만들 때 호출하는 메소드
	public LoginWindow() {
		// 크기와 위치 및 타이틀 설정
		setSize(500, 500);
		setLocation(1500, 800);
		setTitle("로그인");

		// 패널 생성
		Panel panel = new Panel();

		Label lblId = new Label("아이디");
		TextField txtId = new TextField(20);
		panel.add(lblId);
		panel.add(txtId);

		Label lblPw = new Label("비밀번호");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		panel.add(lblPw);
		panel.add(txtPw);

		TextArea ta = new TextArea(10, 50);

		panel.add(ta);

		// 패널을 프레임에 부착
		add(panel);
		
		//메뉴 바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 생성
		Menu file = new Menu("파일(F)");
		
		//메뉴를 메뉴바에 부착
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("새로 만들기");
		file.add(newFile);
		Menu save = new Menu("저장하기▷");
		MenuItem newSave = new MenuItem("다른 이름으로 저장하기");
		MenuItem saveAdd = new MenuItem("기존 항목에 저장하기");
		save.add(newSave);
		save.add(saveAdd);
		file.add(save);
		
		MenuItem getFile = new MenuItem("불러오기");
		file.add(getFile);		
		
		Menu edit = new Menu("편집하기▷");
		MenuItem copy = new MenuItem("복사하기");
		MenuItem paste = new MenuItem("붙여넣기");
		edit.add(copy);
		edit.add(paste);
		file.add(edit);
		
		MenuItem del = new MenuItem("삭제하기");
		file.add(del);
		
		//메뉴바를 윈도우에 배치
		setMenuBar(menuBar);

		// 화면 출력
		setVisible(true);
	}
}
