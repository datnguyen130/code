using System;
using System.Collections;

namespace Snippet_12._12
{
    class Customers
    {
        static void Main(string[] args)
        {
            ArrayList objCustomer = new ArrayList();
            objCustomer.Add("nicole Anderson");
            objCustomer.Add("Ashley Thomas");
            objCustomer.Add("Garry White");
            Console.WriteLine("Fixed Size : " + objCustomer.IsFixedSize);
            Console.WriteLine("Count : " + objCustomer.Count);
            Console.WriteLine("List of Customers : ");
            foreach(string names in objCustomer)
            {
                Console.WriteLine("{ 0}", names);
            }
            objCustomer.Sort();
            Console.WriteLine("List of Customers after sorting : ");
            foreach(string names in objCustomer)
            {
                Console.WriteLine("{0}", names);
            }
            objCustomer.Clear();
            Console.WriteLine("Count after removing all elements : " + objCustomer.Count);
        }
    }
}
