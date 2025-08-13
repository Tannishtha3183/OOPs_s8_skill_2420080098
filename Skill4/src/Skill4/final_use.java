package Skill4;

public class final_use {
    private final int id;
    public final_use(int id) {
        this.id = id;
    }
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
    public static void main(String[] args) {
    	final_use demo = new final_use(1);
        demo.displayMessage();
        final StringBuilder builder = new StringBuilder("Hello");
        builder.append(", World!");
        System.out.println(builder.toString());
    }
}


