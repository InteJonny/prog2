
import java.util.ArrayList;

public class uppgift2 {

    public static void main(String[] args) {
        String original = "backwards";
        String backwards = metoden(original, original.length() - 1, new ArrayList<String>());
        System.out.println(backwards);
    }

    public static String metoden(String original, int index, ArrayList<String> Letters) {
        String backwards = "";

        String letter = "";
        Letters.add(String.valueOf(original.charAt(index)));

        if (index != 0) {

            metoden(original, --index, Letters);
        }

        for (String l : Letters)
            backwards += l;

        return backwards;

    }
}

