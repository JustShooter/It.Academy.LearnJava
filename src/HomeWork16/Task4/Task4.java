/**
 * Работает!!! Если будет время, переделаю на работу с бинами и с сервисами...
 * 1 января 2022 года
 * 23:34
 */
package HomeWork16.Task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        /*        List<String> inputList = getInputList_TEMP();*/

        List<String> inputList = getInputList();
        Map<String, Map<String, Integer>> salesDataMap = getSalesDataMap(inputList);
        printSalesMap(salesDataMap);
    }

    private static void printSalesMap(Map<String, Map<String, Integer>> salesDataMap) {
        for (Map.Entry<String, Map<String, Integer>> s : salesDataMap.entrySet()) {
            System.out.println(s.getKey() + " : ");
            for (Map.Entry<String, Integer> s2 : s.getValue().entrySet()) {
                System.out.println(s2.getKey() + " " + s2.getValue());
            }
        }
    }

    private static Map<String, Map<String, Integer>> getSalesDataMap(List<String> inputList) {
        Map<String, Map<String, Integer>> salesDataMap = new TreeMap<>();
        Iterator<String> itr = inputList.iterator();
        while (itr.hasNext()) {
            int i = 0;
            String[] arr = new String[3];
            for (String arrString : itr.next().split(" ")) {
                arr[i] = arrString;
                i++;
            }
            if (salesDataMap.containsKey(arr[0])) {
                if (salesDataMap.get(arr[0]).containsKey(arr[1])) {
                    salesDataMap.get(arr[0]).put(arr[1], (salesDataMap.get(arr[0]).get(arr[1]) + Integer.parseInt(arr[2])));
                } else {
                    salesDataMap.get(arr[0]).put(arr[1], Integer.valueOf(arr[2]));
                }
            } else {
                TreeMap<String, Integer> inMap = new TreeMap<>();
                inMap.put(arr[1], Integer.valueOf(arr[2]));
                salesDataMap.put(arr[0], inMap);
            }
        }
        return salesDataMap;
    }

    private static List<String> getInputList_TEMP() {
        List<String> inputList = new ArrayList<>();
        inputList.add("OMA HoleSaw 5");
        inputList.add("OMA HandSaw 4");
        inputList.add("OMA HandSaw 6");
        inputList.add("OMA Screwdriver 12");
        inputList.add("OMA HoleSaw 2");
        inputList.add("Mile HoleSaw 6");
        inputList.add("Mile HandSaw 2");
        inputList.add("Mile Screwdriver 24");
        inputList.add("Mile Screwdriver 12");
        inputList.add("Mile HandSaw 6");
        return inputList;
    }

    private static List<String> getInputList() {
        List<String> inputList = new ArrayList<>();
        int i = 0;
        while (i == 0) {
            Scanner scanner = new Scanner(System.in);
            String inputLine = scanner.nextLine();
            if (Objects.equals(inputLine, "")) {
                i++;
            } else {
                inputList.add(inputLine);
            }
        }
        return inputList;
    }

}
