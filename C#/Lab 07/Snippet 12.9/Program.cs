using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
namespace Snippet_12._9
{
    class Employee : DictionaryBase
    {
        public void Add(int id, string name)
        {
            Dictionary.Add(id, name);
        }
        public void OnRemoved(int id)
        {
            Dictionary.Remove(id);
        }
        static void Main(string[] args)
        {
            Employee objEmployee = new Employee();
            objEmployee.Add(101, "a");
            objEmployee.Add(102, "b");
            objEmployee.OnRemoved(101);
        }
    }
}
