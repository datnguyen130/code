using System;

namespace Snippet_4._12
{
    class Program
    {
        static void Main(string[] args)
        {
            int rows = 2;
            int columns = 2;
            for(int i =0; i < rows; i++)
            {
                for (int j =0; j<columns; i++)
                {
                    Console.Write(i * j);
                }
                Console.WriteLine();
            }
        }
    }
}
