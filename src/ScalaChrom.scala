/**
 * Created by yosuke on 10/30/15.
 */
object ScalaChrom {
  def main(args: Array[String]) {
    println("Scala version of Chrom Loop")

    val seq = new Sequence("ATGCAAAAAAGGAGCCAATT")
    seq.to_str()


    val c = new KmerFreqVec(3, seq)


  }

}
