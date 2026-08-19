package lesson_11

class RecipeCategory {
    var title = ""
    var description = ""
    var image = ""
    val recipeList = mutableListOf<Recipe>()
    fun addRecipe(newRecipe: Recipe) {
        recipeList.add(newRecipe)
    }
    fun removeRecipe(recipeToRemove: Recipe) {
        recipeList.remove(recipeToRemove)
    }
    fun changeTitle(newTitle: String) {
        title = newTitle
    }
    fun changeDescription(newDescription: String) {
        description = newDescription
    }
    fun changeImage(newImage: String) {
        image = newImage
    }
}

class Recipe {
    var title = ""
    var image = ""
    val ingredientList = mutableListOf<Ingredient>()
    var ingredientCount = ingredientList.size
    var recipeText = ""
    fun addIngredient(newIngredient: Ingredient) {
        ingredientList.add(newIngredient)
    }
    fun removeIngredient(ingredientToRemove: Ingredient) {
        ingredientList.remove(ingredientToRemove)
    }
    fun changeTitle(newTitle: String) {
        title = newTitle
    }
    fun changeImage(newImage: String) {
        image = newImage
    }
    fun changeRecipeText(newRecipeText: String) {
        recipeText = newRecipeText
    }
}

class Ingredient {
    var title = ""
    var count = 0
    fun changeTitle(newTitle: String) {
        title = newTitle
    }
    fun changeCount(newCount: Int) {
        count = newCount
    }
}

