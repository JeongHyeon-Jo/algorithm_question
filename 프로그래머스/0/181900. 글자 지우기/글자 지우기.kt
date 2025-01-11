class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        var desc_arr = indices.sortedArrayDescending()
        var str_list = my_string.toCharArray().toMutableList()
        
        for(d in desc_arr) {
            str_list.removeAt(d)
        }
        
        answer = str_list.joinToString("")
        
        return answer
    }
}