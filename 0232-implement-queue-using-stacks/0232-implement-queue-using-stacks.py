class MyQueue:

    def __init__(self):
        self.listStack = deque()

    def push(self, x: int) -> None:
        self.listStack.append(x)

    def pop(self) -> int:
        return self.listStack.popleft()

    def peek(self) -> int:
        return self.listStack[0]

    def empty(self) -> bool:
        return not self.listStack


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()