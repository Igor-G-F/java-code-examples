package code.examples.junit;

class NumberCruncher {

    private NumberCruncher() {
        throw new IllegalArgumentException("Utility class, should not be instantiated.");
    }

    static int getLargestNumber(int... number) {
        int result = number[0];

        for (int num : number) {
            if (num > result) {
                result = num;
            }
        }

        return result;
    }
}