public class Usaclock{
	public static void main(String[] args){
		clock gdl= new clock();
		clock tij= new clock(10,27,5);

		gdl.printTime();
		tij.printTime();

		gdl.setTime(12,33,9);
		tij.setTime(10,33,9);

		gdl.printTime();
                tij.printTime();

		gdl.equals(tij);
		System.out.println (gdl.equals(tij));

		tij = gdl.getCopy();
		
		 = gdl.getCopy();		
		
		//System.out.println(gdl.hr+":"+gdl.min+":"+gdl.sec);
		// no sirve por que los atributos son privados 
		//funcionaria si fueran publicos los atributos
	}
}
