class Solution {
    fun check_silimit(arr: IntArray): Boolean{
        return if(arr.size >= 1 && arr.size <= 100) true else false
    }
    
    fun check_elelimit(arr: IntArray): Boolean{
        for(i: Int in arr){
            if(i < -10000 || i > 10000 ){
                return false   
            }
        }
        return true
    }
    
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        
        if(check_silimit(arr) && check_elelimit(arr)){
            answer = arr.average()
        }
        
        return answer
    }
}