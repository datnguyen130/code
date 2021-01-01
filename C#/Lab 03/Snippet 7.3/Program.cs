using System;

namespace Snippet_7._3
{
    class Aninmal
    {
        protected string Food;
        protected string Activity;
        
    }
    class Cat : Aninmal
    {
        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            objCat.Food = "Mouse";
            objCat.Activity = "laze around";
            
        }
    }
}
