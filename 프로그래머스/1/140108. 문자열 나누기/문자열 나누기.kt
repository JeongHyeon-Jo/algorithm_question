class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var sarr = s.toCharArray()
        var starr = arrayOf<String>()
        var str = ""
        var xcnt = 0
        var ecnt = 0
        var x = ""
        
        for((i, t) in sarr.withIndex()){
            var st = t.toString()
            if(i == sarr.size -1){
                starr += str
                continue
            }
            
            if(xcnt == 0) {
                x = st
                xcnt++
                str += st
                continue
            }
            
            if(x == st) {
                xcnt++
                str += st
            } else {
                ecnt++
                str += st
            }
            
            if(xcnt == ecnt) {
                xcnt = 0
                ecnt = 0
                starr += str
                str = ""
            }
        }
        
        answer = starr.size
        
        return answer
    }
}