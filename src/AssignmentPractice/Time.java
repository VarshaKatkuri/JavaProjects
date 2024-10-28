package AssignmentPractice;

public class Time implements Comparable<Time>, Cloneable {
    private long elapsedTime; // Stores the elapsed time since midnight, Jan 1, 1970
    private long hours;
    private long minutes;
    private long seconds;
    private final long HOURS_IN_A_DAY = 24;
    private final long CONVERSION_FACTOR = 60;

    // No-arg constructor for the current time
    public Time() {
        setElapsedTime(System.currentTimeMillis() / 1000);
    }

    // Constructor with specified hour, minute, and second
    public Time(long hours, long minutes, long seconds) {
        validateTimeComponents(hours, minutes, seconds);
        long elapsedTime = ((hours * CONVERSION_FACTOR + minutes) * CONVERSION_FACTOR + seconds);
        setElapsedTime(elapsedTime);
    }

    // Constructor with specified elapsed time
    public Time(long elapsedTime) {
        setElapsedTime(elapsedTime);
    }

    // Method to validate hours, minutes, and seconds
    private void validateTimeComponents(long hours, long minutes, long seconds) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative! Please enter a valid hour value for your time.");
        }
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative! Please enter a valid hour value for your time.");
        }
        if (seconds < 0) {
            throw new IllegalArgumentException("Seconds cannot be negative! Please enter a valid hour value for your time.");
        }
    }

    // Method to set elapsed time and update hours, minutes, and seconds
    public void setElapsedTime(long elapsedTime) {
        if (elapsedTime < 0) {
            throw new IllegalArgumentException("Elapsed time cannot be negative. Please enter a valid elapsed time in seconds.");
        }
        this.elapsedTime = elapsedTime;
        this.hours = (elapsedTime / (CONVERSION_FACTOR * CONVERSION_FACTOR)) % HOURS_IN_A_DAY;
        this.minutes = (elapsedTime / CONVERSION_FACTOR) % CONVERSION_FACTOR;
        this.seconds = elapsedTime % CONVERSION_FACTOR;
    }

    // Get the current hour in the range 0-23
    public long getHour() {
        return hours;
    }

    // Get the current minute in the range 0-59
    public long getMinute() {
        return minutes;
    }

    // Get the current second in the range 0-59
    public long getSecond() {
        return seconds;
    }

    // Get the total elapsed seconds
    public long getSeconds() {
        return elapsedTime;
    }

    // Convert time to a string representation
    @Override
    public String toString() {
        long hours = getHour();
        long minutes = getMinute();
        long seconds = getSecond();

        String hoursString = hours == 1 ? "1 hour" : hours + " hours";
        String minutesString = minutes == 1 ? "1 minute" : minutes + " minutes";
        String secondsString = seconds == 1 ? "1 second" : seconds + " seconds";

        return String.format("%s %s %s", hoursString, minutesString, secondsString);
    }

    // Compare two Time objects based on elapsed time
    @Override
    public int compareTo(Time other) {
        if (other == null) {
            throw new NullPointerException("The compared Time object cannot be null");
        }
        return (int)(this.elapsedTime - other.elapsedTime);
    }

    // Clone the Time object
    @Override
    public Time clone() throws CloneNotSupportedException {
        return (Time) super.clone();
    }
}
