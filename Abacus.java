
public class Abacus {

    public String[] add(String[] threads, int value) {
        return toThds(toInt(threads) + value);
    }

    private int toInt(String[] threads) {
        int n = 0;
        int d = 100000;

        for (String thread : threads) {
            n += toInt(thread) * d;
            d /= 10;
        }
        return n;
    }
    
    private int toInt(String thread) {
    	int n = 0;
        for (int i = thread.length() - 1; thread.charAt(i) == 'o'; i--, n++);
        return n;
    }

    private String toThd(int n) {
        StringBuilder thread = new StringBuilder();
        while (n-- > 0) thread.append("o");
        thread.append("---");
        while (thread.length() < 12) thread.append("o");
        return thread.reverse().toString();
    }
    
    private String[] toThds(int n) {
        String[] threads = new String[6];
        int d = 100000;
        int i = 5;

        while (d > 0) {
            threads[i--] = toThd(n % 10);
            d /= 10;
            n /= 10;
        }
        return threads;
    }
}
