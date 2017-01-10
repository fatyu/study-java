package com.fatyu.annotation.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest {
	String s() default "ranker";

	String s1();
}
