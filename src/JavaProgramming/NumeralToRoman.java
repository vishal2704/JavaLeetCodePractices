package JavaProgramming;

public class NumeralToRoman {

    public static void main(String[] args) {

        int inputNumber = 1994;

    }

    private static char getNumeralConversion(int inputValue) {
        int returnValue = 0;
        switch (inputValue) {
            case 1:
                returnValue = 'I';
                break;
            case 5:
                returnValue = 'V';
                break;
            case 10:
                returnValue = 'X';
                break;
            case 50:
                returnValue = 'L';
                break;
            case 100:
                returnValue = 'C';
                break;
            case 500:
                returnValue = 'D';
                break;
            case 1000:
                returnValue = 'M';
                break;
            default:
        }
        return returnValue;
    }
}
