import java.math.BigDecimal;
import java.math.BigInteger;

public class Various
{
   public static final String PHONE_NUMBER = "121212121";

   public static final String MY_PORT = "port123";

   static String myName;

   static int shoeSize;


   public static void main( String[] args )
   {
      //      literals();

      //      primitives();
      //      assignement();

      //      overflow();

      //      arithmeticOperations();
      //      logicalOp();

      //      arrays();

      for ( int i = 1; i <= 10; i++ )
      {
         System.out.println( i );
      }
   }


   private static void arrays()
   {
      String[] countries = { "Romania", "Germany", "UK" };
      char[] destination = new char[8];

      String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
      System.out.println( names[0][0] + names[1][0] ); // Mr. Smith

      //      var fromJava10 = new int[] { 1, 2, 3 };
      //      var fromJava10 = { 1, 2, 3 };
   }


   private static void logicalOp()
   {
      //      boolean a = false;
      //      boolean b = true;
      //      System.out.println( a && b );//||
      //      System.out.println( a & b );//|

      //      int a = 10;
      //      int x, y, z;
      //      x = z = y = 10;

      //      //cond ? true : false
      //      int x = 1;
      //      int y = 2;
      //      System.out.println( x > y ? "x>y" : "y>x" );
   }


   private static void arithmeticOperations()
   {
      int z1 = 1;
      int z2 = 1;
      System.out.println( z1++ );//1
      System.out.println( ++z2 );//2

      int q = 5;
      q = q % 2;
      System.out.println( q );//1
      //Exercise: Simulate dice roll.
      //Math.random()
      System.out.println( "Roll the dice " + diceRoll() );

      //Extract decimal from double
      double myDouble = 123.05;
      int decimal = ( int ) myDouble;
      System.out.println( decimal );

      double myDouble2 = 123.99;
      int decimal2 = ( int ) myDouble2;
      System.out.println( decimal2 );

      System.out.println( ( int ) 123.99 );

      //      double fractional = myDouble - decimal;
      //      System.out.println( fractional );

      //      BigDecimal bigDecimal = new BigDecimal( String.valueOf( myDouble ) );
      //      System.out.println( bigDecimal.subtract( new BigDecimal( bigDecimal.intValue() ) ) );
   }


   private static int diceRoll()
   {
      return ( int ) (Math.random() * 10 % 6 + 1);
   }


   private static void assignement()
   {
      //type name
      int age = 18, year = 1800;

      var phone = "+00001911928";
      var i = 1;

      int games = 10;
      BigInteger salary = new BigInteger( "121212121" );

      Variables.Size mySize = Variables.Size.L;
      System.out.println( mySize.getName() );

      int myAge = 0;
      System.out.println( myAge );

      System.out.println( "my name is " + myName );
      System.out.println( "my shoe size is " + shoeSize );
   }


   private static void overflow()
   {
      while ( true )
      {
         overflow();
      }
   }


   private static void primitives()
   {
      byte b = 1;        // 8 bit     -128 127
      short sh = -100;   // 16 bit    -32,768 32,767
      int i = -10001;    // 32 bit    -2 bil   2 bil
      long l = 1999L;    // 64 bit    huge

      /**
       * different representations
       */
      long hexa = 0xCAFE;
      System.out.println( hexa );

      long bit = 0b111010101; //java 7
      System.out.println( bit );

      /**
       * auto-conversions
       */
      int toInt = 10;
      long toLong = toInt;
      short toShort = ( short ) toInt;

      int x = 40768;
      System.out.println( "my new short " + ( short ) x );

      //Wrapper classes
      int anInt = 10;
      Integer anInteger = anInt; //autoboxing
      //Short, Byte, Integer, Long

      // float  32 bit -> single precision -> rarely used because of bad precision/just for special cases
      // double 64 bit -> double precision
      float f = 1.123f;       // 32bit single precision
      double d = 1.1234567d;  // 64bit double precision

      float f1 = 1.123456789123456789f;
      System.out.println( "float = " + f1 );

      double d1 = 1.123456789123456789d;
      System.out.println( "double = " + d1 );

      System.out.println( 2.0 - 1.1 );

      https:
      //www.youtube.com/watch?v=PZRI1IfStY0

      System.out.println( new BigDecimal( "2.0" ).subtract( new BigDecimal( "1.1" ) ) );

      //a^2+b^2=c^2
      //      Math.sqrt(ab * ab + Math.pow(ac, 2));

      char c = 'A';
      char asHex = 65;
      char asUnicode = '\u0041';//UNICODE   16bit
      //https://www.youtube.com/watch?v=MijmeoH9LT4

      char tm = '\u2122';
      System.out.println( tm );

      boolean b1 = false;
      boolean b2 = true;
   }


   private static void literals()
   {
      //numeric
      //      int a = 109; // decimal-form literal
      //      int b = 0170; // octal-form literal
      //      int c = 0xCafe; // Hexa-decimal form literal
      //      int d = 0b1010; // Binary literal
      //      int e = 1_000_000_000;

      //floating point:
      double a = 4.0;
      double b = 30d;
      float d = 15F;
      double c = 0.5;
      double e = 3.14159e0;  //3.14 x 10^0
      double f = 2.718281828459045D;
      double g = 1.0e-6D;

      System.out.println( e );
   }
}
