class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var isprefix = false
        var i = 0
        
        while(i < my_string.length - 1){
            if(!isprefix) {
                if(my_string.substring(0..i) == is_prefix) {
                    isprefix = true
                }
            } else {
                break
            }
            i++
        }
        
        return if(isprefix) 1 else 0
    }
}