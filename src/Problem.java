import java.util.ArrayList;

public class Problem {
    private static final String[] questions = { "Python에서 변수를 선언하는 방법은?",
            "Python에서 리스트(List)의 특징은 무엇인가요?",
            "Python에서 조건문을 작성하는 방법은?",
            "Python에서 함수를 정의하는 방법은?"
    };
    private static final String[][] examples = { {"var name","name = value","set name","name == value"},
            {"순서가 있고 변경 가능하다,","중복된 값을 가질 수 없다","원소를 추가하거나 삭제할 수 없다,","정렬된" + "상태로 유지된다"},
            {"if-else,","for-in,","while,","def"},
            {"class,","def,","import,","return"}
    };
    private static final int[] scores = {10, 15, 10, 5};
    private static final int[] collectAnswers = {1,2,3,4};
    private int id;
    private String question;
    private ArrayList<String> example;
    private int score;
    private int collectAnswer;

    public Problem(int id, String question, ArrayList<String> example, int score, int collectAnswer) {
        this.id = id;
        this.question = question;
        this.example = example;
        this.score = score;
        this.collectAnswer = collectAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getExample() {
        return example;
    }

    public void setExample(ArrayList<String> example) {
        this.example = example;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCollectAnswer() {
        return collectAnswer;
    }

    public void setCollectAnswer(int collectAnswer) {
        this.collectAnswer = collectAnswer;
    }
}
