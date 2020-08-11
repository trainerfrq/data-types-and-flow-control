import java.math.BigInteger;

public class Variables
{
   final static String IP_ADDRESS = "192.0.0.3";

   static String aClassField;

   String aField;

   static byte def;


   public static void main( String[] args )
   {
      //type name
      int age = 18, year = 1800;

      System.out.println( age );

      //java 10
      var phone = "+00001911928";
      System.out.println( phone );

      //memory alloc
      int games = 10;
      BigInteger salary = new BigInteger( "121212121" );

      //variable names
      int aVar = 10;
      int _aVar = 10;
      int $aVar = 10;//let compiler use this
      int AVar = 10;//not ok
      int aVar1 = 10;//ok
      //Ex. play with different variable names

      //enums
      Size mySize = Size.L;
      System.out.println(mySize.getName());

      //constants

      //show instance variables, class variables (static), local variables and parameters

      //default values
      //Ex: print default values for known primitives + String
      System.out.println("def = " + def);
   }


   private static void myMethod( int myParamVar )
   {
      System.out.println( myParamVar );
   }

   public enum OtherSizes
   {
      S,M,L
   }

   public enum Size
   {
      S( "small" ), M( "medium" ), L( "large" ), XL( "xtralarge" );

      private String name;


      Size( String name )
      {
         this.name = name;
      }


      public String getName()
      {
         return name;
      }
   }
}
