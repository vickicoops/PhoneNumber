public class PhoneNumber {

    public static void main(String[] args) {

        String phoneNumber = "(234) 333-5551";

        String areaCode = parseAreaCode (phoneNumber);
        String exchange = parseExchange (phoneNumber);
        String lineNumber = parseLineNumber (phoneNumber);

        System.out.println("The phone number split out into sections is:");
        System.out.println("Area Code      " + areaCode);
        System.out.println("Exchange       " + exchange);
        System.out.println("Line Number    " + lineNumber);

    }

    public static String parseAreaCode(String phoneNumber) {

        int openBracket = phoneNumber.indexOf("(");
        int closeBracket = phoneNumber.indexOf(")");

        String areaCode = phoneNumber.substring(openBracket + 1, closeBracket);
        return areaCode;
    }

    public static String parseExchange(String phoneNumber) {

        int space = phoneNumber.indexOf(" ");
        int dash = phoneNumber.indexOf("-");

        String exchange = phoneNumber.substring(space +1, dash);
        return exchange;
    }

    public static String parseLineNumber(String phoneNumber) {

        int dash = phoneNumber.indexOf("-");
        int end = phoneNumber.lastIndexOf(phoneNumber);

        String lineNumber = phoneNumber.substring(dash + 1);
        // no end index required as default is to pick up the remainder of the string
        return lineNumber;
    }


}
