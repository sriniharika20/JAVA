class Main {
    public static void main(String[] args){
    int usage = 600;
    String plan = "Basic";
     
    if(usage>500 && plan == "Basic"){
        System.out.println("premium");
    }else if(usage>1000 && plan =="Standard"){
        System.out.println("Ultra");
    }
    else{
        System.out.println("Continue same plan");
    }
    }
}