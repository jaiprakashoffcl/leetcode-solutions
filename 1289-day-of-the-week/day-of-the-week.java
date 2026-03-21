import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return Optional.of(LocalDate.of(year, month, day).getDayOfWeek().name())
            .map(s -> s.charAt(0) + s.substring(1).toLowerCase())
            .get();
    }
}