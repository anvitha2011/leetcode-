class RecentCounter {

    int[] ar;
    int size;

    public RecentCounter() {
        ar = new int[10000];
        size = 0;
    }

    public int ping(int t) {
        ar[size] = t;
        size++;

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i] >= t - 3000 && ar[i] <= t) {
                count++;
            }
        }

        return count;
    }
}