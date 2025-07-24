class Service{
    public static void main(String[] args) {
        int car = 20000;
        if(car>20000){
            System.out.println("Needs Full Service");
        }
        else if(car>=10000){
            System.out.println("Needs Semi-Service");
        }
        else if(car<10000){
            System.out.println("General checkup");
        }
        
    }
}