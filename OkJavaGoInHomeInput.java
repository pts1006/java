import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		
		String id = args[0];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / Hall Lamp");
		floorLamp.on();
				
	}
		// 집에 도착했을 때 엘리베이터를 1층으로 부르고 보안을 해제시키고 불을 켜는, 그런 프로그램을 임의로 만들어 봄. 
		
		/*
		 	9번째 줄 String id =  "JAVA APT 507"; 부분을 보니, 아이디 값이 고정이라 마음에 들지 않음.
			이 복제 파일(Input 파일)은 어떻게 하면 해당 문제를 해소할 수 있는지를 배우기 위해 추가된 파일.
			원본 파일과의 차이점을 볼 것.
			
			프로그래밍을 할 줄 모르는 사람이라도 입력창을 띄워줌으로써 언어에 간섭할 수 있게 해 주는 기능.
		*/
	
		/*
		 	11번째 줄에 보면 id라는 매개 변수가 있음.
		 	이게 지금은 String id = JOptionPane.showInputDialog("Enter a ID");로 하나이지만,
		 	추후에 조명의 밝기라든가 다른 어떤 기능이 오게 될 수 있음 그렇게 되면
		 	String bright = JOptionPane.showInputDialog 어쩌구라는 긴 문장이 많아지게 됨.
		 	그 긴 문장을 짧은 문장으로 바꾸기 위해 arguments를 씀.
		 	
		 	Run as 밑에 Configuration에서 argument 들어가서 '변수명' 입력해 주고, 0번부터 번호매겨짐.
		 	
		 	그래서 String id = JOptionPane.showInputDialog("Enter a ID");가
		 	~> String id = args[0];가 됐음.
		 	
		*/ 
}
