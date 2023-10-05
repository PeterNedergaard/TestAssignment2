public class UtilityController {

    public String ReverseString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = input.length()-1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        
        return result.toString();
    }

    public String CapitalizeString(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            result.append(Character.toUpperCase(ch));
        }

        return result.toString();
    }

    public String LowercaseString(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            result.append(Character.toLowerCase(ch));
        }

        return result.toString();
    }

}
