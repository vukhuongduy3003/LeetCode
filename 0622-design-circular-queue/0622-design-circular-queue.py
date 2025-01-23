class MyCircularQueue:

    def __init__(self, k: int):
        self.queue = [0] * k
        self.len_queue = k
        self.front = self.len = 0
        self.rear = -1

    def enQueue(self, value: int) -> bool:
        if not self.isFull():
            self.rear = (self.rear + 1) % self.len_queue
            self.queue[self.rear] = value
            self. len += 1
            return True
        return False

    def deQueue(self) -> bool:
        if not self.isEmpty():
            self.front = (self.front + 1) % self.len_queue
            self.len -= 1
            return True
        return False

    def Front(self) -> int:
        return -1 if self.isEmpty() else self.queue[self.front]

    def Rear(self) -> int:
        return -1 if self.isEmpty() else self.queue[self.rear]

    def isEmpty(self) -> bool:
        return self.len == 0

    def isFull(self) -> bool:
        return self.len == self.len_queue


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()