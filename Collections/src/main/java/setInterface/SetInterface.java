package setInterface;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','J','K','G','A','B');
        //SET
        // uniqueness
        // tree: sorted by default
        // hash: doesn't care about the order
        //linkedHash: does care about the order
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);

        Set<Character> hashSet = new LinkedHashSet<>(characters);
        System.out.println(hashSet);

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet);
    }
}
