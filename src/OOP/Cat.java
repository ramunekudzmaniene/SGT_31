package OOP;

public class Cat {

    //Fields
    private String breed;
    private String name;
    private int weight;

    //Methods
    //setter methods
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    //getter methods
    public String getBreed(){
        return breed;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
       return weight;
    }

    public void PrintCatsInfo(){
        System.out.println("About my cat:");
        System.out.println("Breed is " + breed);
        System.out.println("Name is " + name);
        System.out.println("And weight is " + weight + "kg");
    }
}
