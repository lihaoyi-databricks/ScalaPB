for(p <- os.walk(os.pwd)) p.ext match{
  case "scala" =>
    println(p.relativeTo(os.pwd))
    val txt = os.read(p)
    val google = p.relativeTo(os.pwd).toString.contains("com/google")
    val prefix = if(google) "" else "package shaded\n"
    val replaced = if (google) txt.replace("scalapb.", "shaded.scalapb.") else txt
    os.write.over(
      p,
      prefix + replaced.replace("_root_.scalapb", "_root_.shaded.scalapb")
    )
  case "java" => os.write.over(p, os.read(p).replace("scalapb.", "shaded.scalapb."))
  case "sbt" =>
    os.write.over(
      p,
      os.read(p)
        .replace("\"\"\"package scalapb", "\"\"\"package shaded.scalapb")
        .replace("|package scalapb", "|package shaded.scalapb")
    )
  case _ =>
}