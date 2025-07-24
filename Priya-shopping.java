class Main {
    public static void main(String[] args) {
        int amount = 20000;
        boolean member = true;
        if(amount>=10000 && member){
            int discount = 30;
            System.out.println("Discount:"+discount+"%");
        }
        else if(amount>=5000 && member){
            int discount = 20;
            System.out.println("Discount:"+discount+"%");
        }
        else if(!member){
            int discount =5;
            System.out.println("Discount:"+discount+"%");
        }
        
    }
}