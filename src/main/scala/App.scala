import models._
import asm.models._
import com.novus.salat._
//import com.novus.salat.global._
import when_necessary_context._
import com.mongodb.casbah.Imports._

object Main extends App {
  //val hello = MyRecord("Hello Record")

  val model$ = DynamicClassLoader.loadClass("models.MyRecord$", MyRecord$Dump.dump()) //Load the module class
  val model  = DynamicClassLoader.loadClass("models.MyRecord", MyRecordDump.dump()) //Then load the class
  val ctor$  = model$.getConstructor()
  val instance$ = ctor$.newInstance()//Changed Module$Dump <init> from PRIVATE to PUBLIC, else no method found
  val apply$ = model$.getMethod("apply", classOf[String]) //get apply method from class
  val hello =  apply$.invoke(instance$, "hello world").asInstanceOf[MyRec]//get a MyRecord(hello world)
 
  val dbo = grater[MyRec].asDBObject(hello)
  println(dbo)

  val obj = grater[MyRec].asObject(dbo)
  println(obj)
}

