package CAT;

public class cat {
    private String name;
    private String breeds;
    private double weight;

    void claw(){
        System.out.println("할퀴기! \n");
    }

    void meow(){
        System.out.println("냐아옹 \n");
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public String getBreeds() {
        return breeds;
    }
    public String setBreeds(String bre) {
        this.breeds = bre;
        return breeds;
    }
    public double setWeight() {
        return weight;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String getName() {
        return name;
    }
}