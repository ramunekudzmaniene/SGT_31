package OOP;

public class Animal {

    //Fields
    private String type;
    private String breed;
    private float weight;
    private int avgLifeSpan;

    //Custom constructor
    public Animal(String type, String breed, float weight, int avgLifeSpan){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
        this.avgLifeSpan = avgLifeSpan;

    }
    public Animal(String type, String breed, float weight){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
    }
    public void setAvgLifeSpan(int avgLifeSpan){
        this.avgLifeSpan = avgLifeSpan;
    }

    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Average Lifespan: " + avgLifeSpan + " years");
    }

}
