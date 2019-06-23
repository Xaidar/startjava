package src.com.startjava.lesson_2_3.robot;

public class JaegerTest { 

    public static void main(String[] args) {
        Jaeger rbtOne = new Jaeger("ModelName1", "Mark1", "RUS", 81.8f, 2.004f);
        Jaeger rbtTwo = new Jaeger("ModelName2", "Mark2", "USA", 67.8f, 1.801f);

        System.out.println(rbtOne);
        System.out.println(rbtTwo);
    }
}