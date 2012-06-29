object P01LastElement extends Application{
	
	def last[P](ls: List[P]) = ls.last
	
	def last2[P](ls: List[P]): P =
		ls match {
			case e :: Nil => e
			case _ :: tail => last2(tail)
			case _ => throw new NoSuchElementException()	// List was empty to begin with
		}
	
	
	val list = List(1, 1, 2, 3, 5, 8)
	println(last(list))
	println(last2(list))
}