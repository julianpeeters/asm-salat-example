package models
import scala.language.dynamics

trait DynamicBase extends Dynamic
//case class MyRecord(x: String) 
case class MyRecord(x: String) extends DynamicBase
