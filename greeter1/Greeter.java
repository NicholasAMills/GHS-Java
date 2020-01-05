public class Greeter
{public String name;//instance field
    public Greeter(String n)//constructor
    {
        name = n;//putting the name from the main into the name instance field
    }
   public String sayHello()
   {
      
      String message = "Hello, World!" + name;
      return message;
   }
   
   public String sayGoodbye()
   {
       String message1 = "Good bye, " + name;
       return message1;
    }
}
