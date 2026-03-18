public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length == 0) {

            name = "World";

        } else {

            StringBuilder nameBuilder = new StringBuilder();

            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }

            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2); 
            } else {
                name = "World";
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}