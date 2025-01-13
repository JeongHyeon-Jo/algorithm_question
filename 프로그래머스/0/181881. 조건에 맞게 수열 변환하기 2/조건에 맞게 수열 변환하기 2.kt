class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var x = 0
        var isChange = false
        
        while(true){
            for((i, a) in arr.withIndex()) {
                if(a >= 50 && a % 2 == 0) {
                    arr[i] = a / 2
                    isChange = true
                } else if (a < 50 && a % 2 != 0) {
                    arr[i] = a * 2 + 1
                    isChange = true
                }
            }
            
            if(isChange) {
                isChange = false
            } else {
                answer = x
                break
            }
            
            x++
        }
        
        return answer
    }
}