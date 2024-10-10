class Node:
  def __init__(self, data: int) -> None:
    self.data = data
    self.next = None

class LinkedList:
  def __init__(self) -> None:
    self._head = None

  def display_list(self) -> None:
    cur = self._head

    while cur:
      print(cur.data, end=' --> ')
      cur = cur.next
    print('null')

sl = LinkedList()
sl._head = Node(1)
sl._head.next = Node(2)
sl._head.next.next = Node(3)
sl.display_list()