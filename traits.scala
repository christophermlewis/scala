class Person(val name: String)

trait Jedi {
  def depart() = println("may the force be with you")
}

class Character(override val name: String) extends Person(name) with Jedi

val theJedi = new Character("Luke")
theJedi.depart
