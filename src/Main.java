public class Main {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            String superscript = switch (day) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };

            System.out.println(
                    "On the " + day + superscript
                            + " day of Christmas my true love sent to me");

            switch (day) {
                case 12: System.out.println("twelve drummers drumming,");
                case 11: System.out.println("eleven pipers piping,");
                case 10: System.out.println("ten lords a-leaping,");
                case 9:  System.out.println("nine ladies dancing,");
                case 8:  System.out.println("eight maids a-milking,");
                case 7:  System.out.println("seven swans a-swimming,");
                case 6:  System.out.println("six geese a-laying,");
                case 5:  System.out.println("five gold rings,");
                case 4:  System.out.println("four calling birds,");
                case 3:  System.out.println("three French hens,");
                case 2:  System.out.println("two turtle doves and");
                case 1:  System.out.println("a partridge in a pear tree.\n");
            }
        }
    }
}