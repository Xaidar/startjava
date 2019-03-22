public class ConditionalStatement {    
    public static void main(String[] args) {

        int age = 25;
        String gender = "мужской";
        double growth = 1.85d;
        String name = "Xaidar";

        if (age > 20) {
            System.out.println("Ваш возраст > 20");
        }

        if (gender.equals("мужской")) {
            System.out.println("Ваш пол мужской");
        }

        if (gender.equals("женский")) {
            System.out.println("Ваш пол женский");
        }

        if (growth < 1.8) {
            System.out.println("Ваш рост < 1.8");
        } else {
            System.out.println("Ваш рост >= 1.8");
        }

        if (name.substring(0, 1).equals("М") ) {
            System.out.println("Ваше имя начинается с буквы M");
        } else if (name.substring(0, 1).equals("И") ) {
            System.out.println("Ваше имя начинается с буквы И");
        } else {
            System.out.println("Ваше имя " + name);
        }
    }
}