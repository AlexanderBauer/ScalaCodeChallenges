object Plaindrome {
  def isPalindrome(word: String): Boolean = {
    // make word lowercase for case insensitivity
    val lowerCase = word.toLowerCase
    // compare word to reversed word
    lowerCase == lowerCase.reverse
  }
}
