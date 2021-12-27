package HomeWork8.Task25;

import java.util.Scanner;

public class ATM {
    private int nominal100count;
    private int nominal50count;
    private int nominal20count;
    private static final int NOMINAL100 = 100;
    private static final int NOMINAL50 = 50;
    private static final int NOMINAL20 = 20;
    private static final int MAXBANKNOTES = 30; //максимальное количество банкнот, которое может выдать АТМ

    public ATM(int nominal100count, int nominal50count, int nominal20count) {
        this.setNominal100count(nominal100count);
        this.setNominal50count(nominal50count);
        this.setNominal20count(nominal20count);
    }

    public int getNominal100count() {
        return nominal100count;
    }

    public void setNominal100count(int nominal100count) {
        this.nominal100count = nominal100count;
    }

    public void addNominal100banknote(int load100) {
        setNominal100count(getNominal100count() + load100);
    }

    public int getNominal50count() {
        return nominal50count;
    }

    public void setNominal50count(int nominal50count) {
        this.nominal50count = nominal50count;
    }

    public void addNominal50banknote(int load50) {
        setNominal100count(getNominal50count() + load50);
    }

    public int getNominal20count() {
        return nominal20count;
    }

    public void setNominal20count(int nominal20count) {
        this.nominal20count = nominal20count;
    }

    public void addNominal20banknote(int load20) {
        setNominal100count(getNominal20count() + load20);
    }

    public void loadATM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Load ATM procedure started");
        System.out.println("Enter 100 rubles banknotes loaded in ATM:");
        int load100 = scanner.nextInt();
        System.out.println("Enter 50 rubles banknotes loaded in ATM:");
        int load50 = scanner.nextInt();
        System.out.println("Enter 20 rubles banknotes loaded in ATM:");
        int load20 = scanner.nextInt();
        this.addNominal100banknote(load100);
        this.addNominal50banknote(load50);
        this.addNominal20banknote(load20);
    }

    public boolean checkSumPossibility(int sum) {
        int banknote100 = getNominal100count();
        int banknote50 = getNominal50count();
        int banknote20 = getNominal20count();
        int count = 0;
        if (sum <= 0) return false;
        while (sum >= NOMINAL100) {
            if (banknote100 > 0) {
                sum -= NOMINAL100;
                banknote100--;
                count++;
            } else break;
        }
        while (sum >= NOMINAL50) {
            if (sum % 20 == 0) break;
            if (banknote50 > 0) {
                sum -= NOMINAL50;
                banknote50--;
                count++;
            } else break;
        }
        while (sum >= NOMINAL20) {
            if (banknote20 > 0) {
                sum -= NOMINAL20;
                banknote20--;
                count++;
            } else break;
        }
        if (sum == 0 && count <= MAXBANKNOTES) {
            return true;
        } else {
            System.out.println("You've entered too much.");
            return false;
        }
    }

    public boolean withdrawSum(int sum) {
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        if (checkSumPossibility(sum)) {
            while (sum >= NOMINAL100) {
                if (getNominal100count() > 0) {
                    sum -= NOMINAL100;
                    setNominal100count(getNominal100count() - 1);
                    count100++;
                } else break;
            }
            while (sum >= NOMINAL50) {
                if (sum % 20 == 0) break;
                if (getNominal50count() > 0) {
                    sum -= NOMINAL50;
                    setNominal50count(getNominal50count() - 1);
                    count50++;
                } else break;
            }
            while (sum >= NOMINAL20) {
                if (getNominal20count() > 0) {
                    sum -= NOMINAL20;
                    setNominal20count(getNominal20count() - 1);
                    count20++;
                } else break;
            }
            if (sum == 0) {
                System.out.println("You've received:");
                System.out.println(count100 + " banknote(s) of 100 rubles");
                System.out.println(count50 + " banknote(s) of 50 rubles");
                System.out.println(count20 + " banknote(s) of 20 rubles");
                System.out.println("Total amount withdraw is " + ((count100 * NOMINAL100) + (count50 * NOMINAL50) + (count20 * NOMINAL20)) + " rubles.");
            }
            return true;
        } else {
            return false;
        }
    }

    public int checkMaxWithdrawAmount() {
        int banknote100 = getNominal100count();
        int banknote50 = getNominal50count();
        int banknote20 = getNominal20count();
        int maxswithdrawsum;
        int count = MAXBANKNOTES;
        while (banknote100 > 0 && count > 0) {
            banknote100--;
            count--;
        }
        while (banknote50 > 0 && count > 0) {
            banknote50--;
            count--;
        }
        while (banknote20 > 0 && count > 0) {
            banknote20--;
            count--;
        }
        maxswithdrawsum = ((getNominal100count() - banknote100) * NOMINAL100) + ((getNominal50count() - banknote50) * NOMINAL50) + ((getNominal20count() - banknote20) * NOMINAL20);
        return maxswithdrawsum;
    }

    public void printTotalAmountInATM() {
        System.out.println("There is " + getNominal100count() + " banknotes of 100 rubles in ATM.");
        System.out.println("There is " + getNominal50count() + " banknotes of 50 rubles in ATM.");
        System.out.println("There is " + getNominal20count() + " banknotes of 20 rubles in ATM.");
        int totalsum = (getNominal20count() * NOMINAL20) + (getNominal50count() * NOMINAL50) + (getNominal100count() * NOMINAL100);
        System.out.println("There is total amount of rubles in ATM is " + totalsum);
    }
}