class Main {
    public static void main(String[] args){
        boolean weekend = false;
        boolean VIP=false;
        boolean normal = true;
        boolean weekday = true;
        if(weekend && VIP){
            int price = 500;
            System.out.println("Ticket price:"+price);
        }
        else if(weekend && normal){
            int price = 300;
            System.out.println("ticket price:"+price);
        }
        else if(weekday && VIP){
            int price = 400;
            System.out.println("Ticket price:"+price);
        }
        else if(weekday && normal){
            int price = 200;
            System.out.println("Ticket price:"+price);
        }
    }
}