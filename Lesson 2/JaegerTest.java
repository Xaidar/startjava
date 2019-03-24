public class JaegerTest { 

    public static void main(String[] args) {
        Jaeger rbtOne = new Jaeger();
        rbtOne.setModelName("ModelName1");
        rbtOne.setMark("Mark1");
        rbtOne.setOrigin("RUS");
        rbtOne.setHeidht(81.8f);
        rbtOne.setWeidht(2.004f);

        Jaeger rbtTwo = new Jaeger();
        rbtTwo.setModelName("ModelName2");
        rbtTwo.setMark("Mark2");
        rbtTwo.setOrigin("USA");
        rbtTwo.setHeidht(67.8f);
        rbtTwo.setWeidht(1.801f);

        System.out.println(rbtOne);
        System.out.println(rbtTwo);
    }
}