package ArraysBasicProblem.ArraysListPrbolem;
import java.util.*;
public class BasicArraysListProblem {
//    2: Sum of All Elements
    public int sumOfElement(List<Integer> list){
        int sum=0;
        if(list.isEmpty()){
            return 0;
        }
        if(list.size()==1){
            return list.get(0);
        }
        for(int i:list){
            sum+=i;

        }
        return sum;
    }
//    2. Find Maximum Element
    public int findMaxElement(List<Integer> list){
//        Collections.sort(list);
//        return list.get(list.size()-1);
        int max=0;
        for (int i:list){
            if(max<=i){
                max=i;
            }
        }
        return max;
    }
//    4: Reverse a List
    public List<Integer> reverseList(List<Integer> list){
//        List<Integer>li=list.reversed();
//        return li;
        int temp=0;
        Integer arr[]= list.toArray(new Integer[0]);
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        List list1=Arrays.asList(arr);
        return list1;
    }
//    5.Check if a List Contains a Value
    public boolean contanElement(List<Integer> list,int target){
//       ` for(int a:list){
//            if(a== target){
//                return true;
//            }
//        }
//        return false;
        if(list.contains(target)){
        return true;
        }
        return false;
    }
//    6.Add all elements of one list to another list.

    public List<Integer> newList(List<Integer> list){
        List <Integer> newlist=new ArrayList<Integer>();
        for(int a:list){
            newlist.add(a);
        }
        return list;
    }
//    7.Find the index of a specific element in a list.
    public int findIndex(List<Integer>list,int target){
        int index=0;
        for(int a:list){
            if(a==target){
                index= list.indexOf(a);
            }
        }
        return index;
    }
//   8. Remove a specific element from a list.
    public List<Integer> removeElement(List<Integer> list, int target){
        int index=0;
        for(int i:list){
            if(i==target){
               index= list.indexOf(i);
            }
        }
        list.remove(index);
        return list;
    }
//  9.  Remove all elements from a list
    public List<Integer> removeALL(List<Integer> list){
        list.clear();
        return list;

    }
//  10.  Check if a list is empty.
    public boolean checkListEmpty(List<Integer> list){
        if(list.size()==0){
            return true;
        }
        return false;
    }
//   11. Sort a list of integers in ascending order.
    public List<Integer> sortList(List<Integer> list){
//        Collections.sort(list);
//        return list;
        boolean swapped;
       for(int i=0;i< list.size()-1;i++){
           swapped=false;
           for(int j=0;j<list.size()-1-i;j++){
               if(list.get(i)>list.get(j+1)){
                   int temp=list.get(i);
                   list.set(i,list.get(j+1));
                   list.set(j+1,temp);
                   swapped=true;
               }
           }
           if(!swapped)break;
       }
        return list;
    }
    public  List<Integer> bubbleSort(List<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the list is sorted
            if (!swapped) break;
        }
        return list;
    }
//    12.Sort a list of strings in alphabetical order.
    public List<String> sortString(List<String> list){
        for (int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    String temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
//   13. Find the frequency of a specific element in a list.
    public int frequency(List<Integer>list,int target){
//        int count=0;
//        for(int i=0;i<list.size()-1;i++){
//
//                if(list.get(i)==target){
//                    count+=1;
//                }
//            }
//
//        return count;
//          Using for each loop;
        int count=0;
        for(int i:list){
            if(i==target)count++;
        }
        return count;
    }
//  14.  Find the common elements between two lists.
    public List<Integer> commonElement(List<Integer> list1,List<Integer>list2){
        HashSet<Integer>common=new HashSet<Integer>();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j)){
                    common.add(list1.get(i));
                }
            }
        }
        return common.stream().toList();
    }
//    15.Create a sublist from a list.
    public List<Integer> subList(List<Integer> list,int start,int end){
        List <Integer> sublist=new ArrayList<Integer>();
        for (int i=start;i<end;i++){
            sublist.add(list.get(i));
        }
        return sublist;
//        return list.subList(2,3); built-in method for sub list.
    }
//    16.Shuffle elements in a list.
    public List<Integer> shuffleList(List<Integer> list){
        Random random=new Random();
        int n= list.size();
        for (int i=n-1;i>=0;i--){
            int j=random.nextInt(i+1);
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        return list;
    }
//  17.  Replace an element at a specific index.
    public List<Integer> replaceElement(List<Integer> list,int index,int value){
        for(int i=0;i<list.size()-1;i++) {
            if(i==index){
                list.set(i,value);
            }
        }
        return list;
    }
// 18.Remove duplicate elements from a list.
    public List<Integer> removeDuplicate(List<Integer>list){
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        List<Integer> newlist=set.stream().toList();
        return newlist;
    }
//  19.  Merge two lists into one
public List<Integer> mergeToList(List<Integer> list1, List<Integer> list2) {
    for (int i = 0; i < list2.size(); i++) {
        int num=list2.get(i);
        list1.add(num);
    }
    return list1;
}
//20.create a list of even numbers from an array.
    public List<Integer> listOfEven(int arr[]){
        List<Integer>even=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
        }
        return even;
    }
//    21.Check if two lists are equal.
    public boolean checkListEqual(List<Integer> list1,List<Integer> list2){
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
//   22. Find the minimum element in a list.
    public int minElement(List<Integer>list){
        int a=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<= a){
                a=list.get(i);
            }
        }
        return a;
    }
//    23.Find the second largest element in a list.
    public int secondElement(List<Integer>list){
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>= max){
                max=list.get(i);
            }
        }
        int secondMax=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=secondMax && list.get(i) < max){
                secondMax=list.get(i);
            }

        }
        return secondMax;
    }
//    24.Rotate elements in a list by n positions.
    public  List<Integer> rotateList(List<Integer> list, int n) {
        int size = list.size();

        // Handle case where n is larger than the list size or negative
        n = n % size;
        if (n < 0) {
            n += size;
        }

        // Rotate the list by n positions
        List<Integer> rotatedList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            rotatedList.add(list.get((i + size - n) % size));
        }
        return rotatedList;
    }
    public int occerence(int arr[]){

        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }

        int secondMax=arr[0];
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                flag=true;
            }
        }
        int count=0;
        if(flag=true){
            for(int i=0;i<arr.length-1;i++){

                if(arr[i]>=secondMax && arr[i]<max){
                    secondMax=arr[i];
                }
            }


        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==secondMax){
                count++;
            }
        }
        return count;
        }
        return count;
    }
    public int sum(int num1,int num2){
        int sum=add(num1,num2);
        return sum;
    }
    public int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public int count(int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        int secondMax=0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondMax = arr[i];
                break;
            }
        }
        count = occer(arr,secondMax);
        return count;
    }
    public int occer(int arr[], int secondmax){
        int count=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==secondmax){
                    count++;
                }
            }
        return count;

    }
    public boolean isEqual(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
