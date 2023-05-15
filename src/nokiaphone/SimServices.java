package nokiaphone;

import java.util.Scanner;

public class SimServices {
    private static Scanner input = new Scanner(System.in);

    public static void showSimServices() {
        System.out.println("""
                        This menu is shown only if your SIM
                        card provides additional services. The
                        name and contents of this menu
                        depend on the services available.
                        For availability, rates and information
                        on using the SIM services, contact
                        your SIM card vendor, e.g. network
                        operator, service provider, or other
                        third-party vendor.    
                    
                """);
        System.out.println("""
                 1: back                         2: menu
                """);
        int whatsapp = input.nextInt();
        switch (whatsapp) {
            case 1 ->SimServices.showSimServices();
            case 2 -> MenuBar.showMenuBar();
        }
    }
}
