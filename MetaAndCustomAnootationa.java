package com.tns.kprit.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class MetaAndCustomAnootationa {

	public static void main(String[] args) throws Exception {
		Method method = MyService.class.getMethod("serve");
		if(method.isAnnotationPresent(Info.class)) {
			Info info = method.getAnnotation(Info.class);
			System.out.println("Author " + info.author());
			System.out.println("Date " + info.date());
			System.out.println("Version " + info.version());
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String author() default "Unknown";
    String date();
    int version() default 1;
}

class MyService {

    @Info(author = "Rohith", date = "2025-04-29", version = 2)
    public void serve() {
        System.out.println("Service method executed.");
    }
}
