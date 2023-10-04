class Dog extends Animal{
    private String breed;

    Dog(int id,String name,int age,double price,String breed){
        super(id,name,age,price);
        this.breed=breed;
        
    }
    public String getBread(){
        return breed;
    }

     @Override
    public String toString() {
        return super.toString() + ",   " + breed;
    }

   
}