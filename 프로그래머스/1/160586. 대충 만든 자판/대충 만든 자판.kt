class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var temp = 0
        var min = 100
        var sum = 0
        var cnt = 0
        var nope: Boolean = false 
        
        for(t in targets) {
            t.forEach{ tv ->
                for(kv in keymap){
                    temp = kv.indexOf(tv) + 1
                    if(temp == 0) { cnt++; continue }
                    if(min > temp){ min = temp }
                }
                if(cnt == keymap.size) { nope = true }
                sum += min
                min = 100
                cnt = 0
            }
            if(nope){
                answer += -1
            } else {
                answer += sum   
            }
            sum = 0
            nope = false
        }
        
        return answer
    }
}