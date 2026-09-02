package staticckeyword;

public class StsticBlock {
	static int employeecount;
	static {
		employeecount =100;
		System.out.println("employee Sytem intialized");
	}

	public static void main(String[] args) {
		System.out.println("starting employee sytem");
		System.out.println("employee count= "+employeecount);

	}

}
