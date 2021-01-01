using System;

namespace Snippet_7._8
{
    class Animal
    {
        public virtual void Eat()
        {
            Console.WriteLine("Every animal eats somethings");
        }
        protected void Dosth()
        {
            Console.WriteLine("Every animal does something");
        }
    }
    class Cat : Animal
    {
        public void Eatt()
        {
            Console.WriteLine("Cat love to eat mouse");
        }
    }
    class MiniCat : Cat
    {
        public override void Eat()
        {
            Console.WriteLine("Mini Cat drinks milk");
        }
        static void Main(string[] args)
        {
            MiniCat obj = new MiniCat();
            obj.Eat();
        }
    }
}
