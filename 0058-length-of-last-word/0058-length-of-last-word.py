class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words=s.strip().split()
        length=len(words[-1])
        return length