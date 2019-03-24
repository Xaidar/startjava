public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Name: " + wolfOne.getName());
        System.out.println("Hunt: " + wolfOne.hunt());
        wolfOne.setAge(4);
        System.out.println("Age: " + wolfOne.getAge());
   }
}