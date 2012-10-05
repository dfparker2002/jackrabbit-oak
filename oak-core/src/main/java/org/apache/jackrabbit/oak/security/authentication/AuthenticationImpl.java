/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.oak.security.authentication;

import java.security.Principal;
import java.util.Set;
import javax.jcr.Credentials;
import javax.jcr.GuestCredentials;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.oak.api.Tree;
import org.apache.jackrabbit.oak.spi.security.authentication.Authentication;
import org.apache.jackrabbit.oak.spi.security.user.PasswordUtility;
import org.apache.jackrabbit.oak.spi.security.user.UserProvider;

/**
 * AuthenticationImpl...
 */
public class AuthenticationImpl implements Authentication {

    private final String userID;
    private final UserProvider userProvider;

    public AuthenticationImpl(String userID, UserProvider userProvider) {
        this.userID = userID;
        this.userProvider = userProvider;
    }

    @Override
    public boolean authenticate(Credentials credentials) {
        // TODO
        return true;

//        if (userProvider == null || userID == null) {
//            return false;
//        }
//
//        if (credentials instanceof SimpleCredentials) {
//            SimpleCredentials creds = (SimpleCredentials) credentials;
//            return userID.equals(creds.getUserID()) &&
//                    PasswordUtility.isSame(userProvider.getPassword(userID), creds.getPassword());
//        } else if (credentials instanceof GuestCredentials) {
//            return userProvider.getAuthorizable(userID) != null;
//        } else {
//            // unsupported credentials object
//            return false;
//        }
    }

    @Override
    public boolean impersonate(Set<Principal> principals) {
        // TODO
        return true;
    }
}