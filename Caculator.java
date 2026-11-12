class Caculator{
     int a;
     int b;
     public int addition(int a, int b){
        return a+b;
     }
     public int subtraction(int a, int b){
        return a-b;
     }
     public int multiplaction(int a, int b){
        return a*b;
     }
     public int division(int a,int b){
        return a/b;
     }
     public Caculator(int a,int b){
        this.a= a;
        this.b=b;
     }
     public void getShow(){
        System.out.println("Addition = "+addition( a, b));
        System.out.println("Subtraction = "+subtraction( a, b));
        System.out.println("Multiplaction = "+multiplaction( a, b));
        System.out.println("Division= "+division( a, b));
        
     }

public static void main (String[]args){
    Caculator caculator= new Caculator(20,10);
    caculator.getShow();
    
}
}
