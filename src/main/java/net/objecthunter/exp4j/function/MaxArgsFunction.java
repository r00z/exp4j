package net.objecthunter.exp4j.function;

/**
 * A class representing a Function which can be used in an expression
 * This Class can be used to define functions with variable amount of arguments.
 * Maximum number of arguments is specified in the constructor
 */
public abstract class MaxArgsFunction extends Function {

    public MaxArgsFunction(String name) {
        super(name);
    }

    public MaxArgsFunction(String name, int maxNumArguments) {
        super(name, maxNumArguments);
    }
}
