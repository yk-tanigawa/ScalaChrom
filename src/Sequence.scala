/**
 * Created by yosuke on 10/30/15.
 */
class Sequence(s : String) {

  val len = s.length()
  val seq = s.toCharArray.map(c2b)


  def dump() = {
    println(len)
    println(seq.map(b2c).mkString)
  }

  def c2b(c : Char) : Byte = {
    c match {
      case 'A' => 0
      case 'C' => 1
      case 'G' => 2
      case 'T' => 3
      case 'a' => 0
      case 'c' => 1
      case 'g' => 2
      case 't' => 3
      case _ => throw new SeqLetterException(c)
    }
  }

  def b2c(n : Byte) : Char = {
    n match {
      case 0 => 'A'
      case 1 => 'C'
      case 2 => 'G'
      case 3 => 'T'
      case _ => throw new SeqNumberException(n)
    }
  }
}
