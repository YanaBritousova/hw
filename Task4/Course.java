package Task4;

public enum Course {
    First, Second, Third, Fourth;
    private static final Course[] vals = values();

    public Course next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }

    }
