package br.com.academiadev.financeiro.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Util {

    public static <E> List<E> toList(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }
}
