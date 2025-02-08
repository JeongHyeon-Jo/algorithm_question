class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        var pol = polynomial.split(" + ")
        var xv = 0
        var nv = 0
        
        for(p in pol) {
            if(p.contains("x")) {
                if(p == "x") xv += 1
                else { xv += p.replace("x", "").toInt() }
            } else {
                nv += p.toInt()
            }
        }
        
        var xstr = if(xv == 1) "" else xv.toString()
        
        if(xv != 0 && nv != 0) {
            answer = "${xstr}x + ${nv}"
        } else if(xv != 0 && nv == 0) {
            answer = "${xstr}x"
        } else {
            answer = "${nv}"
        }
        
        
        return answer
    }
}