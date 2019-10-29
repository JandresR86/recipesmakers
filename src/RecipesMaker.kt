package recipesmaker

fun main() {
    var option: String?
    var allRecips = ""
    var numRecetas = 0;
    val ingredients = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceites")

    do {
        println("""
            Selecciona la opcion deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent())

        option = readLine()

        when(option){
            "1"->{
                numRecetas++;
                allRecips += "Receta #$numRecetas\n------------\n"
                do{
                    var printIngredients = "0. Salir "
                    for((index, ing) in ingredients.withIndex()){
                        printIngredients += """
                        ${index+1}. $ing    
                        """.trimIndent()
                    }
                    //2-Seleccionar los ingredients
                    println("Selecciona (1-8) los ingredients para la receta")
                    println(printIngredients)
                    option = readLine()
                    when(option){
                        "1" -> allRecips += "+${ingredients[0]}\n"
                        "2" -> allRecips += "+${ingredients[1]}\n"
                        "3" -> allRecips += "+${ingredients[2]}\n"
                        "4" -> allRecips += "+${ingredients[3]}\n"
                        "5" -> allRecips += "+${ingredients[4]}\n"
                        "6" -> allRecips += "+${ingredients[5]}\n"
                        "7" -> allRecips += "+${ingredients[6]}\n"
                        "8" -> allRecips += "+${ingredients[7]}\n"
                        else -> println("Opcion no valida")
                    }
                }while (!(option.equals("0")))
                allRecips +="------------\n"
            }
            "2"-> {
                    if(allRecips.equals(""))
                        println("No hay recetas aun")
                    else
                        println(allRecips)  }
            "3"-> println("Adios")
            else -> println("Opcion no valida")
        }
    }while (!(option?.equals("3"))!!)
}