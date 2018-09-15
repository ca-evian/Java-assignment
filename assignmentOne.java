public class assignmentOne{
   public static void main(String[ ] args){
    int N = 99;
    while(N!=0)
    {
     System.out.print(N+" bottle");
     if(N!=1)
     { System.out.print("s");}
     System.out.print(" of beer on the wall,"+ N +" bottle");
     if(N!=1)
     { System.out.print("s");}
     System.out.println(" of beer.");
     System.out.println("Take one down.\nPass it around");
     System.out.print(N-1 +" bottle");
     if(N!=2&&N!=1)
     {System.out.print("s");}
     System.out.println(" of beer on the wall.\n");  
     --N;
    }
 }
}
