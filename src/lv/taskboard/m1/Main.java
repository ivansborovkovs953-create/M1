package lv.taskboard.m1;

/**
 * @Author Ivans Borovkovs
 */
public class Main {
    static final int[][] STUDENT_MARKS = {
            {8, 9, 10, 8},
            {6, 7, 5, 8},
            {4, 5, 6, 7},
            {2, 3, 1, 4}
    };
    static final int HIGH_GRADE = 8;
    static final int LOW_GRADE = 4;

    public static void main(String[] args) {
        for (int i = 0; i < STUDENT_MARKS.length; i++) {
            float averageMark = averageMark(STUDENT_MARKS[i]);
            System.out.println((i + 1) + ".Average Mark: " + averageMark);
            classifyResult(averageMark);
        }
    }

    public static float averageMark(int[] marks) {
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    public static void classifyResult(float averageMark) {
        if (averageMark >= HIGH_GRADE) {
            System.out.println("Excellent");
        } else if (averageMark >= LOW_GRADE) {
            System.out.println("Pass");
        } else {
            System.out.println("Needs improvement");
        }
    }
}