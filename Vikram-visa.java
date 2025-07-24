class Main {
    public static void main(String[] args){
        int age =18;
        boolean passport = false;
        if(age>= 18 && passport){
            System.out.println(" Visa Application is Accepted");
        }
        else if(age>= 18 && (!passport)){
            System.out.println("Appplication is rejected");
        }
        else if(age<18){
            System.out.println("visa not allowed");
        }
    }
}