import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordering ordering = new Ordering();
        List<Integer> listNumber = new ArrayList<>();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        for(int i = 0 ; i < size; i++ ){
            System.out.println("Enter number : " + (i+1));
            listNumber.add(scanner.nextInt());
        }

        boolean play = true;

        while (play){
            System.out.println("--- menu ---");
            System.out.println("1) Growing \n2) Decreasing \n3) Original \n4) Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            switch (option){
                case 1 :
                    System.out.println("----- Number collection  Growing ---- ");
                    ordering.growing(listNumber).forEach(System.out::println);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("----- Number collection  Decreasing ---- ");
                    ordering.decreasing(listNumber).forEach(System.out::println);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("----- Number collection Original ---- ");
                    listNumber.forEach(System.out::println);
                    scanner.nextLine();
                    break;
                case 4:
                    play =false;
                    break;
                default:
                    System.out.println("Error option");

            }
            System.out.print("Enter key for return: ");
            scanner.nextLine();
        }

    }


    List<Integer>  growing (List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if(list.get(i) < list.get(j) ){
                    int tem = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,tem);
                }
            }

        }
        return  list;
    }

    List<Integer>  decreasing  (List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (list.get(i) > list.get(j)){
                    int tem = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tem);
                }
            }
        }

        return  list;
    }

}
