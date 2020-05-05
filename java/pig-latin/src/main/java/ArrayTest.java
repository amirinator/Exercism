public class ArrayTest {


    public static void main(String[] args) {

        char[] chars = {'a','b','c','d','e','f'};


        lookback(chars,3);
    }

    private static void lookback(char[] chars, int position) {

        int length = chars.length;
        char[] temp = new char[length];
        for ( int i = 0; i < length; i++) {
            int tmp = i;
            //int tmp = (i+position-1) % length;
            if( (i+position)-length >= 0) {
                tmp = i - position;
            } else {
                tmp = i + position;
            }
            System.out.println(tmp + "   " + chars[tmp]);
            temp[i] = chars[tmp];
            //System.out.println(i + "   " + temp[i]);
        }

    }


}
