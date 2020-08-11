import java.time.DayOfWeek;

public class Switch
{
   public static void main( String[] args )
   {
      int choice = 1;
      String month = "Ian";

      switch ( choice )
      {
         case 1:
            System.out.println( "1" );
            break;
         case 2:
            System.out.println( "2" );
            break;

         case 3:
            System.out.println( "3" );
            break;

         default:
            System.out.println( "Bad input" );
            break;

      }

      WeekDays weekDay = WeekDays.Tuesday;
      switch ( weekDay )
      {
         case Monday: //!! case can be char, byte, short, int, enum, String (java7)
            System.out.println( "M" );
            break;
         case Tuesday:
            System.out.println( "T" );
            break;

      }

      String name = "Mihai";
      switch ( name )
      {
         case "Mihai":
            System.out.println( "Salut Mihai" );
            break;
         case "Robert":
            System.out.println( "Salut Robert" );
            break;

      }

      //java 12 features
      int x = 1;
      switch ( x )
      {
         case 1 -> System.out.println( "Foo" ); //java 12 can return value like break 12;
         default -> System.out.println( "Bar" );
      }

      int y = switch ( x )
            {
               case 1 -> 2;
               case 2 -> 4;
               case 3, 4 -> 3; //java 12
               default -> 1;
            };

      //java 13
      //      int r = workWeekDays( DayOfWeek.WEDNESDAY );

   }


   private static int workWeekDays( DayOfWeek s )
   {
      return switch ( s )
            {
               case MONDAY:
                  yield 1; //java 13
               case TUESDAY:
                  yield 2;
               case WEDNESDAY:
                  yield 3;
               case THURSDAY:
                  yield 4;
               case FRIDAY:
               default:
                  System.out.println( "Seems that the selected day is weekend" );
                  yield 0;
            };
   }


   private enum WeekDays
   {
      Monday, Tuesday, Sunday;
   }
}
