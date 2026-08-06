import java.util.*;

record Chart(String genre, Integer count) {}
record Rank(Integer play, Integer index) {}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        List<Chart> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(new Chart(entry.getKey(), entry.getValue()));
        }
        
        list.sort(Comparator.comparing(Chart::count).reversed());
        int idx = 0;
        
        for(Chart chart : list){
            String genre = chart.genre();
            List<Rank> rank = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(genre.equals(genres[i])){
                    rank.add(new Rank(plays[i], i));
                }
            }
            rank.sort(Comparator.comparing(Rank::play).reversed());
            
            int count = 0;
            for(Rank r : rank){
                if(count == 2){
                    break;
                }
                result.add(r.index());
                count++;
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}