package dad;
import java.io.IOException;
import viewers.Menu;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
	        String one = args[0];
	        System.out.println("/" + one + "/");
	        System.out.println(one == "console");
	        if (one == "console") {
	        	Menu myMenu = new Menu();
	    		myMenu.start();
	        } else {
	        	System.out.println("Mauvais argument.");
	        	System.out.println("Tapez \"java -jar dad.jar console\" pour lancer le jeu en mode texte.");
	        	System.out.println("Tapez \"java -jar dad.jar\" pour lancer le jeu en mode graphique.");
	        	System.exit(0);
	        }
	    }
	    catch (ArrayIndexOutOfBoundsException e){
	    	MainGraphics game = new MainGraphics();
			game.start();
	    }		
	}
}

