class Solution {
    fun solution(arr: IntArray): IntArray {
        for((i, a) in arr.withIndex()) {
            if(a >= 50 && a % 2 == 0) {
                arr[i] = a / 2
            } else if (a < 50 && a % 2 != 0) {
                arr[i] = a * 2
            }
        }
        
        return arr
    }
}