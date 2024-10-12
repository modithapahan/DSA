class Node:
  def __init__(self, data: int) -> None:
    self.data = data
    self.next = None

class SinglyList:
  def __init__(self) -> None:
    self._head = None

  def print_list(self) -> None:
    cur = self._head

    while cur != None:
      print(cur.data, end=' --> ')
      cur = cur.next
    print('null')
  
  def reverse(self) -> Node:
    if self._head == None:
      return self._head
    else:
      cur = self._head
      pre = None
      next = None

      while cur!= None:
        next = cur.next
        cur.next = pre
        pre = cur
        cur = next
      self._head = pre
      return self._head

sl = SinglyList()
sl._head = Node(1)
sl._head.next = Node(2)
sl._head.next.next = Node(3)
sl._head.next.next.next = Node(4)
sl.print_list()
sl.reverse()
sl.print_list()