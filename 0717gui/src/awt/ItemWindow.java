/*체크박스를 선택하면 선택한 체크박스의 문자열과 상태를 
 * 텍스트 영역에 출력하고, 카테고리 콤보박스를 선택하면 
 * 카테고리 내의 항목을 세부내용 콤보박스에 출력하고, 
 * 버튼을 누르면 선택한 콤보박스의 항목을 텍스트 영역에 출력하기.

 * 1. 윈도우를 만들어서 출력하기
 * ->윈도우 클래스 만들기: Frame으로부터 상속받는 클래스 생성
 * ->main메소드에서 앞에서 만든 클래스의 인스턴스 생성(AwtMain을 계속 사용한다.)
 * 2. 윈도우에 컴포넌트들을 배치 
 * ->생성자 메소드의 
 * 3. 이벤트를 처리
 * ->setVisible 호출 전에 추가
 * 
 * 버튼을 눌렀을 때 처리해주는 리스너:ActionLIstener
 * 1. ActionLister 인스턴스를 만들고
 * 2.사용할 컴포넌트와 연결
 * 
 */

package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(1500, 800, 400, 300);
		setTitle("이벤트 핸들링");

		Panel northPanel = new Panel();
		Checkbox cnboolean = new Checkbox("boolean");
		Checkbox cnbyte = new Checkbox("byte");
		Checkbox cnshort = new Checkbox("short");
		Checkbox cnchar = new Checkbox("char");
		Checkbox cnint = new Checkbox("int");
		Checkbox cnlong = new Checkbox("long");
		Checkbox cnfloat = new Checkbox("float");
		Checkbox cndouble = new Checkbox("double");
		add("North", northPanel);

		northPanel.add(cnboolean);
		northPanel.add(cnbyte);
		northPanel.add(cnshort);
		northPanel.add(cnchar);
		northPanel.add(cnint);
		northPanel.add(cnlong);
		northPanel.add(cnfloat);
		northPanel.add(cndouble);

		// 중앙에 TextArea 배치
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);

		// 콤보박스 두개 배치
		// 콤보박스에 배치할 데이터 만들기
		String[] category = { "Programming", "Database", "IDE", "Framework" };
		String[][] content = { { "Java", "Javascript", "Swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Android Studio", "XCode" }, { "Spring", "MyBatis", "Hibernate" } };

		Choice cbcategory = new Choice();
		for(String imsi : category) {
			cbcategory.add(imsi);
		}
		Choice cbcontent = new Choice();
		for(String imsi : content[0]) {
			cbcontent.add(imsi);
		}
		
		Button btnSelect = new Button("선택");
		Button btnExit = new Button("종료");
		
		Panel southPanel = new Panel();
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(btnSelect);
		southPanel.add(btnExit);
		
		add("South", southPanel);
		
		ItemListener itemHandler1 = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//이벤트가 발생한 인스턴스가 Object형태이기 때문에 원래의 자료형인 Checkbox로 변환
				//이벤트 처리 메소드에서 e.getSource()는 이벤트가 발생한 인스턴스의 주소를 리턴한다.
				Checkbox cb = (Checkbox)(e.getSource());
				//체크박스에 써진 텍스트를 가져온다.
				String label = cb.getLabel();
				//체크 박스 선택 여부 가져오기
				boolean b = cb.getState();
				
				ta.append(label + " " + b +"로 변경\n");
			}
		};
		//체크박스를 눌렀을 때 호출될 인스턴스 설정
		cnboolean.addItemListener(itemHandler1);
		cnbyte.addItemListener(itemHandler1);
		cnshort.addItemListener(itemHandler1);
		cnchar.addItemListener(itemHandler1);
		cnint.addItemListener(itemHandler1);
		cnlong.addItemListener(itemHandler1);
		cnfloat.addItemListener(itemHandler1);
		cndouble.addItemListener(itemHandler1);
		
		//카테고리 콤보 박스의 선택이 변경되었을 때 호출될 메소드를 가진 Listener
		//ItemListener가 처리
		ItemListener itemHandler2 = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//cbcategory의 선택된 행 번호 가져오기
				int row = cbcategory.getSelectedIndex();
				//cbcontent의 내용을 전부 삭제
				cbcontent.removeAll();
				//행번호에 해당하는 세부 내용을 cbcontent에 추가
				for(String temp:content[row]) {
					cbcontent.add(temp);
				}
			}
		};
		
		cbcategory.addItemListener(itemHandler2);
		
		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText +":"+contentText);
				
			}	
		};
		
		btnSelect.addActionListener(action1);
		
		//종료 버튼을 누르면 프로그램 종료
		ActionListener listener3 = new ActionListener() {
			@Override
			//버튼이 눌리면 호출되는 메소드
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		  
		btnExit.addActionListener(listener3);
		setVisible(true);
	}
}
