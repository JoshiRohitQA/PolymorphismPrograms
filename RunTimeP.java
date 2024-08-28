package Polymorphism;

class Google{
	void launchapp() {
		System.out.println("launch the google first");
	}

}

public class RunTimeP extends Google {
	
	void launchapp() {
		super.launchapp();
		System.out.println("After google launch amazon");
	}
	
	
	public static void main(String[] args) {
		RunTimeP rt = new RunTimeP();
		rt.launchapp();
		
	}

}
