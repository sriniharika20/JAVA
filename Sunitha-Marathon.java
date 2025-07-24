class Main {
    public static void main(String[] args){
        int age =20;
        boolean medical = true;
        if(age>=18 && age<=45 && medical){
            System.out.println("Allowed to participate");
        }
        else if(age<18 || age>45){
            System.out.println("Not Allowed to participate");
        }
        else if(!medical){
            System.out.println("Participate denied");
        }
    }
}