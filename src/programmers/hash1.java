package programmers;


import java.util.HashMap;

public class hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
            System.out.println(hm);
        }
        System.out.println("-----------------------------------------------");
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
            System.out.println(hm);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        hash1 data = new hash1();
        String[] participant= {"leo","kiki","eden"};
        String[] completion = {"kiki","eden"};
        data.solution(participant,completion );
    }
}