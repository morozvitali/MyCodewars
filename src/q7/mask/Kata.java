package q7.mask;

public class Kata {

    public static String maskify(String str) {
        return str.replace("^\\d{12}", "#")
                .replace("^\\d{7}}", "#")
                .replace("^\\s{2}", "#")
                .replace("^\\s{26}", "#");



        //throw new UnsupportedOperationException("Unimplemented");
    }
}
