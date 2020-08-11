
public class Person
{
   String name;

   int age;

   static int phoneNumber;


   Person( String name, int age )
   {
      this.name = name;
      this.age = age;
   }


   public static void main( String[] args )
   {
      System.out.println( "Hello world!" );

      Person aPerson = new Person( "George", 19 );

      System.out.println( "The age of that person is " + aPerson.getAge() );
      aPerson.walk();
      doSomething();
   }


   private static void doSomething()
   {
      System.out.println("Do something");
   }


   void walk()
   {
      System.out.println( "Move one step" );
   }


   int getAge()
   {
      return age;
   }
}
