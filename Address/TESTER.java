

public class TESTER
{
     public static void main(String args[])
    {
      Address myAdd = new AddressTester();
     
       System.out.println(myAdd.housenum() + " " + myAdd.street() );
        System.out.println(myAdd.city() + " " + myAdd.state() + " " + myAdd.postalcode());
    }
}
