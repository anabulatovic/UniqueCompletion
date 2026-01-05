package filter;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

public class UniqueCompletionContributor extends CompletionContributor {

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {

        // Find if the caret is currently inside a method all's argument list
        PsiExpressionList argumentList = PsiTreeUtil.getParentOfType(parameters.getPosition(), PsiExpressionList.Class);

        if (argumentList != null) {
            // Collect all existing variable names already in the list
            Set<String> existingItems = new HashSet<>();

            for (PsiExpression expression : argumentList.getExpressions()) {
                // We use getText() to get the name of the variable/constant
                String text = expression.getText();

                if (text != null && !text.isEmpty()) {
                    existingItems.add(text);
                }
            }

            // 'runRemainingContributors' lets the standard Java completion run first

            result.runRemainingContributors(parameters, completionResult -> {
                LookupElement element = completionResult.getLookupElement();
                String suggestion = element.getLookupString();

                // If the suggested variable is already in the 'existingItems' set, we don't pass it to the result.
                if (!existingItems.contains(suggestion)) {
                    result.passResult(completionResult);
                }
            });
        }
    }
    
}
