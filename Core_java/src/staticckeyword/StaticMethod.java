package staticckeyword;

public class StaticMethod {
	static int calculateBonous(int salary) {
		return salary*10/100;
		
	}

	public static void main(String[] args) {
		int bonous=StaticMethod.calculateBonous(4000);

	}

}
