package code.examples.junit;

class NumberCruncher {

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