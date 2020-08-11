
public class Scopes
{
   int x = 9;

   int speed = 10;

   public static void main( String[] args )
   {
      //field x visible here
      int x = 10; //x is shadowing field x
      {//block start
         //x can not be declared here
         int y = 12;
         System.out.println( y );
      }
      //y not visible here

      for(int j=0;j<10;j++){
         int y2 = 12;
      }
      int y2 = 20;
   }




   private void myMethod( int y )
   {
      int x = 11;
      System.out.println(speed);
      int age = 9;
      System.out.println(age);

   }

   private void myMethod2( int y )
   {
//      int speed = 20;
      System.out.println(speed);

//      int y = 20;
   }

}
