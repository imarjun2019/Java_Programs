public class InterfaceDemo{
   public static void main(String args[]){
   
   // Creating the reference for parent class and object for child class.
   Mobile phone = new iphone();
   phone.cost();
   phone.charger();
   phone.camera();
   phone.sim();
   System.out.println("\n\n-----------------------------------------------------------");
   phone = new samsung();
   phone.cost();
   phone.charger();
   phone.camera();
   phone.sim();
   System.out.println("\n\n-----------------------------------------------------------");
   Laptop laptop = new HPSpectre();
   laptop.keyboard();
   laptop.cost();
   laptop.charger();
   laptop.model();
   laptop.processor();
   System.out.println("\n\n-----------------------------------------------------------");
   laptop = new DellXPS();
   laptop.cost();
   laptop.charger();
   laptop.model();
   laptop.processor();


   
   }  
}

interface Electronics{
void cost();
void charger();
}

abstract class Mobile implements Electronics{
abstract void camera();
abstract void sim();
}

class iphone extends Mobile{

@Override
public void cost(){
   System.out.println("The cost of iphone ranges from 80,000 to 130,000");
}

@Override
public void charger(){
   System.out.println("iphone uses the type 18W USB-C charger");
}

@Override
void camera(){
   System.out.println("iPhone front camera is 10MP and back camera is 20MP");
}

@Override
void sim(){
   System.out.println("iPhone have only one sim system");
}

}

class samsung extends Mobile{

@Override
public void cost(){
   System.out.println("The cost of samsung ranges from 20,000 to 130,000");
}

@Override
public void charger(){
   System.out.println("Samsung uses the USB Type-A and USB Type-C charger");
}


@Override
void camera(){
   System.out.println("Samsung front camera is 8MP and back camera is 22MP");
}

@Override
void sim(){
   System.out.println("Samsung phones can have one or dual sim system");
}


}


abstract class Laptop implements Electronics{

void keyboard(){
   System.out.println("Every Laptops have keyboard\n");
}

abstract void model();
abstract void processor();

}

class HPSpectre extends Laptop{

@Override
public void cost(){
   System.out.println("The cost of HP Spectre ranges from 130,000 to 180,000");
}

@Override
public void charger(){
   System.out.println("HP Spectre uses the OEM power cord charger");
}

void model(){
   System.out.println("The most popular HP Spectre laptop model is HP Spectre X 360");
}

void processor(){
   System.out.println("HP Spectre x 360 uses the intel core i7 8th generation processor");
}

}

class DellXPS extends Laptop{

@Override
public void cost(){
   System.out.println("The cost of Dell XPS ranges from 150,000 to 200,000");
}

@Override
public void charger(){
   System.out.println("Dell XPS uses the USB-C type charger");
}

@Override
void model(){
   System.out.println("The most popular HP Spectre laptop model is Dell XPS 15");
}

@Override
void processor(){
   System.out.println("Dell XPS 15 uses the intel core i7 8th generation processor");
}


}





