public class TemplateMethodDemo {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();
        System.out.println("Making Coffee:");
        coffee.brew();
        System.out.println(coffee.getStep1());
        System.out.println(coffee.getStep2());
        System.out.println(coffee.getStep3());
        System.out.println(coffee.getStep4());
         
        System.out.println("\nMaking Tea:");
        tea.brew();
        System.out.println(tea.getStep1());
        System.out.println(tea.getStep2());
        System.out.println(tea.getStep3());
        System.out.println(tea.getStep4());
    }
}
