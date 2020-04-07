package net.objecthunter.exp4j.function;

/**
 * A class representing a Function which can be used in an expression
 * This Class can be used to define functions with variable amount of arguments.
 * Maximum and minimum number of arguments is specified in the constructor
 */
public abstract class MaxArgsFunction extends Function {
    public static final int DEFAULT_MIN_NUM_ARGUMENTS = 2;
    public static final int DEFAULT_MAX_NUM_ARGUMENTS = 10;
    protected final int minNumArguments;

    public MaxArgsFunction(String name) {
        this(name, DEFAULT_MAX_NUM_ARGUMENTS, DEFAULT_MIN_NUM_ARGUMENTS);
    }

    public MaxArgsFunction(String name, int maxNumArguments) {
        this(name, maxNumArguments, DEFAULT_MIN_NUM_ARGUMENTS);
    }

    public MaxArgsFunction(String name, int maxNumArguments, int minNumArguments) {
        super(name, maxNumArguments);
        this.minNumArguments = minNumArguments;
    }

    public int getMinNumArguments() {
        return minNumArguments;
    }

    public int getMaxNumArguments() {
        return numArguments;
    }
}
