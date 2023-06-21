package OOPs

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


object OOBExcercise extends App {
  val author = new Writer("Chales", "Dickens", 1812)
  val imposter = new Writer("Chales", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)


  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))                 //Although same details but different address and hence returns false


  val novel_modified = novel.copy(1900)
  println(novel_modified.authorAge)
  println(novel_modified.isWrittenBy(author))
  println(novel_modified.isWrittenBy(imposter))


}
