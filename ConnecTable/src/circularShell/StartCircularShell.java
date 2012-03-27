package circularShell;

import org.mt4j.MTApplication;


public class StartCircularShell extends MTApplication {
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		initialize();
	}
	
	@Override
	public void startUp(){
		this.addScene(new CircularShellScene(this, "Circular Shell Scene"));
	}
	
}
