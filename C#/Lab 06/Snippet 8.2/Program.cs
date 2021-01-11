using System;

namespace Snippet_8._2
{
    public abstract class Animals
    {
        public void Eat()
        {
            Console.WriteLine("Animals can eat");
        }
        public abstract void Sound();
    }

    public class Lion : Animals
    {
        public override void Sound()
        {
            Console.WriteLine("Lion roar");
        }
        static void Main(string[] args)
        {
            Lion objLion = new Lion();
            objLion.Sound();
            objLion.Eat();
        }
    }
}
