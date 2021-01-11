using System;

namespace Snippet_8._6
{
    class Crocodile : ITerrestrialAnimal, IMarineAnimal
    {
        static void Main(string[] args)
        {
            Crocodile obj = new Crocodile();
            obj.Eat();
            obj.Swim();
        }

        public void Eat()
        {
            Console.WriteLine("The Crocodile eat flesh");
        }

        public void Swim()
        {
            Console.WriteLine("The Crocodile can swim");
        }
    }
}
