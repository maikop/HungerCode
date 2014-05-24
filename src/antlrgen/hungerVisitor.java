// Generated from hunger.g4 by ANTLR 4.2.2
package antlrgen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hungerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hungerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hungerParser#litre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLitre(@NotNull hungerParser.LitreContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#newRecipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewRecipe(@NotNull hungerParser.NewRecipeContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#recipeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipeName(@NotNull hungerParser.RecipeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#omistamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmistamine(@NotNull hungerParser.OmistamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#lause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLause(@NotNull hungerParser.LauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#kilogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKilogram(@NotNull hungerParser.KilogramContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#defineerimine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineerimine(@NotNull hungerParser.DefineerimineContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#newFood}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFood(@NotNull hungerParser.NewFoodContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#kood}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKood(@NotNull hungerParser.KoodContext ctx);

	/**
	 * Visit a parse tree produced by {@link hungerParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(@NotNull hungerParser.PieceContext ctx);
}