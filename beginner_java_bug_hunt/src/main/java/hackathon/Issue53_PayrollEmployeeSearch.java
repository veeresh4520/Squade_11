public class Issue53_PayrollEmployeeSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {4, 10, 7, 111};
        int target = 111;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
