class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var snow = s
        var temp = ""
        var zero = 0
        var count = 0
        
        while(snow != "1"){
            temp = snow.replace("0", "")
            zero += snow.length - temp.length
            snow = temp.length.toString(2)
            count++
        }
        
        answer += count; answer += zero
        
        return answer
    }
}