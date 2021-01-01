using System;

namespace Snippet_6._2
{
    class Book
    {
        string bookName;
        public string Print()
        {
            return bookName;
        }
        public void input(string bkName)
        {
            bookName = bkName;
        }
        static void Main(string[] args)
        {
            Book objBook = new Book();
            objBook.input("C# - The complete reference");
            Console.WriteLine(objBook.Print());
        }
        
    }
}
