/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class Main {
    public static void main(String[] args) {

        String s = "car";
        String t = "arc";

        System.out.println("Is the word " + t + " an anagram of the word " + s + ": " + Anagram.isAnagram(s, t));


    }
}