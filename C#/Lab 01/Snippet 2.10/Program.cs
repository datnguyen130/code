using System;

namespace Snippet_2._10
{
    class Program
    {
        static void Main(string[] args)
        {
            String path = "C:\\Windows\\MyFile.txt";
            bool found = true;
            if (found)
            {
                Console.WriteLine("Filepath:\'" + path + "\'");
            }
            else
            {
                Console.WriteLine("File Not Found!\a");
            }
        }
    }
}
