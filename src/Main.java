import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int isPresent = 0;
        int isAbsent = 1;
        int checkAttendance = (int)((Math.random()*10)%2);
        if (checkAttendance==isPresent){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}