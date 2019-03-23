public class ConditionalStatement {    
    public static void main(String[] args) {
        int age = 25;
        boolean isMale = true;
        boolean isFemale = false;
        double growth = 1.85;
        String name = "Xaidar";

        if (age > 20) {
            System.out.println("Ваш возраст > 20");
        }

        if (isMale) {
            System.out.println("Ваш пол мужской");
        }

        if (isFemale) {
            System.out.println("Ваш пол женский");
        }

        if (growth < 1.8) {
            System.out.println("Ваш рост < 1.8");
        } else {
            System.out.println("Ваш рост >= 1.8");
        }

        if (name.charAt(0) == 'М') {
            System.out.println("Ваше имя начинается с буквы M");
        } else if (name.charAt(0) == 'И') {
            System.out.println("Ваше имя начинается с буквы И");
        } else {
            System.out.println("Ваше имя " + name);
        }
    }
}