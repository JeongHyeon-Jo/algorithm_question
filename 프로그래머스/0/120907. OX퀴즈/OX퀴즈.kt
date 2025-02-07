class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(q in quiz) {
            val equation = q.split(" = ")
            val eq = equation[0].split(" ")
            var temp = 0
            var op = "+"
            for(e in eq) {
                if(e == "+") {
                    op = "+"
                } else if(e == "-") {
                    op = "-"
                } else {
                    when(op) {
                        "+" -> temp += e.toInt()
                        "-" -> temp -= e.toInt()
                    }
                }
            }
            if(equation[1].toInt() == temp) answer += "O" else answer += "X"
        }
        
        return answer
    }
}