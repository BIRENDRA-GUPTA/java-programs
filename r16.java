import javax.annotation.processing.SupportedOptions;

public class r16 {
    public static void main (String [] args)
    {
        String name = "Harry";

        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nontrimmedstring = "Harry";
        System.out.println(nontrimmedstring);
        
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);

        System.out.println(name.substring(1));

        System.out.println(name.substring(1,5));

        System.out.println(name.replace("r", "p" ));

        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));

        System.out.println(name.endsWith("dd"));
        System.out.println(name.charAt(4));


        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));

        System.out.println(modifiedName.indexOf("rry", 4));

        System.out.println(modifiedName.lastIndexOf("rry",4));

        String equals = "Harry";

        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("Harry"));

        System.out.println("I am escap sequence\"double quote");
    }
}
