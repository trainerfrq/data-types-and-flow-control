/**
 * Conway's game of life
 *
 * Any live cell with fewer than two live neighbours dies, as if by underpopulation.
 * Any live cell with two or three live neighbours lives on to the next generation.
 * Any live cell with more than three live neighbours dies, as if by overpopulation.
 * Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 * https://www.youtube.com/watch?v=C2vgICfQawE
 *
 * @author everybody
 */
public class GameOfLife
{
   public static void main( String[] args ) throws InterruptedException
   {
      int size = 20;
      int[][] tabel = initializeMatrix( size );
      displayMatrix( tabel );

      int[][] neighbors = getNeighborsMatrix( tabel );
      displayMatrix( neighbors );
      while ( true )
      {
         tabel = nextYear( tabel, neighbors );
         neighbors = getNeighborsMatrix( tabel );
         displayMatrix( tabel );
         Thread.sleep( 1000 );
      }
   }

   private static int[][] nextYear(int[][] matrix, int[][] neighbors)
   {
      int [][] newMatrix = new int[matrix.length][matrix.length];
      for ( int i = 1; i < matrix.length - 1; i++ )
      {
         for ( int j = 1; j < matrix.length - 1; j++ )
         {
            if (matrix[i][j] == 0 && neighbors[i][j] == 3)
            {
               newMatrix[i][j] = 1;
            }
            else if (matrix[i][j] == 1)
            {
               if (neighbors[i][j] == 2 || neighbors[i][j] == 3)
               {
                  newMatrix[i][j] = 1;
               }
            }
         }
      }
      return newMatrix;
   }


   private static int[][] getNeighborsMatrix( int[][] matrix )
   {
      int[] di = {-1, -1, -1, 0, 0, 1, 1, 1};
      int[] dj = {-1, 0, 1, -1, 1, -1, 0, 1};

      int[][] neighbors = new int[matrix.length][matrix.length];

      for(int i = 1; i < matrix.length-1;i++)
         for ( int j = 1; j < matrix.length-1; j++ )
            for ( int k = 0; k < 8; k++ )
               neighbors[i][j] += matrix[i+di[k]][j+dj[k]];
      return neighbors;
   }


   private static int[][] initializeMatrix( int size )
   {
      int[][] tabel = new int[size][size];
      tabel[2][4] = 1;
      tabel[3][5] = 1;
      tabel[10][10] = 1;
      tabel[10][11] = 1;
      tabel[10][9] = 1;
      for ( int i = 1; i < 19; i++ )
      {
         tabel[11][i] = 1;
         tabel[12][i] = 1;
         tabel[i][5] = 1;
         tabel[i][6] = 1;
      }

      return tabel;
   }


   private static void displayMatrix( int[][] matrix )
   {
      for ( int i = 0; i < matrix.length; i++ )
      {
         for ( int j = 0; j < matrix.length; j++ )
         {
            System.out.print( matrix[i][j] == 0 ? "  " : '\u25A0' + " ");
         }
         System.out.print( "\n" );
      }
   }
}
