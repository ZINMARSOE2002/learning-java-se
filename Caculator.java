class Caculator{
     int a;
     int b;
     public int Addition(int a, int b){
        return a+b;
     }
     public int Subtraction(int a, int b){
        return a-b;
     }
     public int Multiplaction(int a, int b){
        return a*b;
     }
     public int Division(int a,int b){
        return a/b;
     }
     public Caculator(int a,int b){
        this.a= a;
        this.b=b;
     }
     public void getShow(){
        System.out.println("Addition = "+Addition( a, b));
        System.out.println("Subtraction = "+Subtraction( a, b));
        System.out.println("Multiplaction = "+Multiplaction( a, b));
        System.out.println("Division= "+Division( a, b));
        
     }

public static void main (String[]args){
    Caculator caculator= new Caculator(20,10);
    caculator.getShow();
    
}
}
