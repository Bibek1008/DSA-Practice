package collectionFramework.Hashmap;

import java.util.LinkedList;

public class HashmapImp {

    static class MyHashmap<K, V> {

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75F;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;  // number of key-value pairs
        private LinkedList<Node>[] bucket;

        private void initBucket(int N) {
            bucket = new LinkedList[N];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        public MyHashmap() {
            initBucket(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            for (Node node : bucket[bi]) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
            }
            bucket[bi].add(new Node(key, value));
            n++;
            // (Optional) Check load factor and resize if needed
        }

        public V get(K key) {
            int bi = HashFunc(key);
            for (Node node : bucket[bi]) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return null; // not found
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            for (Node node : bucket[bi]) {
                if (node.key.equals(key)) {
                    V val = node.value;
                    bucket[bi].remove(node);
                    n--;
                    return val;
                }
            }
            return null; // not found
        }
    }

    public static void main(String[] args) {
        MyHashmap<String, Integer> map = new MyHashmap<>();
        map.put("Bibek", 21);
        map.put("Ram", 25);
        map.put("Bibek", 22); // update value

        System.out.println("Bibek -> " + map.get("Bibek")); // 22
        System.out.println("Ram -> " + map.get("Ram"));     // 25
        System.out.println("Removed -> " + map.remove("Ram")); // 25
        System.out.println("Ram -> " + map.get("Ram"));     // null
        System.out.println("Size -> " + map.size());        // 1
    }
}
