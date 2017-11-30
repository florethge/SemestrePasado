import java.io.*;
import javax.swing.*; 
public class tarea01{
	
	public static void numerosRomanos(int numero)
	{
		String unidad= "";
		String decena= "";
		String centena= "";
		String millar= "";
		
		char[] romanos = Integer.toString(numero).toCharArray();
		int size = romanos.length;

		if(size==1)
		{	
	                if(romanos[0]=='1')
     		        {
        			 unidad="I";
               		}else if (romanos[0]=='2')
               		{
                        	unidad="II";
                	}else if (romanos[0]=='3')
               		{
                        	unidad="III";
               		}else if (romanos[0]=='4')
               		{
                       		 unidad="IV";
               		}else if (romanos[0]=='5')
               		{
                       		 unidad="V";
               		}else if (romanos[0]=='6')
               		{
                       		 unidad="VI";
              		}else if (romanos[0]=='7')
               		{
                       		 unidad="VII";
               		}else if (romanos[0]=='8')
               		{
                       		 unidad="VIII";
               		}else if (romanos[0]=='9')
               		{
                       		 unidad="IX";
               		}
		}
		if(size==2)
                {
                        if(romanos[1]=='1')
                        {
                                 unidad="I";
                        }else if (romanos[1]=='2')
                        {
                                unidad="II";
                        }else if (romanos[1]=='3')
                        {
                                unidad="III";
                        }else if (romanos[1]=='4')
                        {
                                 unidad="IV";
                        }else if (romanos[1]=='5')
                        {
                                 unidad="V";
                        }else if (romanos[1]=='6')
                        {
                                 unidad="VI";
                        }else if (romanos[1]=='7')
                        {
                                 unidad="VII";
                        }else if (romanos[1]=='8')
                        {
                                 unidad="VIII";
                        }else if (romanos[1]=='9')
                        {
                                 unidad="IX";
			}

			if (romanos [0]=='1')
                	{
                        	decena="X";
                	}else if (romanos [0]=='2')
                	{
                        	decena="XX";
                	}else if (romanos [0]=='3')
                	{
                        	decena="XXX";
                	}else if (romanos [0]=='4')
                	{
                        	decena="XL";
                	}else if (romanos [0]=='5')
                	{
                        	decena="L";
                	}else if (romanos [0]=='6')
                	{
                        	decena="LX";
                	}else if (romanos [0]=='7')
                	{
                        	decena="LXX";
                	}else if (romanos [0]=='8')
                	{
                        	decena="LXXX";
                	}else if (romanos [0]=='9')
                	{
                        	decena="XC";
                	}
                }
		if(size==3)
		{
			if(romanos[2]=='1')
                        {
                                 unidad="I";
                        }else if (romanos[2]=='2')
                        {
                                unidad="II";
                        }else if (romanos[2]=='3')
                        {
                                unidad="III";
                        }else if (romanos[2]=='4')
                        {
                                 unidad="IV";
                        }else if (romanos[2]=='5')
                        {
                                 unidad="V";
                        }else if (romanos[2]=='6')
                        {
                                 unidad="VI";
                        }else if (romanos[2]=='7')
                        {
                                 unidad="VII";
                        }else if (romanos[2]=='8')
                        {
                                 unidad="VIII";
                        }else if (romanos[2]=='9')
                        {
                                 unidad="IX";
                        }

			if (romanos [1]=='1')
                        {
                                decena="X";
                        }else if (romanos [1]=='2')
                        {
                                decena="XX";
                        }else if (romanos [1]=='3')
                        {
                                decena="XXX";
                        }else if (romanos [1]=='4')
                        {
                                decena="XL";
                        }else if (romanos [1]=='5')
                        {
                                decena="L";
                        }else if (romanos [1]=='6')
                        {
                                decena="LX";
                        }else if (romanos [1]=='7')
                        {
                                decena="LXX";
                        }else if (romanos [1]=='8')
                        {
                                decena="LXXX";
                        }else if (romanos [1]=='9')
                        {
                                decena="XC";
                        }
			
			if (romanos [2]=='1')
                        {
                                centena="C";
                        }else if (romanos [2]=='2')
                        {
                                centena="CC";
                        }else if (romanos [2]=='3')
                        {
                                centena="CCC";
                        }else if (romanos [2]=='4')
                        {
                                centena="CD";
                        }else if (romanos [2]=='5')
                        {
                                centena="D";
                        }else if (romanos [2]=='6')
                        {
                                centena="DC";
                        }else if (romanos [2]=='7')
                        {
                                centena="DCC";
                        }else if (romanos [2]=='8')
                        {
                                centena="DCCC";
                        }else if (romanos [2]=='9')
                        {
                                centena="CM";
                        }

		}	

		if(size==4)
		{

			if(romanos[3]=='1')
			{
				unidad="I";

			}else if (romanos[3]=='2')
			{
				unidad="II";
			}else if (romanos[3]=='3')
                	{
                        	unidad="III";
                	}else if (romanos[3]=='4')
                	{
                        	unidad="IV";
                	}else if (romanos[3]=='5')
                	{
                        	unidad="V";
                	}else if (romanos[3]=='6')
                	{
                        	unidad="VI";
                	}else if (romanos[3]=='7')
                	{
                        	unidad="VII";
                	}else if (romanos[3]=='8')
                	{
                        	unidad="VIII";
                	}else if (romanos[3]=='9')
                	{
                        	unidad="IX";
                	}

			if (romanos [2]=='1')
			{
				decena="X";
			}else if (romanos [2]=='2')
                	{
                        	decena="XX";
                	}else if (romanos [2]=='3')
                	{
                        	decena="XXX";
                	}else if (romanos [2]=='4')
                	{
                        	decena="XL";
                	}else if (romanos [2]=='5')
                	{
                        	decena="L";
                	}else if (romanos [2]=='6')
                	{
                        	decena="LX";
                	}else if (romanos [2]=='7')
                	{
                        	decena="LXX";
                	}else if (romanos [2]=='8')
                	{
                        	decena="LXXX";
                	}else if (romanos [2]=='9')
                	{
                        	decena="XC";
                	}

			if (romanos [1]=='1')
                	{
                        	centena="C";
                	}else if (romanos [1]=='2')
                	{
                        	centena="CC";
                	}else if (romanos [1]=='3')
                	{
                        	centena="CCC";
                	}else if (romanos [1]=='4')
                	{
                        	centena="CD";
                	}else if (romanos [1]=='5')
                	{
                        	centena="D";
                	}else if (romanos [1]=='6')
                	{
                        	centena="DC";
                	}else if (romanos [1]=='7')
                	{
                        	centena="DCC";
                	}else if (romanos [1]=='8')
                	{
                        	centena="DCCC";
                	}else if (romanos [1]=='9')
                	{
                        	centena="CM";
               	 	}

			if (romanos [0]=='1')
                	{
                        	millar="M";
                	}else if (romanos [0]=='2')
                	{
                        	millar="MM";
                	}else if (romanos [0]=='3')
                	{
                        	millar="MMM";
                	}
		}

		System.out.println (millar+centena+decena+unidad);
		
	}  		


	public static void main(String Args[])
	{
		int entrada=Integer.parseInt(JOptionPane.showInputDialog("¿Qué número deseas convertir a número romano?"));
		if(entrada<3999 && entrada>0){
			numerosRomanos(entrada);
		}else{
			System.out.println ("Numero no soportado");
		}
	}

}
