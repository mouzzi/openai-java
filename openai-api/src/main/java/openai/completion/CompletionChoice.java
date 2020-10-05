package openai.completion;

import lombok.Data;

/**
 * A completion generated by GPT-3
 *
 * https://beta.openai.com/docs/api-reference/create-completion
 */
@Data
public class CompletionChoice {
    /**
     * The generated text. Will include the prompt if {@link CompletionRequest#echo } is true
     */
    String text;

    /**
     * This index of this completion in the returned list.
     */
    Integer index;
    // todo add logprobs

    /**
     * The reason why GPT-3 stopped generating, for example "length".
     */
    String finish_reason;
}
