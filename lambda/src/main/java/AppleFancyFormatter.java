public class AppleFancyFormatter implements AppleFormatter{

    @Override
    public void format(Apple apple) {
        String characteristic = apple.getWeight()>150? "Light":"Heavy";
        System.out.println("A "+characteristic+" "+ apple.getColor()+ " apple" );
    }
}
