package com.company;

public class overloadedMethods {

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5};
        Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character [] charArray = {'A','B','C','D','E'};

        System.out.println("Integer Array contains: ");
        printArray(intArray);
        System.out.println("Double Array contains: ");
        printArray(doubleArray);
        System.out.println("Character Array contains: ");
        printArray(charArray);


    }
       public static void printArray(Integer [] intArray)
        {
            for(Integer element : intArray)
            {
                System.out.print(" "+element);
            }
            System.out.println("\n");
        }
        public static void printArray(Double [] doubleArray)
        {
            for(Double element : doubleArray)
            {
                System.out.print(" "+element);
            }
            System.out.println("\n");
        }

        public static void printArray(Character [] charArray)
        {
            for(Character element : charArray)
            {
                System.out.print(" "+element);
            }
            System.out.println("\n");
        }
    }
