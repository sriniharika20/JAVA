
class Results {
    public static void main(String[] args) {
        int OR= 46;
        int DM=66;
        int DE=65;
        int DBMS=70;
        int DS=60;
        int marks =46+66+65+70+60;
        int avg = marks/5;
        System.out.println(avg);
            if(OR>=35 && DM>=35 && DE>=35 && DBMS>=35 && DS>=35){
            System.out.println("Passed all Subjects");
                if(avg>=90){
                System.out.println("Outstanding");
                }
                else if(avg>=75){
                    System.out.println("Distinction");
                    
                }
                    else if(avg>=60){
                        System.out.println("First class");
                    }
            }
                     else{
            System.out.println("FAIL");
            }
    }
}