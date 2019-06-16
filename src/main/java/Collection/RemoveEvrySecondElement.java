package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveEvrySecondElement {

    public static void main(String[] args) {
         List<Integer> arrayListOfNumberPeople = new ArrayList<>();
         List<Integer> linkedListOfNumberPeople = new LinkedList<>();

        for (int i = 1; i <= 7; i++) {
            arrayListOfNumberPeople.add(i);
        }
        linkedListOfNumberPeople.addAll(arrayListOfNumberPeople);

        removeEvrySecondElement(arrayListOfNumberPeople);
        removeEvrySecondElement(linkedListOfNumberPeople);

        System.out.println(arrayListOfNumberPeople);
        System.out.println(linkedListOfNumberPeople);
    }

//    1.   В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый второй человек,
//    пока не останется один. Составить две программы,  моделирующие процесс.
//    Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.

    public static List<Integer> removeEvrySecondElement(List<Integer> listForRemoveEvrySecondElement) {
        int counterForRemoveEvrySecondElement = 1;
        while (listForRemoveEvrySecondElement.size() > 1) {
            for (int i = 0; i < listForRemoveEvrySecondElement.size(); i++) {
                if (counterForRemoveEvrySecondElement % 2 == 0) {
                    listForRemoveEvrySecondElement.remove(i);
                    i--;
                }
                counterForRemoveEvrySecondElement++;
            }
        }
        return listForRemoveEvrySecondElement;
    }


}
