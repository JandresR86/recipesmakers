package recipesmaker

fun main() {
    //viewRecipe()

    var option: String?
    var allRecips = ""
    var numRecetas = 0;
    var numDsiponibles = 3;
    val ingredients = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceites")
    
    val viewRecipes = {println("""
            Selecciona la opcion deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent())}

    val makeRecipe = {
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
            println("Selecciona ingredientes del 1-8 (Solo se permiten 3 recetas disponible: ${numDsiponibles})")
            println(printIngredients)
            option = readLine()
            when(option){
                "0" -> println()
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
        numDsiponibles--;
    }

    val printRecipes = {if(!allRecips.equals("")) println(allRecips) else println("No ha registrado recetas aun")}

    terminarRecetas@do {

        if(numDsiponibles==0) {
            printRecipes()
            break@terminarRecetas
        }

        viewRecipes()
        option = readLine()
        when(option){
            "1"-> makeRecipe()
            "2"-> printRecipes()
            "3"-> println("Adios")
            else -> println("Opcion no valida")
        }
    }while (!(option?.equals("3"))!!)
}
