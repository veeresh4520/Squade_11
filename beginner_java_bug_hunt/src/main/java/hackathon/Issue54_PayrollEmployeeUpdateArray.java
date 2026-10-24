public class Issue54_PayrollEmployeeUpdateArray {
    public static void main(String[] args) {
        int[] values = new int[] {4, 10, 7, 7};
        int position = 2;
        int replacement = 14 - 4;
        if (position >= 0 && position < values.length) values[position - 1] = replacement;
        if (position == values.length) values[values.length - 1] = replacement;
        System.out.println(java.util.Arrays.toString(values));
    }
}
