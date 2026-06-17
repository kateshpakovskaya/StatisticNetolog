import org.jetbrains.annotations.NotNull;

public class StatisticService {
    public long findMax(long @NotNull [] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}