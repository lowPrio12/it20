package MultiDimensional;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        String[][] memNames = {
            {"jacob", "mark", "kent", "joana"},
            {"pauline", "katel", "kristine", "dexter"},};

        for (int i = 0; i < memNames.length; i++) {
            for (int j = 0; j < memNames[i].length; j++) {
                System.out.println(memNames[i][j] + "");
            }
            System.out.println();

        }
    }
}
