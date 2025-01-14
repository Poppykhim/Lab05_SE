package Lab05_;
/**
 * Name: subject.java
 * Date: 14 January 2025
 * Author: Virak Rith
 * Modified: 14 January 2025
 * Description: Lab 05
 * Functions:
 * -getName(): Subject
 * -getInstance(): Subject
 * -getCredits(): Subject
 * Variables:
 * -Instance: subject
 * -name: subject
 * -credits: subject
 * -maxCredits: subject
 */
class Subject {
    private static final int maxCredits;
    private static final Subject Instance;
    static {
        maxCredits = 100;
        Instance = new Subject("Java programming", 90);
    }
    private String name;
    private int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public static Subject getInstance() {
        return Instance;
    }

    public int getCredits() {
        return credits;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(
                    "Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setCredits(int credits) {
        if (credits > maxCredits) {
            throw new IllegalArgumentException(
                    "credits cannot greater then 100");
        }
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + credits);
    }
}

public class Session {
    private static final int duration;
    private static final Session Instances;
    static {
        duration = 2;
        Instances = new Session("000-111-000", 7, 11);
    }

    private String id;
    private int startTime;
    private int endTime;
    public Session(String id, int startTime, int endTime){
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public static Session getInstances(){
        return Instances;
    }

    public void display(){
        System.out.println("-----------------------------");
        System.out.println("         SESSION");
        System.out.println("-----------------------------");
        System.out.println("Session ID: "+id);
        System.out.println("Start at: "+startTime+"AM");
        System.out.println("Duration: "+duration+" Hours");
        System.out.println("End at: "+endTime+"AM");
        System.out.println("-----------------------------");
    }
}

public class Exercise {
    public static void main(String[] args) {
        
        Subject subject = Subject.getInstance();
        subject.displayCourseDetails();

        Session session = Session.getInstances();
        session.display();
    }
}
