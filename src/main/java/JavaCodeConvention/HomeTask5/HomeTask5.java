package JavaCodeConvention.HomeTask5;

public class HomeTask5 {
// "1. Implement an RLE data compression for a given string. RLE produces sequences in which the same data values occurs " +
//         "in data elements are stored as a single data value and a counter. For example, AAABB => 3A2B. If you have a " +
//         "number in the input string then it should be escaped using \ (slash) if you have a \ in the input string it " +
//         "should be escaped by another \. For example:
//    Input string: AAAAaaaBBBBBB\12
//    Output string: 4A3a6B\\\1\2
//    Input string: AaaaBB2
//    Output string: 1A3a2B\2
//    Input string: AaaaBB\\2
//    Output string: 1A3a2B\\\\\2"


    public static void main(String [] args) {

        String s = "AAAAaaaBBBBBB\\12";
        Integer counter = 0;
        String st = "";
        String rez = "";

        // add / to numbers
        for (String ss : s.split("")) {
            if (ss.matches("[0-9<>%$\\\\]")) {
                st = st + "\\" + ss;
            } else st = st + ss;
        }
        System.out.println(st);
        {
            for (int i = 0; i < st.length(); i++) {
                // check for // to add them to result string
                if (new StringBuilder().append(st.charAt(i)).toString().equals("\\")) {
                    rez = rez + st.charAt(i);
                } else {
                    // Count occurrences of current character
                    int count = 1;
                    while (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) {
                        count++;
                        i++;
                    }

                    if (new StringBuilder().append(st.charAt(i)).toString().matches("[0-9,<>%$]") || count == 1) {
                        // warning for compiler -  Warning:(41, 35) String concatenation '+' in loop  - why it is not good?
                        rez = rez + st.charAt(i);
                    } else {
                        rez = rez + count + st.charAt(i);
                    }
                }
            }
            System.out.print(rez);
        }
    }
}
