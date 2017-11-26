/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package jira.rdf.scania.com.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import jira.rdf.scania.com.servlet.ServletListener;
import jira.rdf.scania.com.ActiveDirectoryAdaptorConstants;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(ActiveDirectoryAdaptorConstants.FOAF_NAMSPACE)
@OslcName(ActiveDirectoryAdaptorConstants.PERSON)
@OslcResourceShape(title = "Person Resource Shape", describes = ActiveDirectoryAdaptorConstants.TYPE_PERSON)
public class Person
    extends AbstractResource
    implements IPerson
{
    // Start of user code attributeAnnotation:name
    // End of user code
    private String name;
    // Start of user code attributeAnnotation:givenName
    // End of user code
    private String givenName;
    // Start of user code attributeAnnotation:familyName
    // End of user code
    private String familyName;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Person()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Person(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public Person(final String serviceProviderId, final String personId)
           throws URISyntaxException
    {
        this (constructURI(serviceProviderId, personId));
        // Start of user code constructor3
        // End of user code
    }
    
    public static URI constructURI(final String serviceProviderId, final String personId)
    {
        String basePath = ServletListener.getServicesBase();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("personId", personId);
        String instanceURI = "serviceProviders/{serviceProviderId}/persons/{personId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLink(final String serviceProviderId, final String personId , final String label)
    {
        return new Link(constructURI(serviceProviderId, personId), label);
    }
    
    public static Link constructLink(final String serviceProviderId, final String personId)
    {
        return new Link(constructURI(serviceProviderId, personId));
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getPublicURI(), 
        OslcConstants.PATH_RESOURCE_SHAPES, 
        ActiveDirectoryAdaptorConstants.PATH_PERSON,  
        Person.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Person Resource} - update Person.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:name
    // End of user code
    @OslcName("name")
    @OslcPropertyDefinition(ActiveDirectoryAdaptorConstants.FOAF_NAMSPACE + "name")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getName()
    {
        // Start of user code getterInit:name
        // End of user code
        return name;
    }
    
    // Start of user code getterAnnotation:givenName
    // End of user code
    @OslcName("givenName")
    @OslcPropertyDefinition(ActiveDirectoryAdaptorConstants.FOAF_NAMSPACE + "givenName")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getGivenName()
    {
        // Start of user code getterInit:givenName
        // End of user code
        return givenName;
    }
    
    // Start of user code getterAnnotation:familyName
    // End of user code
    @OslcName("familyName")
    @OslcPropertyDefinition(ActiveDirectoryAdaptorConstants.FOAF_NAMSPACE + "familyName")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getFamilyName()
    {
        // Start of user code getterInit:familyName
        // End of user code
        return familyName;
    }
    
    
    // Start of user code setterAnnotation:name
    // End of user code
    public void setName(final String name )
    {
        // Start of user code setterInit:name
        // End of user code
        this.name = name;
    
        // Start of user code setterFinalize:name
        // End of user code
    }
    
    // Start of user code setterAnnotation:givenName
    // End of user code
    public void setGivenName(final String givenName )
    {
        // Start of user code setterInit:givenName
        // End of user code
        this.givenName = givenName;
    
        // Start of user code setterFinalize:givenName
        // End of user code
    }
    
    // Start of user code setterAnnotation:familyName
    // End of user code
    public void setFamilyName(final String familyName )
    {
        // Start of user code setterInit:familyName
        // End of user code
        this.familyName = familyName;
    
        // Start of user code setterFinalize:familyName
        // End of user code
    }
    
    
    static public String nameToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:nameToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"name\">name: </LABEL>";
    
        // Start of user code "Mid:nameToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"name\" type=\"text\" style=\"width: 400px\" id=\"name\" >";
        // Start of user code "Finalize:nameToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String givenNameToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:givenNameToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"givenName\">givenName: </LABEL>";
    
        // Start of user code "Mid:givenNameToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"givenName\" type=\"text\" style=\"width: 400px\" id=\"givenName\" >";
        // Start of user code "Finalize:givenNameToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String familyNameToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:familyNameToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"familyName\">familyName: </LABEL>";
    
        // Start of user code "Mid:familyNameToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"familyName\" type=\"text\" style=\"width: 400px\" id=\"familyName\" >";
        // Start of user code "Finalize:familyNameToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String nameToHtml()
    {
        String s = "";
    
        // Start of user code nametoHtml_init
        // End of user code
    
        s = s + "<label for=\"name\"><strong>name</strong>: </LABEL>";
    
        // Start of user code nametoHtml_mid
        // End of user code
    
        try {
            if (name == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + name.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code nametoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String givenNameToHtml()
    {
        String s = "";
    
        // Start of user code givenNametoHtml_init
        // End of user code
    
        s = s + "<label for=\"givenName\"><strong>givenName</strong>: </LABEL>";
    
        // Start of user code givenNametoHtml_mid
        // End of user code
    
        try {
            if (givenName == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + givenName.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code givenNametoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String familyNameToHtml()
    {
        String s = "";
    
        // Start of user code familyNametoHtml_init
        // End of user code
    
        s = s + "<label for=\"familyName\"><strong>familyName</strong>: </LABEL>";
    
        // Start of user code familyNametoHtml_mid
        // End of user code
    
        try {
            if (familyName == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + familyName.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code familyNametoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
