class Node:
  def __init__(self, data: int) -> None:
    self.data = data
    self.next = None

class LinkedList:
  def __init__(self) -> None:
    self._head = None
  
  def insert_front_node(self, data: int) -> Node:
    new_node = Node(data)
    new_node.next = self._head
    self._head = new_node

    return self._head
  
  def print_list(self) -> None:
    cur = self._head

    while cur:
      print(cur.data, end=' --> ')
      cur = cur.next
    print('none')
  
sl = LinkedList()
sl._head = Node(2)
sl._head.next = Node(3)
sl._head.next.next = Node(4)
sl.insert_front_node(1)
sl.print_list()