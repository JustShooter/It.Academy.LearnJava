package HomeWork12;

public class Firm {
    private int Workers;
    private int Profit;

    public int getWorkers() {
        return Workers;
    }

    public void setWorkers(int workers) {
        Workers = workers;
    }

    public int getProfit() {
        return Profit;
    }

    public void setProfit(int profit) {
        Profit = profit;
    }


    public class Subsidiary {
        private int subsidiaryWorkers;
        private int subsidiaryProfit;

        public Subsidiary(int subsidiaryWorkers, int subsidiaryProfit) {
            this.subsidiaryWorkers = subsidiaryWorkers;
            this.subsidiaryProfit = subsidiaryProfit;
        }

        public int getSubsidiaryWorkers() {
            return subsidiaryWorkers;
        }

        public void setSubsidiaryWorkers(int subsidiaryWorkers) {
            this.subsidiaryWorkers = subsidiaryWorkers;
        }

        public int getSubsidiaryProfit() {
            return subsidiaryProfit;
        }

        public void setSubsidiaryProfit(int subsidiaryProfit) {
            this.subsidiaryProfit = subsidiaryProfit;
        }
    }

    public static class SalesDepartment {
        private int officeWorkers;
        private int officeProfit;

        public SalesDepartment(int officeWorkers, int officeProfit) {
            this.officeWorkers = officeWorkers;
            this.officeProfit = officeProfit;
        }

        public int getOfficeWorkers() {
            return officeWorkers;
        }

        public void setOfficeWorkers(int officeWorkers) {
            this.officeWorkers = officeWorkers;
        }

        public int getOfficeProfit() {
            return officeProfit;
        }

        public void setOfficeProfit(int officeProfit) {
            this.officeProfit = officeProfit;
        }
    }

}
