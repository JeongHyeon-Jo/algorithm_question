class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var nset = mutableSetOf<Int>()
        var temp = n
        
        for(i in 2 .. n) {
            while(temp % i == 0) {
                temp = temp / i
                nset.add(i)
            }
        }
        
        answer = nset.toIntArray()
        
        return answer
    }
}