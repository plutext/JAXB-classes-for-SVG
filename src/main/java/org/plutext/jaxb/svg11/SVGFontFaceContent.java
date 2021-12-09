/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.plutext.jaxb.svg11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SVG.font-face.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SVG.font-face.content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/svg}SVG.Description.class" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/svg}font-face-src" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/svg}definition-src" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SVG.font-face.content", propOrder = {
    "svgDescriptionClass",
    "fontFaceSrc",
    "definitionSrc"
})
public class SVGFontFaceContent {

    @XmlElementRef(name = "SVG.Description.class", namespace = "http://www.w3.org/2000/svg", type = JAXBElement.class)
    protected List<JAXBElement<?>> svgDescriptionClass;
    @XmlElement(name = "font-face-src")
    protected FontFaceSrc fontFaceSrc;
    @XmlElement(name = "definition-src")
    protected DefinitionSrc definitionSrc;

    /**
     * Gets the value of the svgDescriptionClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svgDescriptionClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSVGDescriptionClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Desc }{@code >}
     * {@link JAXBElement }{@code <}{@link Metadata }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Title }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSVGDescriptionClass() {
        if (svgDescriptionClass == null) {
            svgDescriptionClass = new ArrayList<JAXBElement<?>>();
        }
        return this.svgDescriptionClass;
    }

    /**
     * Gets the value of the fontFaceSrc property.
     * 
     * @return
     *     possible object is
     *     {@link FontFaceSrc }
     *     
     */
    public FontFaceSrc getFontFaceSrc() {
        return fontFaceSrc;
    }

    /**
     * Sets the value of the fontFaceSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFaceSrc }
     *     
     */
    public void setFontFaceSrc(FontFaceSrc value) {
        this.fontFaceSrc = value;
    }

    /**
     * Gets the value of the definitionSrc property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionSrc }
     *     
     */
    public DefinitionSrc getDefinitionSrc() {
        return definitionSrc;
    }

    /**
     * Sets the value of the definitionSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionSrc }
     *     
     */
    public void setDefinitionSrc(DefinitionSrc value) {
        this.definitionSrc = value;
    }

}
