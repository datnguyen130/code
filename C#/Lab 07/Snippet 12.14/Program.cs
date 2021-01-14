using System;
using System.Collections;
namespace Snippet_12._14
{
    class Authors
    {
        static void Main(string[] args)
        {
            Hashtable objAuthors = new Hashtable();
            objAuthors.Add("Au01", "John");
            objAuthors.Add("Au04", "Mary");
            objAuthors.Add("Au09", "William");
            objAuthors.Add("Au11", "Rodrick");
            Console.WriteLine("ReadOnly  : " + objAuthors.IsReadOnly);
            Console.WriteLine("Count : " + objAuthors.Count);
            IDictionaryEnumerator objCollection = objAuthors.GetEnumerator();
            Console.WriteLine("list of authors : ");
            while (objCollection.MoveNext())
            {
                Console.WriteLine(objCollection.Key + " " + objCollection.Value);
            }
        }
    }
}
