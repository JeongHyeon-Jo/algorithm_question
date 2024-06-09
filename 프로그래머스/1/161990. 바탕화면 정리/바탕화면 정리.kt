class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var left = Int.MAX_VALUE
        var right = 0
        var up = Int.MAX_VALUE
        var down = 0
        
        for(y in wallpaper.indices){
            for((x, v) in wallpaper[y].withIndex()){
                if(v.toInt() == 35){
                    if(left > x){ left = x }
                    if(right < x) { right = x}
                    if(up > y) { up = y }
                    if(down < y) { down = y }
                }
            }
        }
        down += 1
        right += 1
        
        answer += up
        answer += left 
        answer += down
        answer += right
        
        
        return answer
    }
}