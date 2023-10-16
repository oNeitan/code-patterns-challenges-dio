class User(val id Int = 0, val name String)
 
  No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
  é uma maneira concisa e eficaz de implementar o padrão Singleton.
 
object UserManager {

  private val users = mutableListOfUser()

  fun addUser(name String) {
    	val id = users.size +1
        val genUser = User(id, name)
        users.add(genUser)
            TODO Inplementar a lógica de adicionar um novo Usuário na lista users.
    Dica Utilize o tamanho da lista users para gerar seus IDs.
  }

  fun listUsers() {
      
    for(us in users) {
        println(${us.id} - ${us.name})
    }
    TODO Inplementar a impressãolistagem dos users, seguindo o padrão definido no enunciado.
  }
}

fun main() {
    
  val quantity = readLine().toIntOrNull()  0

  for (i in 1..quantity) {
    val name = readLine()  
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}