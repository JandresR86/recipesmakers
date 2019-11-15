package recmodel

class RecipeMaker(): ICSRecipe {

    private var listRecipes: MutableList<String> = mutableListOf()
    private var nameRecipe = " "
    override fun create() {

        println("Nombre de la receta:")

        nameRecipe = readLine().toString()
        val category = Category()
        category.create()
        var option:Int?

        loopCategory@do{

        category.show()
        var ingredient: Ingredient
        option = readLine()?.toInt()

            if(option == 10) break@loopCategory

        loop@ do {

            try {
                ingredient = Ingredient(option!!)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                ingredient = Ingredient(option!!)
                option = 0
            }
            var optionIngredient:Int?
            var cantIngredient:String?
            when (option) {//categories
                1 -> {//agua
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                   optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                2 -> {//lacteos
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        // 0 -> break@loop
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }
                        4 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(3))
                        }
                        5 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(4))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                3 -> {//carnes huevos legumbres
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }
                        4 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(3))
                        }
                        5 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(4))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                4 -> {//Frutas
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        // 0 -> break@loop
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }
                        4 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(3))
                        }
                        5 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(4))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                5 -> {//Vegetales
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        // 0 -> break@loop
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }
                        4 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(3))
                        }
                        5 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(4))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                6 -> {//Aceites
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        // 0 -> break@loop
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                7 -> {//Cereales
                    ingredient.create()
                    ingredient.show()

                    //select the ingredient
                    optionIngredient = readLine()?.toInt()
                    if(optionIngredient == 0) break@loop
                    println("Cantidad:")
                    cantIngredient = readLine()

                    when (optionIngredient!!) {//ingredients
                        // 0 -> break@loop
                        1 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(0))
                        }
                        2 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(1))
                        }
                        3 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(2))
                        }
                        4 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(3))
                        }
                        5 -> {
                            listRecipes.add(cantIngredient+" "+ingredient.getIngredientName(4))
                        }

                        else -> println("Opcion no valida: $optionIngredient dame otro numero de ingrediente")
                    }
                }
                else -> {
                    if(option == 10) break@loopCategory
                    println("Opcion no valida: $option dame otro numero cate")
                    option = readLine()?.toInt()
                }
            }
        } while (option != 0)
    }while (option != 10)

    }

    fun getRecipe(): Recipe? {
        if(listRecipes.size>0)
            return Recipe(nameRecipe, listRecipes)
        return null

    }

    override fun show() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}