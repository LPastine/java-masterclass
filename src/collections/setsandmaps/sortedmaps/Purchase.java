package collections.setsandmaps.sortedmaps;

import java.time.LocalDate;

public record Purchase(String courseId, int studentId, double price, int yr, int dayOfYear) {
    public LocalDate pruchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);
    }
}
