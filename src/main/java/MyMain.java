public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        int chn = ch;
        if(ch>='A'&&ch<='Z')
        {
            chn+=32;
            ch = (char) chn;
            return ch;
        }
        return ch;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        int chn = ch;
        if(ch>='a'&&ch<='z')
        {
            chn-=32;
            ch = (char) chn;
            return ch;
        }
        return ch;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String ans = "";
        for(int i=0; i<str.length(); i++)
        {
            if(!(str.charAt(i)>='0'&&str.charAt(i)<='9'))
            {
                ans+=str.charAt(i);
            }
        }
        return ans;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('F'));
        System.out.println(toUpper('b'));
        System.out.println(removeNumbers("h9340e93240ll4243o4!"));
    }
}
