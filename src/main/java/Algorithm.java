class Algorithm {

    final int ODD_MULTIPLIER = 2;

    boolean luhnAlgorithm(String number) {


        int[] digits = new int[number.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }

        for (int i = digits.length - 2; i >= 0; i -= 2) {

            int tempValue = digits[i];

            tempValue = tempValue * ODD_MULTIPLIER;

            if (tempValue > 9) {
                //e.g. 18 mod 10 + 1 = 9 (sum of 2 digits cannot be higher than 18)
                tempValue = tempValue % 10 + 1;
            }

            digits[i] = tempValue;

        }

        int result = 0;

        for (int digit : digits) {
            result += digit;
        }

        return result % 10 == 0;

    }


}
