class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = "" 
        var mcount = 0
        var ocount = 0
        var marray = my_string.toCharArray()
        var oarray = overwrite_string.toCharArray()
        
        while(mcount < my_string.length) {
            if(mcount < s){
                answer += marray[mcount]
            } else {
                if(ocount < overwrite_string.length){
                    answer += oarray[ocount]
                } else {
                    answer += marray[mcount]
                }
                ocount++
            }
            mcount++
        }
        
        return answer
    }
}