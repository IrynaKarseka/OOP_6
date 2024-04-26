package work2ISP;


// Interface segregation principle (Принцип разделения интерфейса)
// Избавляем программные сущности от методов, которые они не используют


public interface ReportGeneratorJSON {
    String generateJson();
}
