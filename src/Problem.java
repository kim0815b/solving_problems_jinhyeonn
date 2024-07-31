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
    private String question;
    private String[] example;
    private int score;
    private int collectAnswer;

    public Problem(int questionNum) {
        this.question = questions[questionNum];
        this.example = examples[questionNum];
        this.score = scores[questionNum];
        this.collectAnswer = collectAnswers[questionNum];
    }

    public String getQuestion() {
        return question;
    }

    public String[] getExample() {
        return example;
    }

    public int getScore() {
        return score;
    }

    public int getCollectAnswer() {
        return collectAnswer;
    }
}
