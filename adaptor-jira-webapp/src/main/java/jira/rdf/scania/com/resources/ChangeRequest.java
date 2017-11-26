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
import jira.rdf.scania.com.JiraAdaptorConstants;
import jira.rdf.scania.com.resources.Person;
import jira.rdf.scania.com.resources.Project;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(JiraAdaptorConstants.OSLC_CM_NAMSPACE)
@OslcName(JiraAdaptorConstants.CHANGEREQUEST)
@OslcResourceShape(title = "Change Request Resource Shape", describes = JiraAdaptorConstants.TYPE_CHANGEREQUEST)
public class ChangeRequest
    extends AbstractResource
    implements IChangeRequest
{
    // Start of user code attributeAnnotation:identifier
    // End of user code
    private String identifier;
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:description
    // End of user code
    private String description;
    // Start of user code attributeAnnotation:creator
    // End of user code
    private Link creator = new Link();
    // Start of user code attributeAnnotation:created
    // End of user code
    private Date created;
    // Start of user code attributeAnnotation:project
    // End of user code
    private Link project = new Link();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ChangeRequest()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ChangeRequest(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public ChangeRequest(final String serviceProviderId, final String changeRequestId)
           throws URISyntaxException
    {
        this (constructURI(serviceProviderId, changeRequestId));
        // Start of user code constructor3
        // End of user code
    }
    
    public static URI constructURI(final String serviceProviderId, final String changeRequestId)
    {
        String basePath = ServletListener.getServicesBase();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("changeRequestId", changeRequestId);
        String instanceURI = "serviceProviders/{serviceProviderId}/service1/changeRequests/{changeRequestId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLink(final String serviceProviderId, final String changeRequestId , final String label)
    {
        return new Link(constructURI(serviceProviderId, changeRequestId), label);
    }
    
    public static Link constructLink(final String serviceProviderId, final String changeRequestId)
    {
        return new Link(constructURI(serviceProviderId, changeRequestId));
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getPublicURI(), 
        OslcConstants.PATH_RESOURCE_SHAPES, 
        JiraAdaptorConstants.PATH_CHANGEREQUEST,  
        ChangeRequest.class);
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
            result = result + "{a Local Change Request Resource} - update Change Request.toString() to present resource as desired.";
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
    
    
    // Start of user code getterAnnotation:identifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition(JiraAdaptorConstants.DUBLIN_CORE_NAMSPACE + "identifier")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier()
    {
        // Start of user code getterInit:identifier
        // End of user code
        return identifier;
    }
    
    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition(JiraAdaptorConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle()
    {
        // Start of user code getterInit:title
        // End of user code
        return title;
    }
    
    // Start of user code getterAnnotation:description
    // End of user code
    @OslcName("description")
    @OslcPropertyDefinition(JiraAdaptorConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription()
    {
        // Start of user code getterInit:description
        // End of user code
        return description;
    }
    
    // Start of user code getterAnnotation:creator
    // End of user code
    @OslcName("creator")
    @OslcPropertyDefinition(JiraAdaptorConstants.OSLC_CM_NAMSPACE + "creator")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({JiraAdaptorConstants.TYPE_PERSON})
    @OslcReadOnly(false)
    public Link getCreator()
    {
        // Start of user code getterInit:creator
        // End of user code
        return creator;
    }
    
    // Start of user code getterAnnotation:created
    // End of user code
    @OslcName("created")
    @OslcPropertyDefinition(JiraAdaptorConstants.DUBLIN_CORE_NAMSPACE + "created")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCreated()
    {
        // Start of user code getterInit:created
        // End of user code
        return created;
    }
    
    // Start of user code getterAnnotation:project
    // End of user code
    @OslcName("project")
    @OslcPropertyDefinition(JiraAdaptorConstants.OSLC_CM_NAMSPACE + "project")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({JiraAdaptorConstants.TYPE_PROJECT})
    @OslcReadOnly(false)
    public Link getProject()
    {
        // Start of user code getterInit:project
        // End of user code
        return project;
    }
    
    
    // Start of user code setterAnnotation:identifier
    // End of user code
    public void setIdentifier(final String identifier )
    {
        // Start of user code setterInit:identifier
        // End of user code
        this.identifier = identifier;
    
        // Start of user code setterFinalize:identifier
        // End of user code
    }
    
    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title )
    {
        // Start of user code setterInit:title
        // End of user code
        this.title = title;
    
        // Start of user code setterFinalize:title
        // End of user code
    }
    
    // Start of user code setterAnnotation:description
    // End of user code
    public void setDescription(final String description )
    {
        // Start of user code setterInit:description
        // End of user code
        this.description = description;
    
        // Start of user code setterFinalize:description
        // End of user code
    }
    
    // Start of user code setterAnnotation:creator
    // End of user code
    public void setCreator(final Link creator )
    {
        // Start of user code setterInit:creator
        // End of user code
        this.creator = creator;
    
        // Start of user code setterFinalize:creator
        // End of user code
    }
    
    // Start of user code setterAnnotation:created
    // End of user code
    public void setCreated(final Date created )
    {
        // Start of user code setterInit:created
        // End of user code
        this.created = created;
    
        // Start of user code setterFinalize:created
        // End of user code
    }
    
    // Start of user code setterAnnotation:project
    // End of user code
    public void setProject(final Link project )
    {
        // Start of user code setterInit:project
        // End of user code
        this.project = project;
    
        // Start of user code setterFinalize:project
        // End of user code
    }
    
    
    static public String identifierToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:identifierToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"identifier\">identifier: </LABEL>";
    
        // Start of user code "Mid:identifierToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"identifier\" type=\"text\" style=\"width: 400px\" id=\"identifier\" >";
        // Start of user code "Finalize:identifierToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String titleToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:titleToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"title\">title: </LABEL>";
    
        // Start of user code "Mid:titleToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"title\" type=\"text\" style=\"width: 400px\" id=\"title\" >";
        // Start of user code "Finalize:titleToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String descriptionToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"description\">description: </LABEL>";
    
        // Start of user code "Mid:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"description\" type=\"text\" style=\"width: 400px\" id=\"description\" >";
        // Start of user code "Finalize:descriptionToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String creatorToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:creatorToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"creator\">creator: </LABEL>";
    
        // Start of user code "Mid:creatorToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:creatorToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String createdToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:createdToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"created\">created: </LABEL>";
    
        // Start of user code "Mid:createdToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"created\" type=\"text\" style=\"width: 400px\" id=\"created\" >";
        // Start of user code "Finalize:createdToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String projectToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:projectToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"project\">project: </LABEL>";
    
        // Start of user code "Mid:projectToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:projectToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String identifierToHtml()
    {
        String s = "";
    
        // Start of user code identifiertoHtml_init
        // End of user code
    
        s = s + "<label for=\"identifier\"><strong>identifier</strong>: </LABEL>";
    
        // Start of user code identifiertoHtml_mid
        // End of user code
    
        try {
            if (identifier == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + identifier.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code identifiertoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String titleToHtml()
    {
        String s = "";
    
        // Start of user code titletoHtml_init
        // End of user code
    
        s = s + "<label for=\"title\"><strong>title</strong>: </LABEL>";
    
        // Start of user code titletoHtml_mid
        // End of user code
    
        try {
            if (title == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + title.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code titletoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String descriptionToHtml()
    {
        String s = "";
    
        // Start of user code descriptiontoHtml_init
        // End of user code
    
        s = s + "<label for=\"description\"><strong>description</strong>: </LABEL>";
    
        // Start of user code descriptiontoHtml_mid
        // End of user code
    
        try {
            if (description == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + description.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code descriptiontoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String creatorToHtml()
    {
        String s = "";
    
        // Start of user code creatortoHtml_init
        // End of user code
    
        s = s + "<label for=\"creator\"><strong>creator</strong>: </LABEL>";
    
        // Start of user code creatortoHtml_mid
        // End of user code
    
        try {
            s = s + (new Person (creator.getValue())).toHtml(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code creatortoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String createdToHtml()
    {
        String s = "";
    
        // Start of user code createdtoHtml_init
        // End of user code
    
        s = s + "<label for=\"created\"><strong>created</strong>: </LABEL>";
    
        // Start of user code createdtoHtml_mid
        // End of user code
    
        try {
            if (created == null) {
                s= s + "<em>null</em>";
            }
            else {
                s= s + created.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code createdtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String projectToHtml()
    {
        String s = "";
    
        // Start of user code projecttoHtml_init
        // End of user code
    
        s = s + "<label for=\"project\"><strong>project</strong>: </LABEL>";
    
        // Start of user code projecttoHtml_mid
        // End of user code
    
        try {
            s = s + (new Project (project.getValue())).toHtml(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code projecttoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
