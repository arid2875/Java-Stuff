import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class main {
	public static void main(String args[]){
		FormGui form = new FormGui();
		form.setVisible(true);
		form.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
			
		
	}
}
