public class MoodAnalyzer {
    public static void main(String[] args) {
        String message;
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyseMood("sad");
    }

        public String analyseMood(String message){
            if (message.contains("Sad")) {
                System.out.println(message);
                return "SAD";
            } else {
                System.out.println(message);
                return "HAPPY";
            }
        }

    }

