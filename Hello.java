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

/****************************************************************************************************/
/****************************************************************************************************/
/****************************************************************************************************/

// import java.util.LinkedHashSet;

// public class Hello {

// public static String removeDuplicateCharacters(String input) {
// // Use LinkedHashSet to maintain insertion order and remove duplicates
// LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

// // Add each character to the LinkedHashSet
// for (char c : input.toCharArray()) {
// uniqueCharacters.add(c);
// }

// // Use StringBuilder to construct the result string
// StringBuilder result = new StringBuilder();
// for (char c : uniqueCharacters) {
// result.append(c);
// }

// return result.toString();
// }

// public static void main(String[] args) {
// String word = "programming";
// String result = removeDuplicateCharacters(word);
// System.out.println(result); // Output: "progamin"
// }
// }

// Input: "aabcccccaaa"
// Output: "a2b1c5a3"
// Input: "abcdef"
// Output: "abcdef" (no compression)

// public class Hello {
// public static String compression(String palabra) {
// char[] one = palabra.toCharArray();
// System.out.println(one);
// for(){}
// return "";
// }

// public static void main(String[] args) {
// String word = "aabcccccaaa";
// compression(word);
// }
// }

/*************************************************************************************/
/*************************************************************************************/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/*************************************************************************************/
// Exercise 1: Reverse a String

// public class Hello {
// public static String reverseAstring(String palabra) {
// char[] one = palabra.toCharArray();
// StringBuilder reversed = new StringBuilder();
// for (int i = one.length - 1; i >= 0; i--) {
// reversed.append(one[i]);
// }

// return reversed.toString();
// }

// public static void main(String[] args) {
// String word = "Here I am";
// String reversedWord = reverseAstring(word);
// System.out.println(reversedWord);
// }
// }

// Exercise 2: Count Vowels and Consonants

// public class Hello {
// public static String countVowelsAndConsonants(String ph) {
// // Convert the input string to lowercase and remove spaces
// String toLower = ph.toLowerCase();
// String ph1 = toLower.replaceAll(" ", "");
// char[] one = ph1.toCharArray();
// int total = one.length;

// StringBuilder sb = new StringBuilder();
// for (char i : one) {
// // Check if the character is a consonant
// if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u') {
// sb.append(i);
// }
// }
// int consonants = sb.length(); // Length of consonants
// int vowels = total - consonants; // Calculate vowels

// String formattedString = String.format("Vowels: %d and Consonants: %d.",
// vowels, consonants);
// System.out.println(formattedString);
// return formattedString;
// }

// public static void main(String[] args) {
// String phrase = "we are one";
// countVowelsAndConsonants(phrase); // Call the method to print the result
// }
// }

// public class Hello {

// /*
// * Complete the 'fizzBuzz' function below.
// *
// * The function accepts INTEGER n as parameter.
// */

// public static void fizzBuzz(int n) {
// // Write your code here
// for (int i = 1; i <= n; i++) {
// // System.out.println(i);
// if (i % 3 == 0 && i % 5 == 0) {
// // return "FizzBuzz";
// System.out.println("FizzBuzz");
// } else if (i % 3 == 0) {
// // return "Fizz";
// System.out.println("Fizz");
// } else if (i % 5 == 0) {
// // return "Buzz";
// System.out.println("Buzz");
// } else {
// System.out.println(i);
// }
// }
// }

// public static void main(String[] args) {
// int myNumber = 100;
// fizzBuzz(myNumber);
// }

// }

// Input: "aabcccccaaa"
// Output: "a2b1c5a3"
// Input: "abcdef"
// Output: "abcdef" (no compression)

// public class Hello {

// public static String compressString(String str) {
// if (str == null || str.isEmpty()) {
// return str;
// }

// StringBuilder compressed = new StringBuilder();
// int countConsecutive = 0;

// for (int i = 0; i < str.length(); i++) {
// countConsecutive++;

