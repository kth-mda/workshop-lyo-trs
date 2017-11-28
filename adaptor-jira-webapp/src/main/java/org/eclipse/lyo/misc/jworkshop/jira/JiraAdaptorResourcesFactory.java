/*******************************************************************************
 * Copyright (c) 2017 Jad El-khoury.
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
 *     Jad El-khoury        - initial implementation
 *     
 *******************************************************************************/

package org.eclipse.lyo.misc.jworkshop.jira;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.misc.jworkshop.jira.resources.Person;
import org.eclipse.lyo.misc.jworkshop.jira.resources.ChangeRequest;
import org.eclipse.lyo.misc.jworkshop.jira.resources.Project;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class JiraAdaptorResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for ChangeRequest resource
    public static ChangeRequest createChangeRequest(final String serviceProviderId, final String changeRequestId)
           throws URISyntaxException
    {
        return new ChangeRequest(constructURIForChangeRequest(serviceProviderId, changeRequestId));
    }
    
    public static URI constructURIForChangeRequest(final String serviceProviderId, final String changeRequestId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("changeRequestId", changeRequestId);
        String instanceURI = "serviceProviders/{serviceProviderId}/service1/changeRequests/{changeRequestId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForChangeRequest(final String serviceProviderId, final String changeRequestId , final String label)
    {
        return new Link(constructURIForChangeRequest(serviceProviderId, changeRequestId), label);
    }
    
    public static Link constructLinkForChangeRequest(final String serviceProviderId, final String changeRequestId)
    {
        return new Link(constructURIForChangeRequest(serviceProviderId, changeRequestId));
    }
    

    //methods for Project resource
    public static Project createProject(final String serviceProviderId, final String projectId)
           throws URISyntaxException
    {
        return new Project(constructURIForProject(serviceProviderId, projectId));
    }
    
    public static URI constructURIForProject(final String serviceProviderId, final String projectId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("projectId", projectId);
        String instanceURI = "serviceProviders/{serviceProviderId}/service2/projects/{projectId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForProject(final String serviceProviderId, final String projectId , final String label)
    {
        return new Link(constructURIForProject(serviceProviderId, projectId), label);
    }
    
    public static Link constructLinkForProject(final String serviceProviderId, final String projectId)
    {
        return new Link(constructURIForProject(serviceProviderId, projectId));
    }
    

}
