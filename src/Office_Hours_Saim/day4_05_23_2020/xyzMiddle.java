package Office_Hours_Saim.day4_05_23_2020;
/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class xyzMiddle {
    public static void main(String[] args) {
        String str = "AAxyzBB";
        boolean result = false;

        if (str.length() < 3) result = false;

        int mid = str.indexOf("xyz", str.length() / 2 - 2);
        if (mid < 0) result = false;
        int before = str.substring(0, mid).length();
        int last = str.substring(mid + 3).length();

        result = before ==last || before + 1 == last || before == last + 1;
    }
}
