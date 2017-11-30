import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.BorderLayout;

public class MiVentana extends JFrame{
	public MiVentana (){
		super("Mi primer ventana en java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(800, 600);
		PanelDibujo pd= new PanelDibujo();
		this.add(pd);
		this.add(new PanelControles(), BorderLayout.West);

		this.pack();
		this.setVisible(true);
	
	}

	//public void paint (Graphics g){
		//super.paint(g);
		//g.fillRect(0, 0, 100, 100);
		//g.fillRect(300, 300, 100, 100);
	//}

	public static void main (String [] args){
		MiVentana ventana = new MiVentana();
	}
}
