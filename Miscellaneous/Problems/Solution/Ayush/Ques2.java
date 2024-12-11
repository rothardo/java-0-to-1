import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time of day (0-23) ");
        int timeOfDay = input.nextInt();
        System.out.println("Enter traffic density (low, medium, high) ");
        String td = input.next();
        System.out.println("Is there any emergency vehicle present? (true/false) ");
        boolean emergencyveh = input.nextBoolean();
        System.out.println("Is there a pedestrian crossing request? (true/false) ");
        boolean pc = input.nextBoolean();
        System.out.println("Enter the intersection (A, B, C, D) ");
        String intersection = input.next();

        if (intersection.equals("A")) {
            if (emergencyveh) {
                System.out.println("Intersection A: Green light for emergency vehicle");
            } else {
                if (timeOfDay >= 7 && timeOfDay <= 9) {
                    if (td.equals("high")) {
                        System.out.println("Intersection A: Longer green light for main road");
                    } else {
                        System.out.println("Intersection A: Standard timing for all directions");
                    }
                } else if (timeOfDay >= 17 && timeOfDay <= 19) {
                    if (td.equals("high")) {
                        System.out.println("Intersection A: Longer green light for main road");
                    } else {
                        System.out.println("Intersection A: Standard timing for all directions");
                    }
                } else {
                    System.out.println("Intersection A: Standard timing for all directions");
                }

                if (pc) {
                    System.out.println("Intersection A: Pedestrian crossing light activated");
                }
            }
        } else if (intersection.equals("B")) {
            if (emergencyveh) {
                System.out.println("Intersection B: Green light for emergency vehicle.");
            } else {
                if (td.equals("high")) {
                    System.out.println("Intersection B: Longer green light for main road.");
                } else {
                    System.out.println("Intersection B: Standard timing for all directions.");
                }

                if (pc) {
                    System.out.println("Intersection B: Pedestrian crossing light activated.");
                }
            }
        } else if (intersection.equals("C")) {
            if (emergencyveh) {
                System.out.println("Intersection C: Green light for emergency vehicle.");
            } else {
                if (timeOfDay >= 10 && timeOfDay <= 15) {
                    if (td.equals("low")) {
                        System.out.println("Intersection C: Shorter green light for main road.");
                    } else {
                        System.out.println("Intersection C: Standard timing for all directions.");
                    }
                } else {
                    System.out.println("Intersection C: Standard timing for all directions.");
                }

                if (pc) {
                    System.out.println("Intersection C: Pedestrian crossing light activated.");
                }
            }
        } else if (intersection.equals("D")) {
            if (emergencyveh) {
                System.out.println("Intersection D: Green light for emergency vehicle.");
            } else {
                switch (td) {
                    case "low":
                        System.out.println("Intersection D: Shorter green light for all directions.");
                        break;
                    case "medium":
                        System.out.println("Intersection D: Standard timing for all directions.");
                        break;
                    case "high":
                        System.out.println("Intersection D: Longer green light for main road.");
                        break;
                }

                if (pc) {
                    System.out.println("Intersection D: Pedestrian crossing light activated.");
                }
            }
        } else {
            System.out.println("Invalid intersection.");
        }
        if (intersection.equals("A") || intersection.equals("B")) {
            System.out.println("Left turn signal active");
        } else if (intersection.equals("C") || intersection.equals("D")) {
            System.out.println("Right turn signal active");
        }


    }}
