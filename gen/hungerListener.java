// Generated from C:/Users/Anna/IdeaProjects/HungerCode/grammar\hunger.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hungerParser}.
 */
public interface hungerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hungerParser#litre}.
	 * @param ctx the parse tree
	 */
	void enterLitre(@NotNull hungerParser.LitreContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#litre}.
	 * @param ctx the parse tree
	 */
	void exitLitre(@NotNull hungerParser.LitreContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#newRecipe}.
	 * @param ctx the parse tree
	 */
	void enterNewRecipe(@NotNull hungerParser.NewRecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#newRecipe}.
	 * @param ctx the parse tree
	 */
	void exitNewRecipe(@NotNull hungerParser.NewRecipeContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#recipeName}.
	 * @param ctx the parse tree
	 */
	void enterRecipeName(@NotNull hungerParser.RecipeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#recipeName}.
	 * @param ctx the parse tree
	 */
	void exitRecipeName(@NotNull hungerParser.RecipeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#omistamine}.
	 * @param ctx the parse tree
	 */
	void enterOmistamine(@NotNull hungerParser.OmistamineContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#omistamine}.
	 * @param ctx the parse tree
	 */
	void exitOmistamine(@NotNull hungerParser.OmistamineContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#lause}.
	 * @param ctx the parse tree
	 */
	void enterLause(@NotNull hungerParser.LauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#lause}.
	 * @param ctx the parse tree
	 */
	void exitLause(@NotNull hungerParser.LauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#kilogram}.
	 * @param ctx the parse tree
	 */
	void enterKilogram(@NotNull hungerParser.KilogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#kilogram}.
	 * @param ctx the parse tree
	 */
	void exitKilogram(@NotNull hungerParser.KilogramContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#defineerimine}.
	 * @param ctx the parse tree
	 */
	void enterDefineerimine(@NotNull hungerParser.DefineerimineContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#defineerimine}.
	 * @param ctx the parse tree
	 */
	void exitDefineerimine(@NotNull hungerParser.DefineerimineContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#newFood}.
	 * @param ctx the parse tree
	 */
	void enterNewFood(@NotNull hungerParser.NewFoodContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#newFood}.
	 * @param ctx the parse tree
	 */
	void exitNewFood(@NotNull hungerParser.NewFoodContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#kood}.
	 * @param ctx the parse tree
	 */
	void enterKood(@NotNull hungerParser.KoodContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#kood}.
	 * @param ctx the parse tree
	 */
	void exitKood(@NotNull hungerParser.KoodContext ctx);

	/**
	 * Enter a parse tree produced by {@link hungerParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(@NotNull hungerParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link hungerParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(@NotNull hungerParser.PieceContext ctx);
}