class JavaPrinter {
    public static String printLetterByLine(int line, char c) {
        String out = "";
        if (c=='J') {
            switch(line) {
                case 1:
                case 2:
                    for (int i = 0; i<3; i++) out+=" ";
                    out+="J";
                break;
                case 3:
                    out += "J";
                    for (int i = 0; i<2; i++) out += " ";
                    out += "J";
                break;
                case 4:
                    out += " ";
                    for (int i = 0; i<2; i++) out += "J";
                    out += " ";
                break;
                default:
                    break;
            }
        } else if (c == 'A') {
            switch (line) {
                case 1:
                    for (int i = 0; i<3; i++) out+=" ";
                    out+="a";
                    for (int i = 0; i<3; i++) out+=" ";
                break;
                case 2:
                    for (int i = 0; i<7; i++) {
                        if (i%2 == 0 || i == 3) out += " ";
                        else out+= "a";
                    }
                break;
                case 3:
                    for (int i= 0; i<7; i++) out+="a";
                break;
                case 4:
                    out += "a";
                    for (int i = 0; i<5; i++) out+= " ";
                    out += "a";
                break;
                default:
                    throw new IndexOutOfBoundsException();
            }
        } else if (c=='V') {
            switch (line) {
                case 1:
                    out+="v";
                    for (int i = 0; i<5; i++) out+=" ";
                    out+="v";
                    break;
                case 2:
                    for (int i = 0; i<7; i++) {
                        if (i%2 == 0 || i == 3) out += " ";
                        else out += "v";
                    }
                break;
                case 3:
                    for (int i =0; i<2; i++) out += " ";
                    out += "V V";
                    for (int i =0; i<2; i++) out += " ";
                break;
                case 4:
                    for (int i = 0; i<3; i++) out+=" ";
                    out += "V";
                    for (int i = 0; i<3; i++) out+=" ";
                break;
                default: 
                    break;
            } 
        }else {
            out += "";
        }
        return out;
    }

    public static void main(String[] args) {
        for (int i = 1; i<=4; i++) {
            System.out.println(printLetterByLine(i, 'J') + " " + printLetterByLine(i, 'A') + " " + printLetterByLine(i, 'V') + " " + printLetterByLine(i, 'A'));
        }
    }
}