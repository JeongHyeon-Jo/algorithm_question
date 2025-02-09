class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        var bset = mutableSetOf<String>()
        var size = 0
        
        for(i in 0 until board.size) {
            for(j in 0 until board[i].size) {
                size = board.size * board[i].size
                if(board[i][j] == 1) {
                    var ip = i + 1
                    var im = i - 1
                    var jp = j + 1
                    var jm = j - 1
                    bset.add("${i}${j}")
                    if(im >= 0) {
                        if(board[im][j] == 0) {
                            bset.add("${im}${j}")
                        }
                    }
                    
                    if(ip < board.size) {
                        if(board[ip][j] == 0) {
                            bset.add("${ip}${j}")
                        }
                    }
                    
                    if(jm >= 0) {
                        if(board[i][jm] == 0) {
                            bset.add("${i}${jm}")
                        }
                        if(im >= 0) {
                            if(board[im][jm] == 0) {
                                bset.add("${im}${jm}")
                            }
                        }

                        if(ip < board.size) {
                            if(board[ip][jm] == 0) {
                                bset.add("${ip}${jm}")
                            }
                        }
                    }
                    
                    if(jp < board[j].size) {
                        if(board[i][jp] == 0) {
                            bset.add("${i}${jp}")
                        }
                        if(im >= 0) {
                            if(board[im][jp] == 0) {
                                bset.add("${im}${jp}")
                            }
                        }

                        if(ip < board.size) {
                            if(board[ip][jp] == 0) {
                                bset.add("${ip}${jp}")
                            }
                        }
                    }
                }
            }
        }
        
        answer = size - bset.size
        
        return answer
    }
}