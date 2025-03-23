class Solution:
    def compress(self, chars: List[str]) -> int:
        s = []  # Store compressed version

        i = 0  # Pointer to iterate
        while i < len(chars):
            char = chars[i]
            count = 1

            # Count occurrences of the current character
            while i + 1 < len(chars) and chars[i + 1] == char:
                count += 1
                i += 1

            s.append(char)  # Add character
            if count > 1:  # If count > 1, add digits
                s.extend(list(str(count)))

            i += 1  # Move to next unique character

        # Modify `chars` in place
        chars[:] = s  
        return len(s)  # Return new length
