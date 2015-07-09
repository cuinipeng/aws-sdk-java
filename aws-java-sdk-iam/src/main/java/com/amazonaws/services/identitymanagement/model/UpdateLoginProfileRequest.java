/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateLoginProfile(UpdateLoginProfileRequest) UpdateLoginProfile operation}.
 * <p>
 * Changes the password for the specified user.
 * </p>
 * <p>
 * Users can change their own passwords by calling ChangePassword. For
 * more information about modifying passwords, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateLoginProfile(UpdateLoginProfileRequest)
 */
public class UpdateLoginProfileRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the user whose password you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * The new password for the specified user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String password;

    /**
     * Require the specified user to set a new password on next sign-in.
     */
    private Boolean passwordResetRequired;

    /**
     * Default constructor for a new UpdateLoginProfileRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateLoginProfileRequest() {}
    
    /**
     * Constructs a new UpdateLoginProfileRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName The name of the user whose password you want to
     * update.
     */
    public UpdateLoginProfileRequest(String userName) {
        setUserName(userName);
    }

    /**
     * The name of the user whose password you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name of the user whose password you want to update.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the user whose password you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the user whose password you want to update.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the user whose password you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the user whose password you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateLoginProfileRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The new password for the specified user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The new password for the specified user.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The new password for the specified user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password The new password for the specified user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The new password for the specified user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password The new password for the specified user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateLoginProfileRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Require the specified user to set a new password on next sign-in.
     *
     * @return Require the specified user to set a new password on next sign-in.
     */
    public Boolean isPasswordResetRequired() {
        return passwordResetRequired;
    }
    
    /**
     * Require the specified user to set a new password on next sign-in.
     *
     * @param passwordResetRequired Require the specified user to set a new password on next sign-in.
     */
    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }
    
    /**
     * Require the specified user to set a new password on next sign-in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param passwordResetRequired Require the specified user to set a new password on next sign-in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateLoginProfileRequest withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    /**
     * Require the specified user to set a new password on next sign-in.
     *
     * @return Require the specified user to set a new password on next sign-in.
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (isPasswordResetRequired() != null) sb.append("PasswordResetRequired: " + isPasswordResetRequired() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((isPasswordResetRequired() == null) ? 0 : isPasswordResetRequired().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateLoginProfileRequest == false) return false;
        UpdateLoginProfileRequest other = (UpdateLoginProfileRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.isPasswordResetRequired() == null ^ this.isPasswordResetRequired() == null) return false;
        if (other.isPasswordResetRequired() != null && other.isPasswordResetRequired().equals(this.isPasswordResetRequired()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateLoginProfileRequest clone() {
        
            return (UpdateLoginProfileRequest) super.clone();
    }

}
    