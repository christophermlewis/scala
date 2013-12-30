class Person(val name: String) {
  def talk(message: String) = println(name + " says " + message)
  def id(): String = name
 }

 var person = new Person("Bond")
 person.talk("Bond, James Bond")

 class TalkativePerson(override val name: String) extends Person(name) {
  override def talk(message: String) {
    super.talk("blah blah blah")
    super.talk(message)
    super.talk("blah blah blah")
  }

 }

 val aPerson = new TalkativePerson("Simon")
 aPerson.talk("Jump")
 
