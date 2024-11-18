// Reverse a String Using Recursion

// Input: "hello"
// Output: "olleh"
// Check for Anagrams

// Input: "listen", "silent"
// Output: true
// Input: "hello", "world"
// Output: false
// Find All Permutations of a String

// Input: "abc"
// Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
// Remove Duplicate Characters

// Input: "programming"
// Output: "progamin"
// Longest Substring Without Repeating Characters

// Input: "abcabcbb"
// Output: 3 (substring is "abc")
// String Compression

// Input: "aabcccccaaa"
// Output: "a2b1c5a3"
// Input: "abcdef"
// Output: "abcdef" (no compression)
// Check If a String Is a Rotation of Another

// Input: "waterbottle", "erbottlewat"
// Output: true
// Input: "hello", "lohel"
// Output: true
// Input: "hello", "world"
// Output: false
// Count Character Frequency

// Input: "aabbbcc"
// Output: a: 2, b: 3, c: 2
// Palindromic Substrings Count

// Input: "abba"
// Output: 6 (substrings: "a", "b", "b", "a", "bb", "abba")
// Count Vowels and Consonants

// Input: "hello world"
// Output: Vowels: 3, Consonants: 7
// Convert String to Integer Without Using parseInt

// Input: "1234"
// Output: 1234
// Input: "-5678"
// Output: -5678
// Remove a Specific Character

// Input: "hello world", 'l'
// Output: "heo word"
// Check for Balanced Parentheses

// Input: "(a + b) - (c)"
// Output: true
// Input: "((a + b)"
// Output: false
// Longest Palindromic Substring

// Input: "babad"
// Output: "bab" or "aba"
// Count Word Occurrences

// Input: "This is a test. This test is fun."
// Output: This: 2, is: 2, a: 1, test: 2, fun: 1
// String Rotation Using Only One Loop

// Input: "abcdef", k = 2
// Output: "cdefab"
// Convert String to Title Case

// Input: "hello world"
// Output: "Hello World"
// Substring Search

// Input: "hello world", "world"
// Output: true
// Input: "hello world", "planet"
// Output: false
// Split a String Using Multiple Delimiters

// Input: "apple;banana|orange,grape"
// Output: ["apple", "banana", "orange", "grape"]
// String to Hexadecimal Conversion

// Input: "hello"
// Output: "68656c6c6f"

import java.util.LinkedHashSet;

public class Hello {

    public static String removeDuplicateCharacters(String input) {
        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

        // Add each character to the LinkedHashSet
        for (char c : input.toCharArray()) {
            uniqueCharacters.add(c);
        }

        // Use StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        for (char c : uniqueCharacters) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String word = "programming";
        String result = removeDuplicateCharacters(word);
        System.out.println(result); // Output: "progamin"
    }
}
