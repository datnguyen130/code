using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet_8._9
{
    class BClass : A
    {
        public const float PI = 3.14;
        protected float Radius;
        protected double Areas;
        public virtual void Area()
        {
            Areas = PI * Radius * Radius;
        }
    }
}
