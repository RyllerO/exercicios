package Arrays;

public class ProgrammingTestMobi {
    public static void main(String[] args) {

        String[] result = {"---", "*--", "**-", "***", "**-", "**-", "---", "***"};
        String[] moments = {"12:12", "11:22", "12:21", "00:00", "12:32"};
        int[] wins = {0, 0, 1};
        int[] ties = {1, 4, 0};

//        printFizzBuzz();
//        System.out.println(countStars(result));
//        System.out.println(countCreepyMoments(moments));
//        System.out.println(getChampionPoints(wins, ties));
    }

    void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + "Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + "Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "FizzBuzz");
            }
        }
    }

//    0 and 3 stars


    int countStars(String[] result) {
        int totalPoints = 0;
        for (String point : result) {
            if (point.equals("---")) {
                totalPoints += 0;
            }
            if (point.equals("*--")) {
                totalPoints += 1;
            }
            if (point.equals("**-")) {
                totalPoints += 2;
            }
            if (point.equals("***")) {
                totalPoints += 3;
            }
        }
        return totalPoints;
    }

    int countCreepyMoments(String[] moments) {
        int totalCreepyMoments = 0;
        for (String moment : moments) {

            boolean allSame = moment.charAt(0) == moment.charAt(1) && moment.charAt(1) == moment.charAt(3) && moment.charAt(3) == moment.charAt(4);

            if (moment.charAt(0) == moment.charAt(3) && moment.charAt(1) == moment.charAt(4) && !allSame) {
                totalCreepyMoments += 1;
            }
            if (moment.charAt(0) == moment.charAt(1) && moment.charAt(3) == moment.charAt(4) && !allSame) {
                totalCreepyMoments += 1;
            }
            if (moment.charAt(0) == moment.charAt(4) && moment.charAt(1) == moment.charAt(3) && !allSame) {
                totalCreepyMoments += 1;
            }
            if (allSame) {
                totalCreepyMoments += 1;
            }
        }
        return totalCreepyMoments;
    }

    int getChampionPoints(int[] wins, int[] ties) {
        int result = 0;
        for (int i = 0; i < wins.length; i++) {
            if (result < (ties[i] + (wins[i] * 3))) {
                result = (ties[i] + (wins[i] * 3));
            }

        }
        return result;
    }

}

//    select OrderID, sum(UnitPrice) as TotalPrice
//        from OrderItems
//        where CustomerID in (select CustomerID from Customers where CustomerName like '%DeathStar%')
//        group by OrderID;
//
//        -- Customers: CustomerID, CustomerName.
//        -- OrderItems: OrderID, CustomerID, ProductName, UnitPrice, Quantity.
//
//        -- crie uma consulta SQL que retorne o valor total de cada pedido feito por CustomerName "DeathStar",
//        -- mostrando o OrderID e TotalPrice (um pedido por linha). *