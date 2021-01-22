using System;
using System.Collections.Generic;
using System.Text;

namespace Exercise_2
{
    class Lion : Animal
    {
        public Lion( double Weight)
        {
            base.SetMe("Lion", Weight);
        }
    }
}
