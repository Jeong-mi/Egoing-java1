
public class Casting {

	public static void main(String[] args) {
		
		//����->�Ҽ��� �ս��� ���� ������ �ڵ����� ĳ����
		double a = 1.1;
		double b = 1; //1.0
		double b2 = (double)1; //1.0
		System.out.println(b);
		
		//int c = 1.1; 
		//�Ҽ�->������ �ս��� �ֱ� ������ ������ ĳ����
		//double���� int������ ������ �ٲٱ�
		double e = 1.1;
		int d = (int) 1.1; 
		System.out.println(d); //1
		
		 //1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		//������ ���� � ������Ÿ�������� �˷���
		System.out.println(f.getClass());
	}

}
