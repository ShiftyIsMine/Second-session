package CAT;

public class first0829 {
    public static void main(String[] args) {
        cat m = new cat();
        m.setBreeds("Persian");
        m.setName("cat1");
        m.setWeight(5.3);

        System.out.print(m.getName()+"이 ");
        m.claw();

        System.out.print(m.getName()+"이 ");
        m.meow();

        System.out.printf("%s \n",m.getName());
        System.out.printf("%s \n",m.getBreeds());
        System.out.printf("%f \n",m.setWeight());
    }
}