using System;

namespace Snippet_5._10
{
    class Program
    {
        static void Main(string[] args)
        {
            string[][] companies = new string[3][];
            companies[0] = new string[] { "intel", "amd" };
            companies[1] = new string[] { "ibm", "mcrisoft", "sun" };
            companies[2] = new string[] { "hp", "canon", "lexmark", "epson" };
            for(int i =0; i <companies.GetLength(0); i++)
            {
                Console.Write("List of comapnies in group " + (i + 1) + " : \t");
                for(int j = 0; j <companies[i].GetLength(0); j++)
                {
                    Console.Write(companies[i][j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}
