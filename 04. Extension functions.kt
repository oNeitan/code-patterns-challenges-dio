fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""
    
    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()
    
    println("Slug gerado para o livro:")
    println("${slugTitulo}_$slugAutor")
   
}

fun String.generateSlug(): String {
      
 	val re = Regex("[^A-Za-z0-9\\s-]")
   
    //replace1: remove os caracteres especiais
    //replace2: substitui espaços em branco por hífem 
    return this.replace(re, "").replace(" ", "-").lowercase()
    
}