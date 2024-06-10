import kotlin.math.sqrt

class Solution {
    fun ness_brown(width: Int, height: Int): Int = 2 * width + 2 * (height - 2)
    
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var bwid = 3; var bhei = 3
        var ywid = 0; var yhei = 1
        var max = 0; var mwid: Int = 0; var mhei: Int = 0
        var ysqrt: Int = sqrt(yellow.toDouble()).toInt()
        
        while(true){
            if(yhei > ysqrt){ break }
            ywid = yellow / yhei
            bwid = ywid + 2
            bhei = yhei + 2
            if(ness_brown(bwid, bhei) <= brown){
                if(ywid * yhei > max){
                    max = ywid * yhei
                    mwid = bwid
                    mhei = bhei
                }
            }
            yhei++
        }
        answer += mwid
        answer += mhei
        
        return answer
    }
}