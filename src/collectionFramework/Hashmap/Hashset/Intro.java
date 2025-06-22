package collectionFramework.Hashmap.Hashset;
import java.util.HashSet;

public class Intro {
    public static void main(String[] args) {


        HashSet<String> st=new HashSet<>();

        st.add("Bibek");
        st.add("Bhandari");
        st.add("bibek");
        st.add("bibek");
        System.out.println(st);
        System.out.println(st.contains("bibek"));
        System.out.println(st.size());
        st.remove("Bibek");
        System.out.println(st.size());

    }
}
