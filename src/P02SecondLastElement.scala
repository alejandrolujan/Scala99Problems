object P02SecondLastElement extends Application{
	
	def secondLast[P](ls: List[P]) = ls.dropRight(1).last
	
	def secondLast2[P](ls: List[P]): P =
		ls match {
			case e :: f :: Nil => e
			case _ :: tail => secondLast2(tail)
			case _ => throw new NoSuchElementException()	// List was empty to begin with
		}
	
	
	val list = List(1, 1, 2, 3, 5, 8)
	println(secondLast(list))
	println(secondLast2(list))
}