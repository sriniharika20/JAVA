class Insurance{
    public static void main(String[] args) {
        int amount = 5000;
        int age = 44;
        if(age>60){
            // int premium = amount;
            System.out.println("premium is"+" "+amount);
        }
            if(age>=40 && age<=60){
                int premium = amount-2000;
                System.out.println("premium is"+" "+premium);
            }
            else if(age>=20 && age<=39){
                int premium = amount- 3500;
                System.out.println("premium is"+" "+premium);
            }
            else if(age<20){
                int premium = amount-4000;
                System.out.println("premium is"+" "+premium);
            }
        
       
    }
}