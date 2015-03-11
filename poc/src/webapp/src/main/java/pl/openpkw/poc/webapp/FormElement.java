package pl.openpkw.poc.webapp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FormElement {
	int page();
	int x();
	int y();
}