// // If the next character is different than the current, append this char to
// the
// // result.
// if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
// compressed.append(str.charAt(i));
// compressed.append(countConsecutive);
// countConsecutive = 0;
// }
// }

// // Return the original string if the compressed string is not smaller
// return compressed.length() < str.length() ? compressed.toString() : str;
// }

// public static void main(String[] args) {
// String input1 = "aabcccccaaa";
// String input2 = "abcdef";

// System.out.println("Input: " + input1);
// System.out.println("Output: " + compressString(input1));

// System.out.println("Input: " + input2);
// System.out.println("Output: " + compressString(input2));
// }
// }

// // 7 kyu
// // Maximum Product
// public class Hello {
// public int adjacentElementsProduct(int[] array) {
// int maxProduct = array[0] * array[1]; // Initialize with the product of the
// first pair
// for (int i = 1; i < array.length - 1; i++) {
// int product = array[i] * array[i + 1];
// if (product > maxProduct) {
// maxProduct = product;
// }
// }
// return maxProduct;
// }

// public static void main(String[] args) {
// Hello mp = new Hello();
// int[] array1 = { 1, 2, 3 };
// int[] array2 = { 9, 5, 10, 2, 24, -1, -48 };
// int[] array3 = { -23, 4, -5, 99, -27, 329, -2, 7, -921 };

// System.out.println("Maximum product of adjacent elements in array1: " +
// mp.adjacentElementsProduct(array1));

// System.out.println("Maximum product of adjacent elements in array2: " +
// mp.adjacentElementsProduct(array2));

// System.out.println("Maximum product of adjacent elements in array3: " +
// mp.adjacentElementsProduct(array3));

// }
// }

// 7 kyu Inspiring Strings
// public class Hello {

// public static String longestWord(String wordString) {
// String[] parts = wordString.split(" ");
// String last = parts[parts.length - 1];
// System.out.println(last);

// return last;
// }

// public static void main(String[] args) {
// String one = "red white blue";
// longestWord(one);
// }
// }

// public class Hello {
// public static void StringPermutations(String word) {
// int total = word.length();
// String[] myArr = word.split("");
// // System.out.println(myArr);
// for (int i = 0; i < myArr.length; i++) {
// for (int j = 0; j < myArr.length; j++) {
// for (int z = 0; z < myArr.length; z++)
// System.out.println(myArr[i] + myArr[j] + myArr[z]);
// }
// }

// System.out.println("/************************/");
// }

// public static void main(String[] args) {
// String wordy = "abc";
// StringPermutations(wordy);
// }
// }

// public class Hello {

// public static void CountAndPrintDuplicates(String str) {
// char[] arr1 = str.toCharArray();
// int count = 0;
// for (int i = 0; i < arr1.length; i++) {
// if (arr1[i] == arr1[i + 1]) {
// System.out.println(arr1[i]);
// System.out.println(count++);
// }
// }

// }

// public static void main() {
// String str = "programming";
// CountAndPrintDuplicates(str);
// }
// }

// public class Hello {
// public static void ReverseWordsInAString(String args) {
// System.out.println(args);
// String[] arr1 = args.split(" ");
// String other = "";
// for (int i = arr1.length - 1; i >= 0; i--) {
// other += arr1[i] + " ";
// }
// System.out.println(other);
// }

// public static void main(String[] args) {
// String str2 = "martin ivan suarez mendez";
// ReverseWordsInAString(str2);
// }
// }

// import java.util.Arrays;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.stream.Collectors;

// public class Hello {

// public static void RemoveGivenCharacterFromString(String wrd, char ltrr) {
// List<String> list = new ArrayList<>(Arrays.asList(wrd.split("")));
// List<String> result = list.stream()
// .filter(x -> !x.equals(String.valueOf(ltrr)))
// .collect(Collectors.toList());
// System.out.println(String.join("", result));
// }

// public static void main(String[] args) {
// String word = "Hello World";
// char letter = 'o';
// RemoveGivenCharacterFromString(word, letter);
// }
// }
