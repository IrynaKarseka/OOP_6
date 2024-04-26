package work2ISP;

// Interface segregation principle (Принцип разделения интерфейса)
// Избавляем программные сущности от методов, которые они не используют


public class AccountReportGenerator implements ReportGeneratorJSON {
    @Override
    public String generateJson() {
        String report = " ";
        // todo Logic
        return report;
    }
}
