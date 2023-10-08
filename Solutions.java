package Chapter_3_Practice_set.Chapter_3_Practice_set;

public class Solutions {
    public static void main(String[] args) {
        //Que 1 solution
        String name = "  Boss of The City   ";
        System.out.println(name.toLowerCase());

        //Que 2 Solution
        System.out.println(name.replace(" ", "_"));

        //Que 3 Solution
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Gaurav"));

        //Que 4 Solution
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        //Que 5 Solution
        System.out.println("Dear Gaurav,\n \t keep it up till you learn java");
    }
}
