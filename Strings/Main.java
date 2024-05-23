public class Main {
    public static void main(String[] args) {
        String input = "He1106 9Worl 2, Nic8e D7ayl";
        int result = numberSearch(input);
        System.out.println("Output: " + result);
    }

    public static int numberSearch(String str) {
        int sum = 0;
        int letterCount = 0;

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, add it to the sum
                sum += Character.getNumericValue(c);
            } else if (Character.isLetter(c)) {
                // If the character is a letter, increment the letter count
                letterCount++;
            }
        }

        // Calculate the final result by dividing the sum by the letter count
        double finalResult = (double) sum / letterCount;

        // Round the result to the nearest whole number
        return (int) Math.round(finalResult);
    }
}