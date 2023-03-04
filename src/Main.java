public class Main {
    public static void main(String[] args) {
        // Стоимость билета
        int amountTicket = 1500;
        // Числовое значение, равное 1 мили
        int amountRub = 20;
        System.out.println("Вам начислено миль:");
        int result;
            result = amountTicket / amountRub;
        System.out.println(result);
    }
}