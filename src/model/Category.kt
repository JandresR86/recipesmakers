package recmodel

class Category : ICSRecipe {
    /**
     * Function to create the categories
     * */
    private lateinit var categories: List<String>
    //private var id: Int = 0

    override fun create() {
        categories = listOf("AGUA", "LACTEOS", "CARNES LEGUMBRES Y HUEVOS", "FRUTAS", "VERDURAS", "ACEITE", "GRANOS")
    }
    /**
     * Function to print categories
     * */
    override fun show() {
        var listIngredients = ""

        for ((i, values) in categories.withIndex()){
            listIngredients += "${i+1}-$values\n"
        }
        println("Seleccione una categoria:\n${listIngredients}10-SALIR")
    }
}