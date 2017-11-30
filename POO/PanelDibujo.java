import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class PanelDibujo extends JPanel implements Runnable{
	private int xV;
	private int yV;
	private Image fondo;
	private String textoNave;

	public PanelDibujo (){
		super();
		this.textoNave="Vamos Pocoyo!";
		this.xV=this.yV=0;
		this.fondo= new ImageIcon("cielo.jpg").getImage();
		this.setPreferredSize(new Dimension(800, 600));
		this.xV=this.yV=0;
		Thread hilo= new Thread(this);
		hilo.start();
	}
	
	this.addMouseListener(new MouseListener());
	boolean moverse;

	public void mouseClicked (MouseEvent e){
		PanelDibujo.this.moverse=true;
	}
	public void mouseEntered (MouseEvent e){
		
	}
	public void mouseExited (MouseEvent e){
		PanelDibujo.this.moverse=false;
	}
	public void mousePressed (MouseEvent e){
		
	}
	public void mouseReleased (MouseEvent e){
		
	}
	sys
	
	
	public void setTextoNave(StringNombre){
		this.textoNave= "Vamos"+Nombre+"!!";
		repaint();
	}
	
	public void 
	
	public void paintComponent (Graphics g){
                super.paintComponent(g);
                //g.fillRect(0, 0, 100, 100);
                //g.fillRect(300, 300, 100, 100);
	
		//g.drawImage(this.fondo, 0, 0, 800, 600,  this);

		g.drawImage(this.fondo, 0, 0,this.getWith(), this.getHeight(),  this);
		g.setColor(Color.ORANGE);
		g.fillOval(50+ this.xV, 500+ this.yV, 200, 100);
		
		g.drawString(this.textoNave, 80+this.xV, +this.yV);
		g.setColor(Color.BLACK);
		g.drawLine(125+ this.xV, 502+ this.yV, 125+ this.xV, 400+ this.yV);
		g.setColor(Color.RED);
		g.fillOval(75+ this.xV, 300+ this.yV, 100, 200);
		
        }

	public void run(){
		while(true){
			try{
				if(this.moverse){
					this.xV+=3;
					this.yV--;
					repaint();
					Thread.sleep(20);
				}
				
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	
}
