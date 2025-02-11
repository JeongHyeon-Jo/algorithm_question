class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        val id = id_pw[0]
        val pw = id_pw[1]
        
        for(i in db.indices) {
            var db_id = db[i][0]
            var db_pw = db[i][1]
            
            if(id == db_id) {
                if(pw == db_pw) {
                    answer = "login"
                } else {
                    answer = "wrong pw"
                }
            }
        }
        
        if(answer.isEmpty()) { answer = "fail" }
        
        return answer
    }
}