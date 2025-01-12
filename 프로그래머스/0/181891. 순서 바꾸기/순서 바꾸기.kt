class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var head = num_list.slice(0..n-1).toIntArray()
        var tail = if(num_list.size == n) intArrayOf() else num_list.slice(n..num_list.size - 1).toIntArray()

        answer = tail + head
        
        return answer
    }
}