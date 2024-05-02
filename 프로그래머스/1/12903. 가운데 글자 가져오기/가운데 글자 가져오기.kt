class Solution {
    fun solution(s: String): String {
        var answer = ""
        var arr = s.toCharArray()
        var mid1 = ""
        var mid2 = ""
        
        if(arr.size % 2 == 0){
            mid1 = arr[arr.size / 2 - 1].toString()
            mid2 = arr[arr.size / 2].toString()
            answer = mid1 + mid2
        } else {
            answer = arr[arr.size / 2].toString()
        }
        
        return answer
    }
}