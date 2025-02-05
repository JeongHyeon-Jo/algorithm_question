class Solution {
    fun solution(order: Int): Int = order.toString().map{ it.toString().toInt() }.count{ it != 0 && it % 3 == 0 }
}