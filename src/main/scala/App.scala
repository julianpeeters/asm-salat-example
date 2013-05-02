import models._
import asm.models._
import when_necessary_context._
import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._
//import org.objectweb.asm._
import java.lang.reflect._
import scala.reflect.runtime.universe._
import scala.reflect.runtime._



import com.novus.salat._

package object when_necessary_context {

    implicit val ctx = new Context {
        val name = "When-Necessary-Context"

        override val typeHintStrategy = StringTypeHintStrategy(when = TypeHintFrequency.Always,
            typeHint = "_typeHint")

    }
  }

object Main extends App {
 // type MyRecord = {val x: String} 
  //val hello = MyRecord("Hello Record")

  val model$ = DynamicClassLoader.loadClass("models.MyRecord$", MyRecord$Dump.dump()) //Load the module class
  val model  = DynamicClassLoader.loadClass("models.MyRecord", MyRecordDump.dump()) //Then load the class
  val ctor$  = model$.getConstructor()
  val instance$ = ctor$.newInstance()//Change Module$Dump <init> from PRIVATE to PUBLIC, else no method found

  //val instance$ = model$.newInstance()
  val apply$ = model$.getMethod("apply", classOf[String])
 // val hello =  apply$.invoke(instance$, "hello world").asInstanceOf[CaseClass]
  val hello =  apply$.invoke(instance$, "hello world").asInstanceOf[MyRec]
  
  //val dbo = grater[MyRec].asDBObject(hello)
 // println(dbo)

  //val obj = grater[MyRec].asObject(dbo)
  //println(obj)
}

