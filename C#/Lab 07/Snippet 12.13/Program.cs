using System;
using System.Collections;
namespace Snippet_12._13
{
    class Program
    {
        static void Main(string[] args)
        {
            Hashtable objTable = new Hashtable();
            objTable.Add(001, "john");
            objTable.Add(002, "Peter");
            objTable.Add(003, "James");
            objTable.Add(004, "Joe");
            Console.WriteLine("number of element in the hash table : " + objTable.Count);
            ICollection objCollection = objTable.Keys;
            Console.WriteLine("Original values stored in hashtable are : ");
            foreach(int i in objCollection)
            {
                Console.WriteLine(i + " : " + objTable[i]);
            }
            if (objTable.ContainsKey(002))
            {
                objTable[002] = "Pattrick";
            }
            Console.WriteLine("Values stored in the hashtable after removing values :");
            foreach(int i in objCollection)
            {
                Console.WriteLine(i + " : " + objTable[i]);
            }

        }
    }
}
