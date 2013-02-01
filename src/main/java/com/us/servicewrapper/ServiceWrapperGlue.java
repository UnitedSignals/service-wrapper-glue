package com.us.servicewrapper;

import org.jruby.Ruby;

public class ServiceWrapperGlue {
    public static void main(String... argv) {
        Ruby ruby = Ruby.getGlobalRuntime();

        if (argv.length == 1 && "stop".equals(argv[0])) {
            ruby.tearDown(false);
        } else {
            throw new IllegalArgumentException("Usage: ServiceWrapperGlue <stop>");
        }
    }
}
