public class lab01task2 {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50, 60};
        rotateLeft(source,3);

        for (int i = 0; i < source.length; i++) {
            if(i== source.length-1) {
                System.out.print(source[i]);
            }
            else {
                System.out.print(source[i]+",");
            }
        }
    }

    public static int [] rotateLeft(int[] s, int k) {
        int temp=0;
        for (int i = k; i < s.length; i++) {
            temp = s[i - k];
            s[i - k] = s[i];
            s[i] = temp;
        }
        return s;
    }

}
