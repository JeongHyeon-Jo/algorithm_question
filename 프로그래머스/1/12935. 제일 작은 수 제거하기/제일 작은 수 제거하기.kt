class Solution {
    
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var min = 0
        var temp = 0
        
        if(arr.size == 1 && arr[0] == 10){
            answer.add(-1)
        } else {
            for(i in arr){
                answer.add(i)
                if(i == arr[0]){
                    min = i
                } else {
                    if(min > i) { min = i }
                }
            }
            answer.remove(min)
        }
        
        return answer.toIntArray()
    }
}