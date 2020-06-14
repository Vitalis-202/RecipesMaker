fun main(args: Array<String>) {
    //variables
    val menu: String = """
        ::Bienvenido a Recipe Maker::
        
        Selecciona la opción deseada
        1. Hacer una receta.
        2. Ver mis recetas.
        3. Salir
    """.trimIndent()
    //Ejecución

    do{
        println(menu)
        val response:Int? = Integer.valueOf(readLine())

        when(response) {

            1 -> println("Has seleccionado la opción $response - Hacer una receta")
            2 -> println("Has seleccionado la opción $response - Ver mis recetas")
            3 -> ""
            else -> println("Escoja una opción válida de 1 a 3")

        }

    }while(response != 3)
    println("Muchas gracias por utilizar RecipesMaker")
}