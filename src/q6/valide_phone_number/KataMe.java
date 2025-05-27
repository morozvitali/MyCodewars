package q6.valide_phone_number;

public class KataMe {
    public static boolean validPhoneNumber (String phoneNumber) {
        // TODO: Return whether phoneNumber is in the proper form
        return phoneNumber
                .matches("\\(\\d{3}\\) \\d{3}[-]\\d{4}");

// .xml .iml
    }

    public static void main(String[] args) {


        System.out.println(KataMe.validPhoneNumber("123456-7890"));
        System.out.println(KataMe.validPhoneNumber("(123) 456-7890"));
        System.out.println(KataMe.validPhoneNumber("(1111)555 2345"));
        System.out.println(KataMe.validPhoneNumber("(098) 123 4567"));

    }


}