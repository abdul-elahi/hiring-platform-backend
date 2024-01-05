package com.hiring.utils;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class ExperienceTimelineUtil {

    public static List<String> getMonthlyTimeline(LocalDate startDate, LocalDate endDate) {
        List<String> timeline = new ArrayList<>();
        YearMonth currentMonth = YearMonth.from(startDate);

        while (!currentMonth.isAfter(YearMonth.from(endDate))) {
            timeline.add(currentMonth.toString());
            currentMonth = currentMonth.plusMonths(1);
        }

        return timeline;
    }
}
