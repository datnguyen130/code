using System;

namespace Snippet_7._6
{
    class Animal
    {
        public Animal()
        {
            Console.WriteLine("Animal constructor without parameters");
        }
        public Animal(string name)
        {
            Console.WriteLine("Animal constructor with a string parameter");
        }

    }
    class Canine : Animal
    {
        public Canine() : base("Lion")
        {
            Console.WriteLine("Derived Canine");
        }

    }
    class Details
    {
        static void Main(string[] args)
        {
            Canine obj = new Canine();
        }
    }
}
