public class DoubleLinkedLists {
    Node22 head;
    Node22 tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(Mahasiswa22 data, int index) {
        if (index <= 0) {
            addFirst(data);
        } else {
            Node22 temp = head;
            int i = 0;
            while (temp != null && i < index - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null || temp == tail) {
                addLast(data);
            } else {
                Node22 newNode = new Node22(data);
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim) {
        Node22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            Node22 toDelete = current.next;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
            toDelete.data.tampil();
            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            } else {
                tail = current;
            }
        } else {
            System.out.println("Tidak ada node yang bisa dihapus setelah NIM " + keyNim);
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node22 temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            System.out.println("Data di index " + index + " berhasil dihapus:");
            temp.data.tampil();

            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp == tail) tail = temp.prev;
        } else {
            System.out.println("Index di luar jangkauan.");
        }
    }

    public Mahasiswa22 getFirst() {
        return !isEmpty() ? head.data : null;
    }

    public Mahasiswa22 getLast() {
        return !isEmpty() ? tail.data : null;
    }

    public Mahasiswa22 getIndex(int index) {
        Node22 current = head;
        int i = 0;
        while (current != null) {
            if (i == index) return current.data;
            current = current.next;
            i++;
        }
        return null;
    }
    
    public int size() {
        int count = 0;
        Node22 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertAfter(String keyNim, Mahasiswa22 data) {
        Node22 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node22 newNode = new Node22( data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong.");
    } else {
        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}

    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }

    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    head.data.tampil();

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
}


   public void removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
}


    public Node22 search(String nim) {
        Node22 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}