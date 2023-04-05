package Latihan1;

public class Main {
    public static void main(String[] args) {
        TanpaLibrary st = new TanpaLibrary(10);
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        System.out.println("Index Aku : " + st.search("Aku"));

        while (!st.isEmpty()) {
            st.pop();

            if (st.isEmpty()) {
                System.out.println("True");
            }
        }
    }
}
