class Node:
  def __init__(self, data: int) -> None:
    self.data = data
    self.next = None

class LinkedList:
  def __init__(self) -> None:
    self._head = None
  
  def display_list(self) -> None:
    cur = self._head

    while cur != None:
      print(cur.data, end=' --> ')
      cur = cur.next
    print('null')
  
  def add_end(self, data: int) -> Node:
    new_node = Node(data)

    if self._head == None:
      new_node.next = self._head
      self._head = new_node
      return self._head
    else:
      cur = self._head

      while cur.next != None:
        cur = cur.next
      
      cur.next = new_node

    return self._head
  
sl = LinkedList()
sl._head = Node(1)
sl._head.next = Node(2)
sl.add_end(3)
sl.add_end(4)
sl.display_list()