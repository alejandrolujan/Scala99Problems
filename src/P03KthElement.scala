object P03KthElement extends Application{
	
	def kth[P](k: Int, ls: List[P]) = ls(k)
	
	def kth2[P](k: Int, ls: List[P]): P = ls.drop(k).first
	
	def kthr[P](k: Int, ls: List[P]): P = {
		(k,ls) match {
			case (0, f :: _) => f
			case (n, f :: list) => kthr(n-1, list)
			case (n, Nil) => throw new NoSuchElementException
		}
	}
	
	val list = List(1, 1, 2, 3, 5, 8)
	println(kth(2, list))
	println(kth2(2, list))
	println(kthr(2, list))
}