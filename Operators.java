import java.math.BigDecimal;


public class Operators
{
   public static void main( String[] args )
   {
      // arithmeticOp();
      // relationalOp();
      // logicalOp();
      // assignmentOp();
      // ternaryOp();
      bitwiseOp();
      // opPrecedence();
   }


   private static strictfp void arithmeticOp()
   {
      double x = 5;
      double y = 2;
      System.out.println( x + y );
      System.out.println( x - y );
      System.out.println( x * y );
      System.out.println( x / y );
      System.out.println( x % y );

      int z1 = 1;
      int z2 = 1;
      System.out.println( z1++ );
      System.out.println( ++z2 );

      int w = 2;
      w += 4;
      System.out.println( w );

      //QA: what is q here? ==1
      int q = 5;
      q %= 2;
      System.out.println( q );

      //Math brings lot of
      //System.out.println(Math.random());

      //Ex1: Simulate a dice roll
      //      for(int i=0;i<=100;i++){
      //         System.out.println((int)(Math.random() * 10 % 6 + 1));
      //      }

      //Ex2: Extract decimal part from a double
      double myDouble = 123.05;
      int decimal = ( int ) myDouble;
      double fractional = myDouble - decimal;
      System.out.println( fractional );
      //            System.out.println(Math.abs(myDouble - (int) myDouble));

      //With Big decimal
      BigDecimal bigDecimal = new BigDecimal( String.valueOf( myDouble ) );
      System.out.println( bigDecimal.subtract( new BigDecimal( bigDecimal.intValue() ) ) );
   }


   private static void relationalOp()
   {
      System.out.println( 6 == 7 );
      System.out.println( 6 != 7 );
      int x = 1;
      int y = 2;

      boolean b = x < y;

      if ( b )
      {
         //do something
      }
   }


   private static void logicalOp()
   {
      boolean a = false;
      boolean b = true;

      System.out.println( a && b );
      System.out.println( a & b );

      boolean c = false;
      c |= true;
      System.out.println( c );
   }


   private static void assignmentOp()
   {
      int a = 10;
      int x, y, z;
      x = z = y = 10;
      System.out.println( z );
   }


   private static void ternaryOp()
   {
      //cond ? true : false
      int x = 1;
      int y = 2;
      System.out.println( x > y ? "x>y" : "y>x" );
   }


   private static void bitwiseOp()
   {
            int x = 4;
            int y = ~x;
            System.out.println( Integer.toBinaryString( x ) );
            System.out.println( Integer.toBinaryString( y ) ); //because of two's complement...invert all bits and add 1
            System.out.println( y );

            int z = 4 & 4;
            System.out.println( z );

            int w = 2 << 2;
            System.out.println( w );

            int ww = 256 >> 1;
            System.out.println( ww );

            System.out.println( Integer.toBinaryString( -4 ) );
            int www = -4 >> 1;
            System.out.println( Integer.toBinaryString( www ) );

            System.out.println( "www = " + www );

            int n = -256 >> 1;
            System.out.println( n );

            int nn = -256 >>> 1;
            System.out.println( nn );

   }


   private static void opPrecedence()
   {
      int a = 1, b = 2, c = 3;
      int d = a + b * c;
      int e = (a + b) * c;

      System.out.println( "a + b * c = " + d );
      System.out.println( "(a + b) * c = " + e );

   }
}
