class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for((i, v) in str_list.withIndex()) {
            if(v == "l") {
                if(i != 0) {
                    answer = str_list.slice(0..i-1).toTypedArray()
                }
                break
            } else if(v == "r") {
                if(i != str_list.size - 1) {
                    answer = str_list.slice(i+1..str_list.size - 1).toTypedArray()
                }
                break
            }
        }
        return answer
    }
}