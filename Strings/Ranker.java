 public class Ranker {
    public static void main(String[] args) {
        int marks[] = {78, 92, 85, 60}; 
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (marks[i] < marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        System.out.println("Marks: 78, 92, 85, 60");
        System.out.println("Third ranker marks = " + marks[2]);
    }
}
