object P04reverse extends Application{
	
	def reverse[P](ls: List[P]): List[P] = ls.foldLeft(List[P]())((reversed,e) => e :: reversed ) 
		
	val list = List(1, 1, 2, 3, 5, 8)
	println(reverse(list))
}