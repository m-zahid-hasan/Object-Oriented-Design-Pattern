class Cat extends Animal{
    private String color;
    Cat(int id,String name,int age,double price,String color){
        super(id,name,age,price);
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return super.toString()+", "+color;
    }
}