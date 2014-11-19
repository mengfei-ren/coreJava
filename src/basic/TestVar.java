package basic;

public class TestVar {
	
	//Test Primitive Type Conversion	
	public static void main(String[] args){
		int i1 = 123; 
        int i2 = 456;
        double d1 = (i1+i2)*1.2;//
        float f1 = (float)((i1+i2)*1.2);  //Force convert int to float
        System.out.println("Int i1=123,i2=456. Run (i1+i2)*1.2:\nDouble d1:"+d1+"\tFloat f1:"+f1);

        byte b1 = 67; 
        byte b2 = 89;
        byte b3 = (byte)(b1+b2);   //Default calculate in int then force to convert
        System.out.println("Byte 67+89="+b3);
        
        double d2 = 1e200;
        float f2 = (float)d2;   //Higher to lower --> Overflow
        System.out.println("Double 1e200+Float (1e200)="+f2);

        float f3 = 1.23f;  //post-fix f is required
        long l1 = 123;
        long l2 = 30000000000L;   //post-fix L is required
        float f = l1+l2+f3;      //Convert to float for calculation
        long l = (long)f;      //Force conversion may lose decimal part
        System.out.println(f+"\t"+l);		
	}

}
