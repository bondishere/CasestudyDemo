package sample;


class Animal
{
    void whoAmI()
    {
        System.out.println("I am a generic Animal.");
    }
}

class Dog extends Animal
{
    void whoAmI()
    {
        System.out.println("I am a Dog.");
    }
}

class Cow extends Animal
{
    void whoAmI()
    {
        System.out.println("I am a Cow.");
    }
}

class Snake extends Animal
{
    void whoAmI()
    {
        System.out.println("I am a Snake.");
    }
}




    public static void main(String[] args)
    {
        Animal ref1 = new Animal();
        Animal ref2 = new Dog();
        Animal ref3 = new Cow();
        Animal ref4 = new Snake();
       
       
        ref1.whoAmI();
        ref2.whoAmI();
        ref3.whoAmI();
        ref4.whoAmI();
       
        Animal genericRef = null;
       
        genericRef = ref1;
        genericRef.whoAmI();
       
        genericRef = ref2;
        genericRef.whoAmI();
       
        genericRef = ref3;
        genericRef.whoAmI();
       
        genericRef = ref4;
        genericRef.whoAmI();
       
       
       
   
    }
}

