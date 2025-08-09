import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Room {
    int roomNumber;
    String type;
    String category;
    String facility;
    double price;
    boolean Booked;
    String checkedOut;

    public Room(int roomNumber, String type, String category, String facility, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.category = category;
        this.facility = facility;
        this.price = price;
        this.Booked = false;
        this.checkedOut = "";
    }
}

class Customer {
    String name;
    Long mobile;
    int idproof;

    public Customer(String name, Long mobile, int idproof) {
        this.name = name;
        this.mobile = mobile;
        this.idproof = idproof;
    }
}

public class HotalBookingproject {
    static Scanner sc = new Scanner(System.in);
    static Room[] rooms = new Room[5];
    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        initRooms();
        while (true) {
            System.out.println("\n--- Room Booking System ---");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    customerLogin();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void initRooms() {
        rooms[0] = new Room(101, "Single", "AC", "TV, WiFi", 1200);
        rooms[1] = new Room(102, "Double", "AC", "TV, WiFi, Fridge", 1800);
        rooms[2] = new Room(103, "Single", "General", "Fan", 800);
        rooms[3] = new Room(104, "Double", "General", "Fan, TV", 1400);
        rooms[4] = new Room(105, "Single", "AC", "TV, WiFi, Fan", 1300);
    }

    static void adminLogin() {
        System.out.print("Enter Admin Id cord: ");
        int id = sc.nextInt();
        if (id != 234567890) {
            System.out.println("Incorrect id.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- Admin Panel ---");
            System.out.println("1. Rooms Available");
            System.out.println("2. Number of Bookings");
            System.out.println("3. Customer Details");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (Room r : rooms)
                        if (!r.Booked)
                            System.out.println("Room " + r.roomNumber + " - " + r.type + " " + r.category);
                    break;

                case 2:
                    int count = 0;
                    for (Room r : rooms)
                        if (r.Booked) count++;
                    System.out.println("Total bookings: " + count);
                    break;

                case 3:
                    for (Room r : rooms)
                        if (r.Booked)
                            System.out.println("Room " + r.roomNumber + " booked by " + r.checkedOut);
                    break;

                case 4:
                    System.out.print("Enter room number to cancel: ");
                    int rn = sc.nextInt();
                    sc.nextLine();
                    for (Room r : rooms) {
                        if (r.roomNumber == rn && r.Booked) {
                            r.Booked = false;
                            r.checkedOut = "";
                            System.out.println("Booking cancelled for Room " + rn);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Admin logged out.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void customerLogin() {
        System.out.println("\n1. Register");
        System.out.println("2. Login");
        System.out.print("Choose option: ");
        int opt = sc.nextInt();
        sc.nextLine();

        String name = "Sumi";
        long mobile = 987654321L;
        int ids = 12345;

        if (opt == 1) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter mobile number: ");
            mobile = sc.nextLong();
            sc.nextLine();
            System.out.print("Set ID proof number: ");
            ids = sc.nextInt();
            sc.nextLine();

            customers.add(new Customer(name, mobile, ids));
            System.out.println("Registration successful. Please login again.");
            return;
        } else if (opt == 2) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter ID proof number: ");
            ids = sc.nextInt();
            sc.nextLine();
        }

        boolean authenticated = false;
        for (Customer c : customers) {
            if (c.name.trim().equalsIgnoreCase(name.trim()) && c.idproof == ids) {
                authenticated = true;
                break;
            }
        }

        if (authenticated) {
            System.out.println("Login Successfully.");
        } else {
            System.out.println("Invalid Login....Please try again");
            return;
        }int choice;
        do {
            System.out.println("\n--- Customer Panel ---");
            System.out.println("1. View Room Types");
            System.out.println("2. View Facilities");
            System.out.println("3. View Price");
            System.out.println("4. Book Room");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (Room r : rooms)
                        System.out.println("Room " + r.roomNumber + ": " + r.type + " - " + r.category);
                    break;

                case 2:
                    for (Room r : rooms)
                        System.out.println("Room " + r.roomNumber + ": " + r.facility);
                    break;

                case 3:
                    for (Room r : rooms)
                        System.out.println("Room " + r.roomNumber + ": ₹" + r.price);
                    break;

                case 4:
                    System.out.print("Enter room number to book: ");
                    int rn = sc.nextInt();
                    sc.nextLine();
                    for (Room r : rooms) {
                        if (r.roomNumber == rn) {
                            if (r.Booked) {
                                System.out.println("Room is already booked, Please select another room.");
                            } else {
                                r.Booked = true;
                                r.checkedOut = name;
                                System.out.println("Room " + rn + " booked successfully.");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Logged out.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
