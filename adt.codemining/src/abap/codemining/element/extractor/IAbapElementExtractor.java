package abap.codemining.element.extractor;

import abap.codemining.element.domain.IAbapElement;

public interface IAbapElementExtractor {

	String ELEMENT_NAME_REGEX = "([\\w|~|\\/]+)";

	IAbapElement extractFromLine(String line, int linenumber);
}
