import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        int x = 0;
        String Text = "*wwdw<b>*</b>wdaw8*<div>2212*<div>12e1 8*w8+++e388*<html></html><body><body>*3ew**38e3**";
        Pattern pattern = Pattern.compile("<.*?>");
        Matcher matcher = pattern.matcher(Text);
        while (matcher.find()) {
            x++;
        }

        System.out.println(x);

    }
}