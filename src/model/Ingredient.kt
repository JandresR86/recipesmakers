package recmodel

class Ingredient(var idCategory: Int) : ICSRecipe {

    private lateinit var ingredientsWater0: List<String>
    private lateinit var ingredientsLacteal1: List<String>
    private lateinit var ingredientsMeatLegumesEggs2: List<String>
    private lateinit var ingredientsFruits3: List<String>
    private lateinit var ingredientsVegetables4: List<String>
    private lateinit var ingredientsOils5: List<String>
    private lateinit var ingredientsCorns6: List<String>
    /**
     * Function to create the ingredients
     * */
    override fun create() {
        when(idCategory){

            1 -> ingredientsWater0 = listOf("Agua pura", "Agua Mineral")
            2 -> ingredientsLacteal1 = listOf("Leche", "Yogurt", "Queso", "Crema", "Quesillo")
            3 -> ingredientsMeatLegumesEggs2 = listOf("Carne", "Huevos", "Frijol", "Garbanzo", "Alfalfa")
            4 -> ingredientsFruits3 = listOf("Pera", "Uva", "Manzana", "Kiwi", "Fresa")
            5 -> ingredientsVegetables4 = listOf("Tomate", "Zanahoria", "Rabano", "Lechuga", "Coliflor")
            6 -> ingredientsOils5 = listOf("Aceite canola", "Aceite vegetal", "Aceite de coco")
            7 -> ingredientsCorns6 = listOf("Arroz", "Maiz", "Avena", "Trigo", "Arina")
        }
    }
    /**
     * Function to get an ingredient
     * @param position to get the name of the ingredient
     * @return String value
     * */
    fun getIngredientName(position: Int): String{

        var ingredient: String = ""

        when(idCategory){

            1-> ingredient = ingredientsWater0[position]
            2-> ingredient = ingredientsLacteal1[position]
            3-> ingredient = ingredientsMeatLegumesEggs2[position]
            4-> ingredient = ingredientsFruits3[position]
            5-> ingredient = ingredientsVegetables4[position]
            6-> ingredient = ingredientsOils5[position]
            7-> ingredient = ingredientsCorns6[position]
        }
        return ingredient
    }
    /**
     * Function to print ingredients
     * */
    override fun show() {

        var listIngredients = ""

        when(idCategory){

            1-> {
                for ((i, values) in ingredientsWater0.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            2-> {
                for ((i, values) in ingredientsLacteal1.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            3-> {
                for ((i, values) in ingredientsMeatLegumesEggs2.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            4-> {
                for ((i, values) in ingredientsFruits3.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            5-> {
                for ((i, values) in ingredientsVegetables4.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            6-> {
                for ((i, values) in ingredientsOils5.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }
            7-> {
                for ((i, values) in ingredientsCorns6.withIndex()){
                    listIngredients += "${i+1}-$values\n"
                }
            }else -> {listIngredients = "Valor no valido"}
        }
        println("Seleccione un ingrediente:\n${listIngredients}0-Salir")
    }
}