using System;
using System.Collections;
namespace Snippet_12._11
{
    class ArrayCollection
    {
        static void Main(string[] args)
        {
            ArrayList objArray = new ArrayList();
            objArray.Add("John");
            objArray.Add("James");
            objArray.Add("peter");
            objArray.RemoveAt(2);
            objArray.Insert(2, "William");
            Console.WriteLine("Capacity : " + objArray.Capacity);
            Console.WriteLine("Count : " + objArray.Count);
            Console.WriteLine("Element of ArrayList");
            foreach(string str in objArray)
            {
                Console.WriteLine(str);
            }
        }
    }
}
