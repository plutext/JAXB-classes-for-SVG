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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2000/svg}SVG.feDiffuseLighting.content">
 *       &lt;attGroup ref="{http://www.w3.org/2000/svg}SVG.Core.attrib"/>
 *       &lt;attGroup ref="{http://www.w3.org/2000/svg}SVG.Style.attrib"/>
 *       &lt;attGroup ref="{http://www.w3.org/2000/svg}SVG.Color.attrib"/>
 *       &lt;attGroup ref="{http://www.w3.org/2000/svg}SVG.FilterPrimitiveWithIn.attrib"/>
 *       &lt;attGroup ref="{http://www.w3.org/2000/svg}SVG.FilterColor.attrib"/>
 *       &lt;attribute name="lighting-color" type="{http://www.w3.org/2000/svg}SVGColor.datatype" />
 *       &lt;attribute name="surfaceScale" type="{http://www.w3.org/2000/svg}Number.datatype" />
 *       &lt;attribute name="diffuseConstant" type="{http://www.w3.org/2000/svg}Number.datatype" />
 *       &lt;attribute name="kernelUnitLength" type="{http://www.w3.org/2000/svg}NumberOptionalNumber.datatype" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FeDiffuseLighting
    extends SVGFeDiffuseLightingContent
{

    @XmlAttribute(name = "lighting-color")
    protected String lightingColor;
    @XmlAttribute
    protected String surfaceScale;
    @XmlAttribute
    protected String diffuseConstant;
    @XmlAttribute
    protected String kernelUnitLength;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String base;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;
    @XmlAttribute
    protected String style;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "color-interpolation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolation;
    @XmlAttribute(name = "color-rendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorRendering;
    @XmlAttribute
    protected String color;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String in;
    @XmlAttribute
    protected String x;
    @XmlAttribute
    protected String y;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String result;
    @XmlAttribute(name = "color-interpolation-filters")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolationFilters;

    /**
     * Gets the value of the lightingColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightingColor() {
        return lightingColor;
    }

    /**
     * Sets the value of the lightingColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightingColor(String value) {
        this.lightingColor = value;
    }

    /**
     * Gets the value of the surfaceScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceScale() {
        return surfaceScale;
    }

    /**
     * Sets the value of the surfaceScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceScale(String value) {
        this.surfaceScale = value;
    }

    /**
     * Gets the value of the diffuseConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffuseConstant() {
        return diffuseConstant;
    }

    /**
     * Sets the value of the diffuseConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffuseConstant(String value) {
        this.diffuseConstant = value;
    }

    /**
     * Gets the value of the kernelUnitLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKernelUnitLength() {
        return kernelUnitLength;
    }

    /**
     * Sets the value of the kernelUnitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKernelUnitLength(String value) {
        this.kernelUnitLength = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the colorInterpolation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInterpolation() {
        return colorInterpolation;
    }

    /**
     * Sets the value of the colorInterpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInterpolation(String value) {
        this.colorInterpolation = value;
    }

    /**
     * Gets the value of the colorRendering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorRendering() {
        return colorRendering;
    }

    /**
     * Sets the value of the colorRendering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRendering(String value) {
        this.colorRendering = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn(String value) {
        this.in = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the colorInterpolationFilters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInterpolationFilters() {
        return colorInterpolationFilters;
    }

    /**
     * Sets the value of the colorInterpolationFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInterpolationFilters(String value) {
        this.colorInterpolationFilters = value;
    }

}
