public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        MyLambda myLambda = () -> System.out.println("Sorting the array");  //We need a functional interface to make use of lambda

        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        as.sort(myLambda2);

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSort);

        as.sort(() -> System.out.println("Array Sorting"));



    }

    private void sort(Sorting sorting) {

        sorting.sort();
    }
}

@FunctionalInterface
interface MyLambda{
    void print();
}
