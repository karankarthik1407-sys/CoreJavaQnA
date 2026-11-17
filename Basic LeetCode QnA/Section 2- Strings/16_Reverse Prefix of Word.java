class Solution {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);

        if (end == -1) return word;

        char[] arr = word.toCharArray();

        int left = 0;
        int right = end;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
