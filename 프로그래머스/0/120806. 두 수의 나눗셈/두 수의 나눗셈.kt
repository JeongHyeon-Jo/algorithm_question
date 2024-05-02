class Solution {
    fun limit(num: Int): Boolean {
        var permission: Boolean = true

        if(num <= 0 || num > 100) { permission = false }
        return permission
    }

    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0

        val fnum1: Float = num1.toFloat()
        val fnum2: Float = num2.toFloat()

        var fanswer: Float = (fnum1 / fnum2) * 1000
        if(limit(num1) && limit(num2))
           answer = fanswer.toInt()


        return answer
    }
}