object P06Palindrome extends Application{
	
	def palindrome[P](ls: List[P]): Boolean = ls.reverse.equals(ls) 
		
	val list = List(1, 1, 2, 2, 1, 1)
	val list2 = List(1, 1, 2, 3, 2, 1)
	
	println(palindrome(list))
	println(palindrome(list2))
}