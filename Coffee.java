class Coffee extends Beverage {
@Override
protected String addIngredients(){
    return "Adding coffee ground";
}
@Override 
protected String addCondiments(){
    return "Adding sugar and milk";
}
@Override 
protected boolean customerWantCondiments(){
    return true;
}
}
    

