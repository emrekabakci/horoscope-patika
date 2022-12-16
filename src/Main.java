import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("What month were you born: ");
        month = inp.nextInt();

        if ((month <= 12) && (month >= 1)) {

            System.out.print("What day were you born: ");
            day = inp.nextInt();

            if ((day <= 31) && (day >= 1)) {
                if (month == 1) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope is CAPRICORN");
                    } else {
                        System.out.println("Your Horoscope is AQUARIUS");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 29) && (day >= 1)) {
                if (month == 2) {
                    if (day <= 19) {
                        System.out.println("Your Horoscope is AQUARIUS");
                    } else {
                        System.out.println("Your Horoscope is PISCES");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 3) {
                    if (day <= 20) {
                        System.out.println("Your Horoscope is PISCES");
                    } else {
                        System.out.println("Your Horoscope is ARIES");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 30) && (day >= 1)) {
                if (month == 4) {
                    if (day <= 20) {
                        System.out.println("Your Horoscope is ARIES");
                    } else {
                        System.out.println("Your Horoscope is TAURUS");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 5) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope is TAURUS");
                    } else {
                        System.out.println("Your Horoscope is GEMINI");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 30) && (day >= 1)) {
                if (month == 6) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope is GEMINI");
                    } else {
                        System.out.println("Your Horoscope is CANCER");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 7) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope is CANCER");
                    } else {
                        System.out.println("Your Horoscope is LEO");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 8) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope is LEO");
                    } else {
                        System.out.println("Your Horoscope is VIRGO");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 30) && (day >= 1)) {
                if (month == 9) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope is VIRGO");
                    } else {
                        System.out.println("Your Horoscope is LIBRA");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 10) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope is LIBRA");
                    } else {
                        System.out.println("Your Horoscope is SCORPIO");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 30) && (day >= 1)) {
                if (month == 11) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope is SCORPIO");
                    } else {
                        System.out.println("Your Horoscope is SAGITTARIUS");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }
            if ((day <= 31) && (day >= 1)) {
                if (month == 12) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope is SAGITTARIUS");
                    } else {
                        System.out.println("Your Horoscope is CAPRICORN");
                    }
                }
            } else {
                System.out.println("You entered wrong day !");
            }

        } else {
            System.out.println("You entered wrong month !");
        }


    }
}