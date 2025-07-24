class Main {
    public static void main(String[] args){
        int distance = 120;
        boolean weekday = true;
        boolean weekend = false;
        if(distance<50){
            int fare =50;
            System.out.println(fare);
        }
        else if(distance>=50 && distance<=100){
            int fare = 100;
            System.out.println(fare);
        }
        else if(distance>100 && weekday){
            int fare = 200;
            System.out.println(fare);
        }
        else if(distance>100 && weekend){
            int fare = 300;
            System.out.println(fare);
        }
    }
}