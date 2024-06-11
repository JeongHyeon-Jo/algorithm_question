class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        if(arr.size % 2 == 1){
            arr.forEachIndexed {index, s ->
                if(index % 2 == 0){
                    answer += (s + n)
                } else {
                    answer += s
                }
            }
        } else{
            arr.forEachIndexed {index, s ->
                if(index % 2 == 1){
                    answer += (s + n)
                } else {
                    answer += s
                }
            }
        }
        return answer
    }
}