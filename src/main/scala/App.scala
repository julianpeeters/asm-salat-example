import models._
import asm.models._
import com.novus.salat._
//import com.novus.salat.global._
import when_necessary_context._
import com.mongodb.casbah.Imports._


object Main extends App {


  val model$ = DynamicClassLoader.loadClass("models.MyRecord$", MyRecord$Dump.dump()) //Load the module class
  val model  = DynamicClassLoader.loadClass("models.MyRecord", MyRecordDump.dump()) //Then load the class
  val ctor$  = model$.getConstructor()
  val instance$ = ctor$.newInstance()//Change Module$Dump <init> from PRIVATE to PUBLIC, else no method found

  //val instance$ = model$.newInstance()
  val apply$ = model$.getMethod("apply", classOf[String])
  val record =  apply$.invoke(instance$, "hello world").asInstanceOf[DynamicBase]
 
  val dbo = grater[DynamicBase].asDBObject(record)
  val obj = grater[DynamicBase].asObject(dbo)

   println(obj)

}

