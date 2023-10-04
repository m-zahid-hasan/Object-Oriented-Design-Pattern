import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        Petshop petshop=new Petshop();

        Dog dog1=new Dog(1,"Retriever",4,500.00,"  ");
        Dog dog2=new Dog(2,"Shepherd",4,500.00,"  ");

        petshop.addDog(dog1);
        petshop.addDog(dog2);

        Cat cat1=new Cat(1,"Alice",3,300.0,"white");
        Cat cat2=new Cat(2,"Apllo",3,300.0,"black");

        petshop.addCat(cat1);
        petshop.addCat(cat2);


        Bird bird1=new Bird(1,"Pecock",3,300.0,"black");
        Bird bird2=new Bird(2,"Pigeon",3,300.0,"gray");

        petshop.addBird(bird1);
        petshop.addBird(bird2);


        System.out.println("    Dog details");
        System.out.println("Id       Name      Age    Price    breed\n");
        petshop.DisplayDog();

        
        System.out.println("\n\n   Cat details");
        System.out.println("Id    Name    Age   Price  color\n");
        petshop.DisplayCat();

        System.out.println("\n\n   Bird details");
        System.out.println("Id    Name     Age    Price   color\n");
        petshop.displayBird();
    }
}