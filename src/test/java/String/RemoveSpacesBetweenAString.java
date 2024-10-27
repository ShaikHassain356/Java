package String;

public class RemoveSpacesBetweenAString {
    public static void main(String[] args) {
        String s= "Hass ain ";
        String trimmed = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(trimmed);

        //we can also use below logic

        String s1="  Ha  s   s    a   i   n   ";
        String trimmed1= s1.replaceAll(" ","");
        System.out.println(trimmed1);
    }
}
