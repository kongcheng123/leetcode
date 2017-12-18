import org.junit.Test;

/**
 * @author xy
 * @date 2017/12/17 18:06
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if("".equals(s.trim())){
            return 0;
        }
        String[] ss = s.split(" ");
        String last = ss[ss.length - 1];
        String[] l = last.split("");
        return l.length;
    }

    /**
     * 网上做法
     */
    public int lengthOfLastWord_2(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    @Test
    public void test(){

    }
}
