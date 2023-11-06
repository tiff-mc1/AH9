class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // Node<T> curr = head;

    // while (curr.next != null) {
    // if (curr.val != curr.next.val)
    // return false;
    // isUnivalueList(curr = curr.next);
    // }

    if (head.next == null) {
      return true;
    } else {
      if (head.val == head.next.val) {
        return isUnivalueList(head = head.next);
      }
      return false;
    }
  }

  public static void main(String[] args) {
    // Test Case 1
    Node<String> z = new Node<>("z"); // z
    System.out.println((ECSource.isUnivalueList(z)));

    // Test Case 2
    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(3);
    Node<Integer> x = new Node<>(3);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // 2 -> 2 -> 3 -> 3 -> 2

    // Test Case 3
    // Node<Integer> u = new Node<>(2);
    // Node<Integer> v = new Node<>(2);
    // Node<Integer> w = new Node<>(2);
    // Node<Integer> x = new Node<>(2);
    // Node<Integer> y = new Node<>(2);

    // u.next = v;
    // v.next = w;
    // w.next = x;
    // x.next = y;

    // // 2 -> 2 -> 2 -> 2 -> 2

    ECSource.isUnivalueList(u);
    System.out.println(ECSource.isUnivalueList(u));
  }
}
