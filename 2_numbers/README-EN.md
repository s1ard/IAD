# Number manipulations

## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

Design an algorithm, preferably in pseudocode first, to perform the following number manipulations.
Then, implement these algorithms within the provided method bodies.

The given `NumbersMain` program already contains a base structure for the 
solution and contains a few tests. You can add a few tests of your own.

### Reverse
`int reverse(int number)`; reverses an integer.

For example `reverse(1234)` -> `4321`

### Palindrome
`boolean isPalindrome(int number)`: checks whether an integer is a 
palindrome, which means it is the same reading from left to right as when 
reading from right to left.

For example  `isPalindrome(1331)` -> `true` and `isPalindrome(1234)` -> 
`false`

### Prime number
`boolean isPrime(int number)`: checks whether a natural number (a Java integer) 
is a prime number, i.e. a number which is only divisible (has no remainder) 
by 1 and itself.

For example `isPrime(5)` -> `true`, because 5 is only dividable by 1 and 5 itself,
`isPrime(12)` -> `false`, because 12 can also be divided by 3 (and 4).
