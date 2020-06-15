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

    val ingredientes = arrayListOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    do{
        println(menu)
        val response:Int? = Integer.valueOf(readLine())

        when(response) {

            1 -> makeRecipe()
            2 -> viewRecipe()
            3 -> ""
            else -> println("Escoja una opción válida de 1 a 3")

        }

    }while(response != 3)
    println("Muchas gracias por utilizar RecipesMaker")
}

fun makeRecipe(){
    val menu2:String = """
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
    """.trimIndent()
    println(menu2)
}
fun viewRecipe(){
    val menu3:String = """
        Ver mis recetas
    """.trimIndent()
    println(menu3)

}