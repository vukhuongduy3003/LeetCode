class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        tmp = self.getMin()
        if tmp == None or tmp > val:
            tmp = val
        self.stack.append([val, tmp])

    def pop(self) -> None:
        if self.stack:
            self.stack.pop()

    def top(self) -> int:
        if self.stack:
            return self.stack[-1][0]
        return None

    def getMin(self) -> int:
        if self.stack:
            return self.stack[-1][1]
        return None


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()