package org.jenkinsci.plugins.testrail.JunitResults;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author jrichardson
 */
public class JunitError {
    private String type;
    private String message;
    private String text;

    @XmlAttribute
    public void setType(String type) {this.type = type; }
    @XmlAttribute
    public void setMessage(String message) {this.message = message; }
    @XmlValue
    public void setText(String text) {this.text = text; }

    public String getType() { return this.type; }
    public String getMessage() { return this.message; }
    public String getText() { return this.text; }
}
