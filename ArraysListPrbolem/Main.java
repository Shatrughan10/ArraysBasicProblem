package ArraysBasicProblem.ArraysListPrbolem;
import ArraysListProblem1.ArraysListProblem.BasicArraysListProblem;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArraysListProblem1.ArraysListProblem.BasicArraysListProblem s1=new BasicArraysListProblem();
//      This code is for user input.
//        System.out.println("Enter the element: ");
//        List list=new ArrayList();
//        for (int i=0;i<5;i++){
//            list.add(sc.nextInt());
//        }
        List<Integer> list=new<Integer> ArrayList();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(44);
        list.add(8);
        System.out.println(list);
        System.out.println("The sum of the element "+s1.sumOfElement(list));
        System.out.println("the max element is "+s1.findMaxElement(list));
        System.out.println("The reversed list "+s1.reverseList(list));
        System.out.println("the  elment in the list found "+s1.contanElement(list,2));
        System.out.println("The new list is:"+s1.newList(list));
        System.out.println(s1.findIndex(list,2));
        System.out.println("Remove element:"+s1.removeElement(list,8));
//        System.out.println("Remove ALL element:"+s1.removeALL(list));
//        System.out.println("Sort ALL element:"+s1.sortList(list));
        System.out.println("Sort ALL element:"+s1.bubbleSort(list));
        System.out.println("Sort ALL element:"+s1.sortList(list));
        String name[]={"Ram","Shyam","Mohan","Radah","Sita","Gita","Krishana"};
        List<String>list1=new ArrayList<String>();
        list1=Arrays.asList(name);
        System.out.println("Sorted name:"+s1.sortString(list1));
        Integer roll[]={2,5,6,2,5,9,3,2,6,8,6,2,46,2,5,6,2,5,9,56,2,3};
        List<Integer> listroll=Arrays.asList(roll);
        System.out.println("the frequency of 2 in  roll list is : "+s1.frequency(listroll,2));
        List<Integer> roll1=new ArrayList<Integer>();
        roll1.add(2);
        roll1.add(5);
        roll1.add(6);
        roll1.add(1);
        roll1.add(4);
        roll1.add(8);
        roll1.add(6);
        roll1.add(56);
        roll1.add(2);
        System.out.println("The common element in the two list are:"+s1.commonElement(listroll,roll1));
        System.out.println("The sub list of the list is:"+s1.subList(listroll,3,6));

        System.out.println(listroll+"Afer suffling"+s1.shuffleList(listroll));
        //System.out.println(roll1+"List roll1 after replacing 56 by 48"+s1.replaceElement(roll1,56));
        System.out.println("The sub list of the list is:"+s1.subList(listroll,3,6));
        int nu[]={5};
        System.out.println(s1.occerence(nu));
        System.out.println(s1.sum(5,6));
        System.out.println(s1.count(nu));
        System.out.println(s1.isEqual("harshit","harshit"));
        System.out.println(s1.replaceElement(roll1,3,99));
        Integer arr[]={2,6,2,6,9,9,6,3,4,2,5,3,6,1,5,6};
        List<Integer>list2=Arrays.asList(arr);
        System.out.println(s1.removeDuplicate(list2));
        System.out.println(list2 +""+roll1);
//        System.out.println(s1.mergeToList(list2,roll1));
        int arr1[]={2,6,2,6,9,9,6,3,4,2,5,3,6,5,6};
        System.out.println(s1.listOfEven(arr1));
        System.out.println(s1.checkListEqual(list,list2));
        System.out.println(s1.minElement(list2));
        System.out.println(s1.secondElement(list2));
        System.out.println(s1.rotateList(list2,5));

    }
}
