import java.util.Arrays;

    class GasStation {

        public static int canCompleteCircuit(int[] gas, int[] cost) {
            int totalTank = 0;
            int currentTank = 0;
            int start = 0;

            for (int i = 0; i < gas.length; i++) {
                int difference = gas[i] - cost[i];

                totalTank += difference;
                currentTank += difference;

                if (currentTank < 0) {
                    start = i + 1;
                    currentTank = 0;
                }
            }

            if (totalTank < 0) {
                return -1;
            }

            return start;
        }
    }

    class GasStationDemo {
        public static void main(String[] args) {
            int[] gas = {1, 2, 3, 4, 5};
            int[] cost = {3, 4, 5, 1, 2};

            int result =
                    GasStation.canCompleteCircuit(gas, cost);

            System.out.println("Starting Station: " + result);
        }
    }