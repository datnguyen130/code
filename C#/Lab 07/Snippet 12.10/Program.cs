using System;
using System.Collections;
using System.Collections.Generic;
namespace Snippet_12._10
{
    class Student : IEnumerable
    {
        static void Main(string[] args)
        {
            Student objStudent = new Student();
            objStudent.StudentDetails();
            foreach(string str in objStudent.objList)
            {
                Console.WriteLine(str);
            }
            objStudent.Display("James");
        }

        LinkedList<string> objList = new LinkedList<string>();

        public void StudentDetails()
        {
            objList.AddFirst("James");
            objList.AddFirst("John");
            objList.AddFirst("Patrick");
            objList.AddFirst("Peter");
            objList.AddFirst("James");
            Console.WriteLine("Number of elements stored in the list : " + objList.Count);
        }
        public void Display(string name)
        {
            LinkedListNode<string> objNote;
            int count = 0;
            for(objNote = objList.First; objNote != null; objNote = objNote.Next)
            {
                if (objNote.Value.Equals(name))
                {
                    count++;
                }
            }
            Console.WriteLine("The value " + name + " appears " + count + "times in the List");
        }
        public IEnumerator GetEnumerator()
        {
            return objList.GetEnumerator();
        }

    }
}
