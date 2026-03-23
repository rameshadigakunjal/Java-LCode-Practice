package Collection.Easy;

class DesignHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] bucket;
    private int size;

    public DesignHashMap() {
        size = 1000;
        bucket = new Node[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        int index = hash(key);

        if (bucket[index] == null) {
            bucket[index] = new Node(-1, -1); // dummy head
        }

        Node prev = find(bucket[index], key);

        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = hash(key);

        if (bucket[index] == null) return -1;

        Node prev = find(bucket[index], key);

        if (prev.next == null) return -1;

        return prev.next.value;
    }

    public void remove(int key) {
        int index = hash(key);

        if (bucket[index] == null) return;

        Node prev = find(bucket[index], key);

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    private Node find(Node head, int key) {
        Node curr = head;
        while (curr.next != null && curr.next.key != key) {
            curr = curr.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        DesignHashMap hashMap = new DesignHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1)); // returns 1
        System.out.println(hashMap.get(3)); // returns -1 (not found)
        hashMap.put(2, 1); // update the existing value
        System.out.println(hashMap.get(2)); // returns 1
        hashMap.remove(2); // remove the mapping for 2
        System.out.println(hashMap.get(2)); // returns -1 (not found)
    }
}