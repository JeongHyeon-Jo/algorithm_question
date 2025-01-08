class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        
        when{            
            // 모두 다를 때
            a != b && b != c && c != a -> {
                answer = a + b + c
            }
            // 두 숫자만 같을 때
            (a != b && b == c) ||
            (a != b && b != c && c == a) ||
            (a == b && b != c) -> {
                answer = (a + b + c) * (a * a + b * b + c * c)
            }
            // 모두 같을 때
            a == b && b == c -> {
                answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
            }
        }
        
        return answer
    }
}