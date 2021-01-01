using System;

namespace Snippet_7._7
{
    class Metals
    {
        string metaType;
        public Metals(string type)
        {
            metaType = type;
            Console.WriteLine("Metal: \t\t" + metaType);
        }
    }
    class SteelCompany : Metals
    {
        string grade;
        public SteelCompany(string grade) : base("Steel")
        {
            this.grade = grade;
            Console.WriteLine("Grade : \t\t" + grade);
        }
    }
    class Automobiles : SteelCompany
    {
        string part;
        public Automobiles(string part) : base("Cast Iron")
        {
            this.part = part;
            Console.WriteLine("Part : \t\t" + part);
        }
        static void Main(string[] args)
        {
            Automobiles obj = new Automobiles("Chassies");
        }
    }
}
