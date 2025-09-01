public class DNF_Better {
    public static void DNF(int[] arr) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count 0s, 1s, 2s
        for (int num : arr) {
            if (num == 0) cnt0++;
            else if (num == 1) cnt1++;
            else cnt2++;
        }

        // Fill 0s
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }

        // Fill 1s
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }

        // Fill 2s
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        DNF(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

