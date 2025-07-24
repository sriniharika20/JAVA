class  Temperature {
    public static void main(String[] args) {
         int temp=20;
        if(temp>45){
            System.out.println("stay at home");
        }
        else if(temp>=30 && temp>=45){
            System.out.println("Carry water bottle");
        }
        else if(temp<30){
            System.out.println("HE CAN GO");
        }
    }
}