class Solution {
    fun limit(num: Int): Boolean {
        var permission: Boolean = true

        if(num < 0 || num > 10000) { permission = false }

        return permission
    }
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0

        if(limit(num1) && limit(num2))
        {
          if(num1 == num2)
              answer = 1
          else
              answer = -1
        }
        return answer
    }
}