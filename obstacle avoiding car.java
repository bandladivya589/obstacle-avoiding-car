// Simple Obstacle Avoiding Car Simulation in Java

public class ObstacleAvoidingCar {

    // Simulated sensor distance (in centimeters)
    static int distance = 0;

    public static void main(String[] args) {
        while (true) {
            distance = getDistanceFromSensor();

            if (distance < 20) { // Obstacle detected within 20 cm
                stopCar();
                turnRight(); // Try turning right
            } else {
                moveForward();
            }

            delay(1000); // Wait 1 second before next reading
        }
    }

    // Simulated function to get sensor data
    public static int getDistanceFromSensor() {
        // In real hardware, you’d read from an ultrasonic sensor
        return (int)(Math.random() * 50); // Random value for simulation
    }

    public static void moveForward() {
        System.out.println("Moving forward...");
    }

    public static void stopCar() {
        System.out.println("Obstacle detected! Stopping...");
    }

    public static void turnRight() {
        System.out.println("Turning right to avoid obstacle...");
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
