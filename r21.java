public class r21 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>,thanks a lot";
        letter.replace("<|name|>", "darry");
        System.out.println(letter);
    }
}
