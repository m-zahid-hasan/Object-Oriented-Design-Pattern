class Animal
{
   private String name;
   private int id;
   private int age;
   private double price;
   Animal(int id,String name,int age,double price)
   {
       this.id=id;
       this.name=name;
       this.age=age;
       this.price=price;

   }

   public int getId()
   {
       return id;
   }

   public String getName()
   {
       return name;
   }

   public int getAge()
   {
       return age;
   }

   public double getPrice()
   {
        return price;
   }

   
    @Override
    public String toString() {
        return  id + ",       " + name + ",   " + age + ",   " + price;
    }

}
