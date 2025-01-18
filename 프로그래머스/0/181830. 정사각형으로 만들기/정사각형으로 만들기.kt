class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var type = if(arr.size > arr[0].size) "column" else "row"
        var gap = if(arr.size > arr[0].size) (arr.size - arr[0].size) else (arr[0].size - arr.size)
        
        when(type) {
            "column" -> {
                for(i in arr.indices) {
                    var row = arr[i]
                    repeat(gap) { row = row.plus(0) }
                    answer = answer.plus(row)
                }
            }
            "row" -> {
                for(i in arr.indices) {
                    var row = arr[i]
                    answer = answer.plus(row)
                }
                repeat(gap) {
                    var row = IntArray(arr[0].size)
                    answer = answer.plus(row)
                }
            }
        }
        
        return answer
    }
}