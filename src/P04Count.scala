object P04Count extends Application{
	
	def count[P](ls: List[P]) = ls.size
	
	def countr[P](ls: List[P]): Int = {
		ls match {
			case Nil => 0
			case e :: tail => 1 + countr(tail)
		}
	}

	def countFold[P](ls: List[P]): Int = ls.foldLeft(0)( (sum,_) => sum+1 ) 
		
	val list = List(1, 1, 2, 3, 5, 8)
	println(count(list))
	println(countr(list))
	println(countFold(list))
}