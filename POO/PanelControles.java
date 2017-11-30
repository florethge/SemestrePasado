import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.swing.Jpanel;
import java.swing.JTextFiled;

public class PanelControles extend JPanel implements ActionListener{
	private JTextField tfNombre;
	private JBotton bImprime;
	private JButton bColorFondo;
	private JRadioButton rbRojo;
	private JRadioButton rbAzul;
	private JRadioButton rbVerde;

	private PanelDibujo pd;

	public PanelControles (PanelDibujo pd){
		super();
		this.pd= pd;
		this.setPreferredSize(new Dimension(150, 600));
		this.tfNombre= new JTextField(8);
		this.bImprime = new JBotton("Imprime Nombre");
		this.bImprime.addActionListener(this);

		this.rbRojo= new JRadioButton ("Rojo",true);
		this.rbAzul= new JRadioButton ("Azul");
		this.rbVerde= new JRadioButton ("Verde");
		ButtonGroup bg= new ButtonGroup();
		bg.add(this.rbRojo);
		bg.add(this.rbAzul);
		bg.add(this.rbVerde);
		
		this.bColorFondo= new JBotton ("Cambiar Fondo");
		this.bColorFondo.addActionListener(this);
		
		this.add(this.tfNombre);
		this.add(this.bImprime);
		this.add(this.bColorFondo);
	
		this.add(this.rbRojo);
		this.add(this.rbAzul);
		this.add(this.rbVerde);

		this.newJSlider(JSlider.Vertical,0, 255, 0);
		this.slider.setMajorTickSpacing(50);
		this.slider.setMinorTickSpacing(10);
		
		this.bAbrirArchivo=new JButton("Seleccionar un Archivo");
		this.bAbrirArchivo.addActionListener(new ActionListener(){
			JFileChooser fc=new JFileChooser();
			int op= fc.showOpenDialog(PanelControles.this.pd);
			if (op==JFileChooser.APPROVE_OPTION){
				JOptionPane.showMessageDialog(PanelControles.this.pd,"El archivo seleccionado fue"+fc.getSelectedFile();)
				
			}
		

	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource()== this.bImprime){
			this.pd.setTextoNave(this.tfNombre.getText());
			System.out.println("hola"+ this.tfNombre.getText());
		}
		else if(this.rbRojo.isSelected()){
			this.setBackground(Color.RED);
		}
		else if (this.rbAzul.isSelected()){
			this.setBackground(Color.BLUE);
		}
		else{
			this.setBackground(Color.GREEN);
		}
	}	
}
