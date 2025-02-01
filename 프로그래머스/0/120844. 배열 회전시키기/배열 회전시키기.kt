class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()
        var filt: IntArray = intArrayOf()
        
        when(direction) {
            "right" -> {
                answer += numbers[numbers.size - 1]
                filt = numbers.filterIndexed{ i, v ->
                    i != numbers.size - 1
                }.toIntArray()
                for(f in filt) {
                    answer += f
                }
            }
            "left" -> {
                filt = numbers.filterIndexed{ i, v ->
                    i != 0
                }.toIntArray()
                for(f in filt) {
                    answer += f
                }
                answer += numbers[0]
            }
        }
        
        return answer
    }
}