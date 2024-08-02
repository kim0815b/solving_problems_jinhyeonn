import java.util.*;

public class Controller {
    private Scanner sc = new Scanner(System.in);
    private Map<Integer,Problem> problems = new HashMap<>();
    private static int scoreAmount;
    private int[] answerNums;
    public void run() {
        initQuiz();
        for (int i = 0; i < problems.size(); i++) {
            show(i);
            answer(i);
        }
        finish();
    }

    private void initQuiz() {
        problems.put(1,new Problem(1,"Python에서 변수를 선언하는 방법은?", new ArrayList<String>(){"var name", "name = value", "set name", "name == value"},))
    }
    private void show(int num) {
        Problem problem = problems.get(num);
        System.out.println(problem.getQuestion() + "(점수: "+problem.getScore()+"점)");
        String[] example = problem.getExample();
        for (int i = 0; i < example.length; i++) {
            System.out.print((i+1)+") "+example[i] + "\t");
        }
        System.out.println();
    }

    private void answer(int num) {
        Problem problem = problems.get(num);
        System.out.print("정답은 ");
        int answerNum = sc.nextInt();
        answerNums[num] = answerNum;
        if (problem.getCollectAnswer() == answerNum) {
            scoreAmount+= problem.getScore();
        }
    }

    private void finish() {
        System.out.println("----------------- 결과 -----------------");
        System.out.print("응답한 내용 : ");
        for (int i = 0; i < answerNums.length; i++) {
            System.out.print((i+1) + "번 " + answerNums[i] + ",");
        }
        System.out.println();
        System.out.println("당신 응답 합계 : " + scoreAmount + "점");
    }
}
