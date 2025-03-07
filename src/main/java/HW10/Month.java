package HW10;

public final class Month {
    private final String name;
    private final int valueDays;
    private final int workDays;

    public Month (String name, int valueDays, int workDays){
        this.name = name;
        this.valueDays = valueDays;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public int getValueDays() {
        return valueDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}
