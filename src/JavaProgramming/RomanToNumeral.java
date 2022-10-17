package JavaProgramming;

public class RomanToNumeral {
    public static void main(String[] args) {
        String inputRomanValue = "XXVII";
        int finalValue = 0;
        int previousCharVal = 0;
        for (int loopOfChar = inputRomanValue.length() - 1; loopOfChar >= 0; loopOfChar--) {
            char rightChar = inputRomanValue.charAt(loopOfChar);
            int getCurrentValue = getRomanConversion(rightChar);
            if (previousCharVal > getCurrentValue) {
                finalValue = finalValue - getCurrentValue;
            } else {
                finalValue = finalValue + getCurrentValue;
                previousCharVal = getCurrentValue;
            }
        }
        System.out.println("Answer:" + finalValue);
    }
    private static int getRomanConversion(char inputValue) {
        int returnValue = 0;
        switch (inputValue) {
            case 'I':
                returnValue = 1;
                break;
            case 'V':
                returnValue = 5;
                break;
            case 'X':
                returnValue = 10;
                break;
            case 'L':
                returnValue = 50;
                break;
            case 'C':
                returnValue = 100;
                break;
            case 'D':
                returnValue = 500;
                break;
            case 'M':
                returnValue = 1000;
                break;
            default:
        }
        return returnValue;
    }
}
