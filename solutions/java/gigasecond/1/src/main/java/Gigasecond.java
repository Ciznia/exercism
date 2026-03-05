import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        LocalDateTime localDateTime = moment.atStartOfDay();
        this.moment = localDateTime.plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
        return this.moment;
    }
}
