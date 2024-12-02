package calcicontrollerpackage;

public class CalciServiceImpl implements CalciServiceInterface {

	
	public long add(int num1,int num2) {
		return num1+num2;
		
		}

	@Override
	public long sub(int num1, int num2) {
		
		return num1-num2;
	}
	
	
	
	
}
