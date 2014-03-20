package com.offke.core.common.util;

import org.dom4j.Element;

import java.util.LinkedList;
import java.util.List;

public class XpathUtis {
    public static List<String> xpathToList(Element element, String xpath) {
        List<String> rets = new LinkedList<String>();
        List<Element> lrl_elem = element.selectNodes(xpath);
        if (lrl_elem == null || lrl_elem.isEmpty()) {
            return null;
        }

        for (Element elem : lrl_elem) {
            rets.add(elem.getTextTrim());
        }

        return rets;

    }
}
