class Converter {
    public static int binToDec(int bin) {
        int result = 0;
        for (int j = 0; bin>0; j++) {
            int te = bin%10;
            bin /= 10;
            result += te * Math.pow(2, j);
        }
        return result;
    }

    public static int binToOct(int bin) {
        int result = 0;
        while (bin>0) {
            result *= 10;
            result += binToDec(bin%1000);
            bin/=1000;
        }
        result = invertNumber(result);
        return result;
    }

    private static int invertNumber(int numberToInvert) {
        int result = 0;
        while (numberToInvert>0) {
            result *= 10;
            result += numberToInvert%10;
            numberToInvert /= 10;
        }
        return result;
    }
}

class ConverterTest {
    public static void main(String[] args) {
        System.out.println(Converter.binToDec(100));
        System.out.println(Converter.binToOct(1100));
        System.out.println(Converter.binToOct(101));   
    }
}