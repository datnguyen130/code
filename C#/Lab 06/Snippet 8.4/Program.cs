using System;

namespace Snippet_8._4
{
    class Program : IAnimal
    {
        static void Main(string[] args)
        {
            Program obj = new Program();
            obj.AnimalType();
            Console.WriteLine(obj.GetType().Name);
        }

        public void AnimalType()
        {
            Console.WriteLine("Animal...");
        }
    }
}
