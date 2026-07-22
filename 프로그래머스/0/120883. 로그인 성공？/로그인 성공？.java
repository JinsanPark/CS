class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "login";
        boolean[] check = new boolean[2];

        for(int i = 0; i < db.length; i++){
            
            if(id_pw[0].equals(db[i][0])){
                check[0] = true;
            }
            
            if(id_pw[1].equals(db[i][1]) && id_pw[0].equals(db[i][0])){
                check[1] = true;
                break;
            }
        }
        
        if(!check[0]){
            return "fail";
        } else if(!check[1]){
            return "wrong pw";
        }
        
        return answer;
    }
}