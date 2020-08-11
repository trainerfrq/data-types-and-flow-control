import java.math.BigDecimal;

public class Primitives
{
   public static void main( String[] args )
   {
//      integers();
//      floatingPoint();
      charType();
//      String e = "example";
//      booleanType();
   }

   private static void integers()
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

      long octal = 034445;
      System.out.println( octal );

      long mySavings = 1_000_000_000_000_000L;//java 9

      /**
       * auto-conversions
       */
      int toInt = 10;
      long toLong = toInt;
      short toShort = ( short ) toInt;

      //Ex: convert out of range long to int and see what happens
//      int x = 32768;
//      System.out.println("out of range = " + (short) x);

      //Wrapper classes
      int anInt = 10;
      Integer anInteger = anInt; //autoboxing
      //Short, Byte, Integer, Long
   }

   private static void floatingPoint()
   {
      // float  32 bit -> single precision -> rarely used because of bad precision/just for special cases
      // double 64 bit -> double precision
      float f = 1.123f;       // 32bit single precision
      double d = 1.1234567d;  // 64bit double precision

      float f1 = 1.123456789123456789f;
      System.out.println(f1);

      double d1 = 1.123456789123456789d;
      System.out.println(d1);

      //useful constants
      double positiveInfinity = Double.POSITIVE_INFINITY;
      double negativeInfinity = Double.NEGATIVE_INFINITY;
      double nan = Double.NaN;

      BigDecimal bd = new BigDecimal( "1.123456789122223" );

//      Ex.
//            System.out.println(2.0 - 1.1);
//      System.out.println(new BigDecimal("2.0").subtract( new BigDecimal( "1.1" ) ));
      /**
       * floating points use binary representation => 1/10 is not precise in binary
       *       					like 1/3 is not precise in decinal
       */


      //Ex. explore Math class
      //Ex. calculate pitagora bc = Math.sqrt(ab * ab + Math.pow(ac, 2)); a^2+b^2=c^2
   }

   private static void charType()
   {
      char c = 'A';
      char asHex = 65;
      char asUnicode = '\u0041' ;//UNICODE   16bit
      //ASCII 7 bit , UNICODE 8, 16 or 32 bit  ....  UTF-8 or ASCII for english documents

      //Ex. print trademark sign: unicode is 2122
      char tm = '\u2122';
      System.out.println(tm);
   }

   private static void booleanType()
   {
      boolean b1 = false;
      boolean b2 = true;
   }
}
