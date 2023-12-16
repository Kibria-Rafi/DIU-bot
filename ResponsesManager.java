import java.util.HashMap;
import java.util.Map;

class ResponsesManager {
    private Map<String, String> responses = new HashMap<>();

    public ResponsesManager() {
        initializeResponses();
    }

    private void initializeResponses() {
        // Add your keyword-response pairs here
        responses.put("hi", "hi! I am diu bot from daffodil.");
        responses.put("how are you", "I'm Good :). Thank you for asking");
        responses.put("what is your name", "I'm bot,study in diu");
        responses.put("gender", "I'm Female. Don't Try to Flirt with me\nyou Fell in love :)");
        responses.put("love you", "I'm Feeling Shy 🙂 Love you too");
        responses.put("bye", "Too Soon 🙁 Anyways\nSTAY HOME STAY SAFE");
        responses.put("class Teacher", "Wahida ferdousi");
        responses.put("oop lab techer name", "Wahida ferdousi");
        responses.put("oop teacher er nam ki", "Wahida ferdousi");
        responses.put("hello", "hi! I am diu bot from daffodil.");
        responses.put("i want to know about daffodil university", "Daffodil university is a number one private university in bangladesh");
        responses.put("daffodil", "Daffodil university is a number one private university in bangladesh");
        responses.put("total department", "19");
        responses.put("cse total cost", "8.75 lakh");
        responses.put("bba total cost", "6.75 lakh");
        responses.put("eee total cost", "7.75 lakh");
        responses.put("civil total cost", "6.8 lakh");
        responses.put("textile total cost", "5.75 lakh");
        responses.put("nfe total cost", "5.00 lakh");
        responses.put("pharmacy total cost", "9.00 lakh");
        responses.put("software total cost", "8.00 lakh");
        responses.put("i want to know about tuition fees", "ok ask me");
        responses.put("cr name", "sazzad and mimi,sazzad cr, and mimi co cr");
        responses.put("hall cost", "per semester 18k(no hidden charge)");
        responses.put("gym cost", "1k tk per mount");
        responses.put("location", "Dattapara,birulia,savar,Dhaka");
        responses.put("team member", "Kibria,Sunbir,Esmita");


        
        // Add more responses as needed
    }

    public String getResponse(String keyword) {
        return responses.getOrDefault(keyword, "I Can't Understand");
    }
}