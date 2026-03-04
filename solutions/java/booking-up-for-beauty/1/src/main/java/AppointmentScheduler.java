import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    private static final DateTimeFormatter APPOINTMENT_DATE_FORMATTER = DateTimeFormatter
            .ofPattern("MM/dd/yyyy HH:mm:ss");

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, APPOINTMENT_DATE_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        java.util.function.Function<String, String> capitalize = (str) -> {
            String lowerCase = str.toLowerCase();
            return lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1);
        };
        StringBuilder description = new StringBuilder().append("You have an appointment on ")
                .append(appointmentDate.getDayOfWeek().toString().transform(capitalize)).append(", ")
                .append(appointmentDate.getMonth().toString().transform(capitalize)).append(" ")
                .append(appointmentDate.getDayOfMonth()).append(", ")
                .append(appointmentDate.getYear()).append(", at ");

        int hour = appointmentDate.getHour();
        String amPm = hour >= 12 ? "PM" : "AM";
        hour %= 12;
        if (hour == 0)
            hour = 12;
        description.append(String.format("%d:%02d %s.", hour, appointmentDate.getMinute(), amPm));
        return description.toString();
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
