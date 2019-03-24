public class Wolf {

    private String gender = "Male";
    private String name = "Бим";
    private String color = "Gray";
    private long age = 6;
    private float weight = 42.85f;

    public boolean go() {
        return true;
    } 

    public boolean sit() {
        return false;
    }

    public boolean run() {
        return false;
    } 

    public boolean howl() {
        return false;
    }

    public boolean hunt() {
        return true;
    } 

    public long getAge() {
        return age;
    } 

    public void setAge(long age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    } 

    public String getName() {
        return name;
    } 

}