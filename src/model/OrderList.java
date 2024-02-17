package model;

public class OrderList {
    private Node first;

    public void add(String pNum, String name) {
        Node node;
        node = new Node(new Order(pNum, name));

        if(first == null) {
            first = node;
        } else {
            Node lastNode = first;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    public void add(int orderID, int qty, int totalValue, int orderStatus) {
        Node node = new Node(new Order(orderID, qty, totalValue, orderStatus));

        if(first == null) {
            first = node;
        } else {
            Node lastNode = first;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index <= size();
    }

    public void add(int index, Order order) {
        Node node = new Node(order);

        if(checkIndex(index)) {
            if(index == 0) {
                node.next = first;
                first = node;
            } else {
                Node temp = first;

                for(int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    public int indexOf(String data) {
        Node temp = first;
        int index = -1;

        while(temp != null) {
            index++;
            if(temp.order.equals(data)) {
                return index;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int index) {
        if(checkIndex(index)) {
            if(index == 0) {
                first = first.next;
            } else {
                Node temp = first;

                for(int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public void remove(String data) {
        remove(indexOf(data));
    }

    public Order get(int index) {
        if(checkIndex(index)) {
            if(index == 0) {
                return first.order;
            } else {
                Node temp = first;

                for(int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.order;
            }
        }
        return null;
    }

    public void clear() {
        first = null;
    }

    public int size() {
        int count = 0;
        Node temp = first;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Node peek() {
        if(isEmpty()) {
            return null; //throws an Exception
        }
        return first;
    }

    public boolean contains(String data) {
        return indexOf(data) != -1;
    }

    public String toString() {
        String list = "[";
        Node temp = first;

        while(temp != null) {
            list += temp.order + ", ";
            temp = temp.next;
        }
        return isEmpty() ? "[empty]" : list + "\b\b]";
    }

    public void printList() {
        System.out.println(toString());
    }

    class Node {
        private Order order;
        private Node next;

        Node() {}

        Node(Order order) {
            this.order = order;
            this.next = null;
        }
    }
}
