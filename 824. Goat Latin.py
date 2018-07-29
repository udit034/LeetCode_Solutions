class Solution(object):
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """
        result = ""
        vowels = [ 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' ]
        for index, word in enumerate( S.split() ):
            if word[0] in vowels:
                result += word + "ma" + str('a' * ( index + 1 ) ) + " "
            else:
                result += word[1:] + word[0] + "ma" + str('a' * ( index + 1 ) ) + " "
        return result[:-1]
        