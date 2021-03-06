package org.scalalabs.advanced.lab03

import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert._

/**
 * See @ImplicitExercise
 */

class ImplicitExerciseTest extends JUnitSuite {

  @Test
  def addUsingVarargsAndScalaNumeric = {
    import AddUsingVarargsAndScalaNumeric._

    assertEquals(150, add(10, 20, 30, 40, 50))
    assertTrue(add(10, 20, 30, 40, 50).isInstanceOf[Int])

    assertEquals(150L, add(10L, 20L, 30L, 40L, 50L))
    assertTrue(add(10L, 20L, 30L, 40L, 50L).isInstanceOf[Long])
  }

  @Test
  def shouldAddIntsAndStrings = {
    // TODO uncomment the following lines, and make them work by implementing some implicit magic in the Monoid object 
    // import AddableList._
    // assertEquals(10, add(List(1, 2, 3, 4)))
    // assertEquals("1234", add(List("1", "2", "3", "4")))
  }

  @Test
  def nicerAddIntsAndStrings = {
    // TODO uncomment the following lines, and make them work by implementing some implicit magic in the AddableList object
    // import AddableList._
    // assertEquals(10, List(1, 2, 3, 4) add)
    // assertEquals("1234", List("1", "2", "3", "4") add)
  }

  @Test
  def shouldOrderUsingImplicitOrd = {
    // TODO uncomment and make the follow lines work by implementing some implicit magic in the Ord trait and object, defined within the OrdExercise object
    // import OrdExercise._
    // assertEquals(20, Ord[Int] max (List(10, 20, 3, 4, 5)) )
    // assertEquals(3, Ord[Int] min (List(10, 20, 3, 4, 5)) )
    // 
    // assertEquals("brown", Ord[String] min (List("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")) )
    // assertEquals("the", Ord[String] max (List("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")) )
    // 
    // 
    // assertEquals("A", Ord[Int].minFor[String](List("A", "sentence", "of", "various", "lengths"),(t => t.length)))
    // assertEquals("sentence", Ord[Int].maxFor[String](List("A", "sentence", "of", "various", "lengths"),(t => t.length)))
  }

  @Test
  def useEvenMoreAwesomeImplicitsAndTypesForOrderingLists = {
    // TODO uncomment and make the follow lines work by implementing some implicit magic in the Ord trait and object, defined within the OrdExercise object
    // import ListToPimpedList._
    // assertEquals(20, List(10, 20, 3, 4, 5) mymax )
    // assertEquals(3, List(10, 20, 3, 4, 5) mymin )
    // 
    // assertEquals("jumped", List("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog") mymax Ord[Int].on[String](t => t.length))
    // assertEquals("the", List("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog") mymin Ord[Int].on[String](t => t.length))
  }

  @Test
  def aSimpleMonadIllustration = {
    // TODO uncomment the following lines, and make them work by implementing some implicit magic in the Monads object
    // import Monads._
    // 
    // assertEquals(none, just(3) bind (x => if (x % 2 == 0) just(x - 1) else none))
    // assertEquals(just(3), just(4) bind (x => if (x % 2 == 0) just(x - 1) else none))
    // assertEquals(just(7), just(4) bind (x => just(x+1)) bind (x =>just(x+2)))
    // assertEquals(none, just(4) bind (x => just(x+1)) bind (x => just(x+2)) bind (x => none))
    // 
    // assertEquals(List(1), inject[List, Int](1))
    // assertEquals(Just("Scala is great"), inject[Maybe, String]("Scala") bind (x => just(x + " is great")))
    // 
    // assertEquals(List(3), List(1) bind (x => List(x+2)))
    // assertEquals(List('T', 'h', 'e', 'q', 'u', 'i', 'c', 'k', 'b', 'r', 'o', 'w', 'n', 'f', 'o', 'x'), List("The", "quick", "brown", "fox") bind (x => x.toList))
  }
}
