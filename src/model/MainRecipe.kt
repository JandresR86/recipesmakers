package recmodel

fun main() {

    principalMenu()
}

fun principalMenu(){
    val allRecipesArray = arrayListOf<Recipe?>()
    val menu = {println("""
            Selecciona la opcion deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent())}

    var option:Int?
    do{
        menu()
        option = readLine()?.toInt()
        when(option){
            1 -> {
                val recipe = RecipeMaker()
                recipe.create()
                allRecipesArray.add(recipe.getRecipe())
            }
            2 -> {

                if(allRecipesArray.size == 0){
                    println("No hay recetas aun")
                    //menu()
                }else{
                    println("Tienes ${allRecipesArray.size} recetas")
                    for(recipes in allRecipesArray){
                        println(recipes!!.nameRecipe)
                        println("------------------")
                        for (listado in recipes.listIngredients){
                            println("+ $listado")
                        }
                        println("******************")
                    }
                    println()
                }
            }
            3 -> println("Adios")
        }
    }while (option!=3)
}