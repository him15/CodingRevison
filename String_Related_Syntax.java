//++++++++++++++++   STRING BUILDER +++++++++++++++++

StringBuilder str = new StringBuilder();

str.append("GFG");


char charAt(int index): // This method returns the char value in this sequence at the specified index.
StringBuilder delete(int start, int end):  // This method removes the characters in a substring of this sequence.
StringBuilder deleteCharAt(int index):  // This method removes the char at the specified position in this sequence.
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): // This method characters are copied from this sequence into the destination character array dst.
int indexOf():  // This method returns the index within this string of the first occurrence of the specified substring.
StringBuilder insert(int offset, boolean b): // This method inserts the string representation of the boolean alternate argument into this sequence.
StringBuilder insert(): //  This method inserts the string representation of the char argument into this sequence.
int lastIndexOf(): // This method returns the index within this string of the last occurrence of the specified substring.
int length(): // This method returns the length (character count).
StringBuilder replace(int start, int end, String str): // This method replaces the characters in a substring of this sequence with characters in the specified String.
StringBuilder reverse(): // This method causes this character sequence to be replaced by the reverse of the sequence.
void setCharAt(int index, char ch): // In this method, the character at the specified index is set to ch.
CharSequence subSequence(int start, int end): //  This method returns a new character sequence that is a subsequence of this sequence.
String substring():  // This method returns a new String that contains a subsequence of characters currently contained in this character sequence.
String toString(): // This method returns a string representing the data in this sequence.
void trimToSize(): // This method attempts to reduce storage used for the character sequence. 
