package com.us.servicewrapper;

import org.jruby.Ruby;

import static java.lang.String.format;

public class ServiceWrapperGlue {
    public static void main(String... argv) {
        Ruby ruby = Ruby.getGlobalRuntime();

        if (argv.length == 2 && "stop".equals(argv[0])) {
            ruby.evalScriptlet(format("%s.instance.stop", argv[1]));
        } else {
            throw new IllegalArgumentException("Incorrect usage!");
        }
    }
}
