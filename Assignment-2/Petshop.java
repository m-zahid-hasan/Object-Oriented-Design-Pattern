import java.util.ArrayList;
import java.util.List;
class Petshop{

    private String name;
    private List<Dog> dogs;
    private List<Cat> cats;
    private List<Bird> birds;

    Petshop(){
    this.dogs=new ArrayList<>();
    this.cats=new ArrayList<>();
    this.birds=new ArrayList<>();
   }

     
    public void addDog(Dog dog){
        dogs.add(dog);
        
    }

    public void addCat(Cat cat){
        cats.add(cat);
    }

    public void addBird(Bird bird){
        birds.add(bird);
    }


     void DisplayDog()
    {
        for(Dog a:dogs)
        System.out.println(a);
    }

    void DisplayCat(){
        for(Cat a:cats)
        System.out.println(a);
    }

    void displayBird(){
        for(Bird a:birds)
        System.out.println(a);
    }

   
}