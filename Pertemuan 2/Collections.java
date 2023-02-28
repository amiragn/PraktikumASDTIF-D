import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // List
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("mira");
        ll.add("shania");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.get(0));
        ll.remove("mira");
        System.out.println(ll);

        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        System.out.println(l);

        // Stack
        Stack<String> s = new Stack<String>();
        s.push("mira");
        s.push("shania");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);

        // Queue
        Queue<String> q = new LinkedList<String>();
        q.add("mira");
        q.add("shania");
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);

        // Set
        Set<String> st = new HashSet<String>();
        st.add("mira");
        st.add("shania");
        System.out.println(st);
        st.remove("shania");
        st.add("mira");
        System.out.println(st);

        // Map
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("mira", 1);
        m.put("shania", 2);
        System.out.println(m);
        m.remove("shania");
        System.out.println(m);
    }
}