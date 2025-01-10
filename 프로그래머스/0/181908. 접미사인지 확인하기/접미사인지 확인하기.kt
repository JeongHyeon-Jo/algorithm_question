class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var i = 0
        var max_i = my_string.length - 1
        var suffix_array = emptyArray<String>()
        
        while(i <= max_i){
            suffix_array += my_string.substring(i..max_i)
            i++
        }
        
        return if(suffix_array.contains(is_suffix)) 1 else 0
    }
}