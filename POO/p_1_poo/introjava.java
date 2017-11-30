import javax.swing.*; //importar para recibir parámetros
public class introjava {
        public static void calificacion () {
                String strCalif=JOptionPane.showInputDialog("Introduce tu calificación: ");
                int calif=Integer.parseInt(strCalif);
                if(calif>=70){
                        JOptionPane.showMessageDialog(null,"Aprobado");
                        //System.print.out.println("Aprobado");
                }
                else{
                        System.print.out.println("Reprobado");
                }
        }

        public static void del1Al100(){
                for(int i=0;i<100;i++);{
                        System.out.println(i+1);
                }
        }

        public static void serie(int base){
                for(int i=0;i<50;i++){
                        System.out.print//ln((i+1)*base+", ");
                }
                System.out.println();
        }

        public static int calorias(){
                int numComidas=Integer.parseint(JOptionPane.showInputDialog("¿Cuantas comidas comiste?");
                int totalCalorias=0;
                for(int i=0;i<numComidas;i++){
                        totalCalorias+=Integer.parseInt(JOptionPane.showInputDialog("¿cuantas calorias consumiste en tu comida?"+(i+1)+"?"));

                }
                return totalCalorías;

        }


        public static void main (Sting[] args){
                calificacion();
                del1Al100();
                Int x=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál serie quieres?"));
                serie(x);
                int res=calorias();
                System.out.println("el total de calorías fueron:"+res);

                String nombre= JOptionPane.showInputDialog("Dime tu nombre:");
                Sytem.out.println("hola "+ nombre);
        }




}
