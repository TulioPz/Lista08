package exercicioExtra;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        int n = 10000; // Número de concatenações
        String s = "";
        StringBuffer sb = new StringBuffer();
        
        // Teste com String
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo com String: " + (endTime - startTime) + "ms");
        
        // Teste com StringBuffer
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tempo com StringBuffer: " + (endTime - startTime) + "ms");
    }
}
