public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble Sorting");
        as.sort(bubbleSort);

        as.sort(() -> System.out.println("Bubble Sorting")); // We can directly pass lambda instead of instance of interface




    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}


