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
		// ���� �������� �� ���������͸� 1������ �θ��� ������ ������Ű�� ���� �Ѵ�, �׷� ���α׷��� ���Ƿ� ����� ��. 
		
		/*
		 	9��° �� String id =  "JAVA APT 507"; �κ��� ����, ���̵� ���� �����̶� ������ ���� ����.
			�� ���� ����(Input ����)�� ��� �ϸ� �ش� ������ �ؼ��� �� �ִ����� ���� ���� �߰��� ����.
			���� ���ϰ��� �������� �� ��.
			
			���α׷����� �� �� �𸣴� ����̶� �Է�â�� ��������ν� �� ������ �� �ְ� �� �ִ� ���.
		*/
	
		/*
		 	11��° �ٿ� ���� id��� �Ű� ������ ����.
		 	�̰� ������ String id = JOptionPane.showInputDialog("Enter a ID");�� �ϳ�������,
		 	���Ŀ� ������ ����簡 �ٸ� � ����� ���� �� �� ���� �׷��� �Ǹ�
		 	String bright = JOptionPane.showInputDialog ��¼����� �� ������ �������� ��.
		 	�� �� ������ ª�� �������� �ٲٱ� ���� arguments�� ��.
		 	
		 	Run as �ؿ� Configuration���� argument ���� '������' �Է��� �ְ�, 0������ ��ȣ�Ű���.
		 	
		 	�׷��� String id = JOptionPane.showInputDialog("Enter a ID");��
		 	~> String id = args[0];�� ����.
		 	
		*/ 
}
