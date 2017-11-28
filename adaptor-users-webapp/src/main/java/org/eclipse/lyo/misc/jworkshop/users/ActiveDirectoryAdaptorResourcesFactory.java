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

package org.eclipse.lyo.misc.jworkshop.users;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.misc.jworkshop.users.resources.Person;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class ActiveDirectoryAdaptorResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for Person resource
    public static Person createPerson(final String serviceProviderId, final String personId)
           throws URISyntaxException
    {
        return new Person(constructURIForPerson(serviceProviderId, personId));
    }
    
    public static URI constructURIForPerson(final String serviceProviderId, final String personId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);
        pathParameters.put("personId", personId);
        String instanceURI = "serviceProviders/{serviceProviderId}/persons/{personId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPerson(final String serviceProviderId, final String personId , final String label)
    {
        return new Link(constructURIForPerson(serviceProviderId, personId), label);
    }
    
    public static Link constructLinkForPerson(final String serviceProviderId, final String personId)
    {
        return new Link(constructURIForPerson(serviceProviderId, personId));
    }
    

}
