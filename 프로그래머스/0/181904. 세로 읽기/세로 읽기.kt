class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        var string_arr = ArrayList<ArrayList<String>>()
        var str_index = 0
        var my_arr = my_string.toCharArray()
        
        while(str_index < my_string.length) {
            var row = ArrayList<String>()
            for(j in 0 until m) {
                if(str_index >= my_string.length) { break }
                row.add(my_arr[str_index].toString())
                str_index++
            }
            string_arr.add(row)
        }
        
        for(x in string_arr.indices){
            answer += string_arr[x][c-1]
        }
        
        return answer
    }
}