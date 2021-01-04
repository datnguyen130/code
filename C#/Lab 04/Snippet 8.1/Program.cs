using System;

namespace Snippet_8._1
{
    public abstract class Animal
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to servive");

        }
        public abstract void AnimalSound();
        public abstract void Habitat();

    }
}
