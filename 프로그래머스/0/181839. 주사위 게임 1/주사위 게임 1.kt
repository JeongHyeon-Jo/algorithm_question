import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int = 
        if(a % 2 == 0 && b % 2 == 0) {
            abs(a - b).toInt()
        } else if(a % 2 != 0 && b % 2 != 0) {
            (a * a) + (b * b)
        } else {
            2 * (a + b)
        }
}