public class OperatorExamples {
    public static void main(String[] args) {
        // Operator Bitwise: Shift Left (<<)
        int num = 5; // 0101 dalam biner
        int shiftLeftResult = num << 2; // Geser bit ke kiri 2 kali
        System.out.println("Hasil dari " + num + " << 2 adalah " + shiftLeftResult); // Output: 20

        // Operator Logika: AND (&&)
        boolean condition1 = true;
        boolean condition2 = false;
        boolean logicalAndResult = condition1 && condition2; // Logika AND
        System.out.println("Hasil dari " + condition1 + " && " + condition2 + " adalah " + logicalAndResult); // Output: false

        // Operator Penugasan: Penambahan dengan Assign (+=)
        int a = 10;
        a += 5; // Sama seperti a = a + 5
        System.out.println("Nilai a setelah a += 5 adalah " + a); // Output: 15
    }
}