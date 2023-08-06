public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public void format(Apple apple) {
        System.out.println("An apple of " + apple.getWeight() + "g");
    }
}
