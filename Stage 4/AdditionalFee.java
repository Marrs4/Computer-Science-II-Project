import java.util.Scanner;
public class AdditionalFee {
    private int feeId;
    private String description;
    private double amount;
    private String details;

    // Default constructor
    public AdditionalFee() {
        this.feeId = 0;
        this.description = "Default Description";
        this.amount = 0.0;
        this.details = "Default Details";
    }

    // Constructor with parameters
    public AdditionalFee(int feeId, String description, double amount, String details) {
        this.feeId = feeId;
        this.description = description;
        this.amount = amount;
        this.details = details;
    }
    public void manageAdditionalFee() {
        // Example implementation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Fee: $" + amount);
        System.out.print("Enter new fee amount: ");
        double newAmount = scanner.nextDouble();
        setAmount(newAmount);
        System.out.println("New fee amount set to $" + newAmount);
        scanner.close();  // Be careful with closing scanners in System.in scenarios
    }

    // Getters and setters
    public int getFeeId() {
        return feeId;
    }

    public void setFeeId(int feeId) {
        this.feeId = feeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "AdditionalFee" +
                "feeId=" + feeId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", details='" + details + '\'' +
                ' ';
    }
}
