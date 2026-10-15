abstract class Beverage {
    private String step1,step2,step3,step4;
    public final void brew(){
    step1 = boilWater();
    step2 = addIngredients();
    step3 = pourInCup();
    if(customerWantCondiments()){
        step4 = addCondiments();
    }
    }
    public String getStep1(){
        return step1;
    }
    public String getStep2(){
        return step2;
    }
    public String getStep3(){
        return step3;
    }
    public String getStep4(){
        return step4;
    }
    protected abstract String addIngredients();
    protected abstract String addCondiments();

    protected String boilWater(){
        return "Boiling water";
    }
    protected String pourInCup(){
        return "Pouring into cup";
    }
    protected boolean customerWantCondiments(){
        return true;
    }

}

    

