public class HelloWorld {
    public static void main(String [] args)
	{
		System.out.println("Hello Roger");
		Chicken chicken1=new Chicken();
		//Se crea un objeto
		//Llamo los metodos
		chicken1.initializeData("Lucy","Brown",2);
		chicken1.print();
                chicken1.drink();
                chicken1.layAnEgg();
                chicken1.poop();
                
                Chicken chicken2=new Chicken();
                chicken2.initializeData("Mary", "Orange", 5);
                chicken2.print();
                chicken2.drink();
                chicken2.layAnEgg();
                chicken2.poop();
                
                Chicken chicken3=new Chicken();
                chicken3.initializeData("Stefy", "White", 9);
                chicken3.print();
                chicken3.drink();
                chicken3.layAnEgg();
                chicken3.poop();
                
                Chicken chicken4=new Chicken();
                chicken4.initializeData("Sofi", "Black", 8);
                chicken4.print();
                chicken4.drink();
                chicken4.layAnEgg();
                chicken4.poop();
        }   
}
