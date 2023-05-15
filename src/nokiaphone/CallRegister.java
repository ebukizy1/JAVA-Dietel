package nokiaphone;

import java.util.Scanner;

public class CallRegister {
    private static Scanner input = new Scanner(System.in);

    public static void showCallRegister() {
        System.out.println("""
                1: missed calls
                2: received calls
                3: dialled number
                4: erase recent call list 
                5: show call duration
                6: show call cost
                7: call cost settings
                8: prepaid credit
                """);
        callRegister();
    }
    public static String missedCall(){
        return   """
                  1 missed call favor
                 4 missed call favor
                  6 missed call favor
                  """;}
    public static String receivedCall(){
        return      """ 
                   4 in coming call
                  2 in coming call                   
                  """;}
    public static String dialledCall(){
        return """
                6 out going calls
                7 out going calls
                """;}
    public static String eraseCall(){
        return """
                        my favor incoming call 
                        my ex
                        clear call
                        """;}

        public static void callRegister() {
                System.out.println(" call register");
                 int call = input.nextInt();
                 switch (call) {
        case 1 -> {
                System.out.println(missedCall());
                System.out.println(" 1: menu            2:back ");
                int missedCall = input.nextInt();
                switch (missedCall) {
                    case 1 -> MenuBar.showMenuBar();
                    case 2-> showCallRegister();}}

            case 2 -> {
                System.out.println(receivedCall());
                System.out.println(" 1: menu       2: back");
                int incomingCall = input.nextInt();
                switch (incomingCall) {
                    case 1 -> MenuBar.showMenuBar();
                    case 2 -> showCallRegister();}}

            case 3 -> {
                System.out.println(dialledCall());
                System.out.println(" 1:back       2: menu");
                int dialledCall = input.nextInt();
                switch (dialledCall) {
                    case 1 ->showCallRegister();
                    case 2 -> MenuBar.showMenuBar();}}

            case 4 -> {
                System.out.println(eraseCall());
                System.out.println(" 1:back       2: menu");
                int eraseCall = input.nextInt();
                switch (eraseCall) {
                    case 1 ->showCallRegister();
                    case 2 -> MenuBar.showMenuBar();}}

            case 5 -> {
                System.out.println("show call duration");
                System.out.println("""
                        1: last  call duration 
                        2: all calls duration
                        3: received call duration
                        4: dialed calls duration
                        5: clear timers
                        """);

                 int duration = input.nextInt();
                 switch (duration) {
                    case 1 -> {
                        System.out.println("""
                                my love favor
                                2 hours & 10 second  call
                                """);
                        System.out.println(" 1: back           2: menu ");
                        int lastDuration = input.nextInt();
                        switch (lastDuration) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println(" 6 hours & 22 minute");
                        System.out.println(" 1: back           2: menu ");
                        int allCall = input.nextInt();
                        switch (allCall) {
                            case 1 ->showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 3 -> {
                        System.out.println("in coming call 2 minute favor");
                        System.out.println(" 1: back           2: menu ");
                        int receiveCall = input.nextInt();
                        switch (receiveCall) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 4 -> {
                        System.out.println("out going call 3 hours & 2 minute");
                        System.out.println(" 1: back           2: menu ");
                        int dialledCall = input.nextInt();
                        switch (dialledCall) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 5 -> {
                        System.out.println("0;0;0");
                        System.out.println(" 1: back           2: menu ");
                        int eraseCall = input.nextInt();
                        switch (eraseCall) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                  }
                }
     case 6 -> {
                System.out.println("show call cost");
                System.out.println("""
                             1: last call cost
                             2: all calls cost
                             """);
                  int showCost = input.nextInt();
                   switch (showCost) {
                    case 1 -> {
                        System.out.println("400 naira airtime");
                        System.out.println(" 1: back           2: menu ");
                        int lastCall = input.nextInt();
                        switch (lastCall) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println("6000 naira airtime");
                        System.out.println(" 1: back           2: menu ");
                        int allCalls = input.nextInt();
                        switch (allCalls) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }System.out.println(" 1: back           2: menu ");
                    }
                }
            }
            case 7 -> {
                 System.out.println("call cost settings");
                 System.out.println("""
                         1: call cost limit
                         2: show cost in
                        """);
                System.out.println(" 1: back           2: menu ");
                 int callCost = input.nextInt();
                 switch (callCost) {
                    case 1 -> {
                        System.out.println(" 6500 limit of call cost");
                        System.out.println(" 1: back           2: menu ");
                        int allCalls = input.nextInt();
                        switch (allCalls) {
                            case 1-> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 2 -> {
                        System.out.println(" 1500 cost for last call");
                        System.out.println(" 1: back           2: menu ");
                        int allCalls = input.nextInt();
                        switch (allCalls) {
                            case 1 ->showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                    case 8 -> {
                        System.out.println("""
                                airtime balance 20000 bonus balance 10000
                                data balance 8000mb international call 5000 
                                airtime balance""");
                        int prePaidCredit = input.nextInt();
                        System.out.println(" 1: back           2: menu ");
                        switch (prePaidCredit) {
                            case 1 -> showCallRegister();
                            case 2 -> MenuBar.showMenuBar();
                        }
                    }
                }
            }
        }
    }
}