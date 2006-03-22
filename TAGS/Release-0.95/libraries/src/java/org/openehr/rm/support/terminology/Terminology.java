/*
 * component:   "openEHR Reference Implementation"
 * description: "Class Terminology"
 * keywords:    "support"
 *
 * author:      "Rong Chen <rong@acode.se>"
 * support:     "Acode HB <support@acode.se>"
 * copyright:   "Copyright (c) 2004 Acode HB, Sweden"
 * license:     "See notice at bottom of class"
 *
 * file:        "$URL$"
 * revision:    "$LastChangedRevision$"
 * last_change: "$LastChangedDate$"
 */
package org.openehr.rm.support.terminology;

import org.openehr.rm.datatypes.text.CodePhrase;

import java.util.Set;

/**
 * Defines an interface to access a terminology
 *
 * @author Rong Chen
 * @version 1.0
 */
public interface Terminology {

    /**
     * Returns identification of this terminology
     *
     * @return ID not null or empty
     */
    public String id();

    /**
     * Returns all codes known in this terminology
     *
     * @return Set of DvCodePhrase
     */
    public Set<CodePhrase> allCodes();

    /**
     * Returns all codes under grouper groupID of this terminology
     *
     * @param groupID
     * @return Set of CodePhrase for given group ID, empty set
     *         returned if not found
     * @throws IllegalArgumentException if groupID null or empty
     */
    public Set<CodePhrase> codesForGroupID(String groupID);

    /**
     * Return all codes under grouper whose name of given
     * name and language from this terminology.
     *
     * @param name
     * @param language
     * @return Set of CodePhrase for given group name,
     *         empty set returned if not found
     * @throws IllegalArgumentException if name,language null or empty
     */
    public Set<CodePhrase> codesForGroupName(String name, String language);

    /**
     * Returns all rubric of given code and language
     *
     * @param code
     * @param language
     * @return rubric of given code and language or null if not found
     * @throws IllegalArgumentException if code,language null or empty
     */
    public String rubricForCode(String code, String language);

    /**
     * Return true if the code is under grouper of given name
     * and language
     *
     * @param code
     * @param name
     * @param language
     * @return true if the code exists
     * @throws IllegalArgumentException if code or name or language
     *                                  null
     */
    public boolean hasCodeForGroupName(CodePhrase code, String name,
                                       String language);
}
/*
 *  ***** BEGIN LICENSE BLOCK *****
 *  Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 *  The contents of this file are subject to the Mozilla Public License Version
 *  1.1 (the 'License'); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *  http://www.mozilla.org/MPL/
 *
 *  Software distributed under the License is distributed on an 'AS IS' basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 *  for the specific language governing rights and limitations under the
 *  License.
 *
 *  The Original Code is Terminology.java
 *
 *  The Initial Developer of the Original Code is Rong Chen.
 *  Portions created by the Initial Developer are Copyright (C) 2003-2004
 *  the Initial Developer. All Rights Reserved.
 *
 *  Contributor(s):
 *
 * Software distributed under the License is distributed on an 'AS IS' basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 *  ***** END LICENSE BLOCK *****
 */