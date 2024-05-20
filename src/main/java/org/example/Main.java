package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock<0 || clock>23){
            return false;
        }
        return isBarking && (clock >= 20 || clock < 8);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (13<=firstAge && firstAge<=19) || (13<=secondAge && secondAge<=19) || (13<=thirdAge && thirdAge<=19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return 25<=temp && temp<=45;
        } else {
            return 25<=temp && temp<=35;
        }
    }

    public static double area(double width, double height) {
        if(width<0 || height<0){
            return -1;
        }else{
            return width*height;
        }

    }
    public static double area(double radius) {
        if(radius<0){
            return -1;
        }else {
            return radius*radius*Math.PI;
        }
    }
}
