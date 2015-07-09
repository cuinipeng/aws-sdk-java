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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteGroupPolicy(DeleteGroupPolicyRequest) DeleteGroupPolicy operation}.
 * <p>
 * Deletes the specified inline policy that is embedded in the specified
 * group.
 * </p>
 * <p>
 * A group can also have managed policies attached to it. To detach a
 * managed policy from a group, use DetachGroupPolicy. For more
 * information about policies, refer to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteGroupPolicy(DeleteGroupPolicyRequest)
 */
public class DeleteGroupPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name (friendly name, not ARN) identifying the group that the
     * policy is embedded in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String groupName;

    /**
     * The name identifying the policy document to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * Default constructor for a new DeleteGroupPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteGroupPolicyRequest() {}
    
    /**
     * Constructs a new DeleteGroupPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name (friendly name, not ARN) identifying the
     * group that the policy is embedded in.
     * @param policyName The name identifying the policy document to delete.
     */
    public DeleteGroupPolicyRequest(String groupName, String policyName) {
        setGroupName(groupName);
        setPolicyName(policyName);
    }

    /**
     * The name (friendly name, not ARN) identifying the group that the
     * policy is embedded in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name (friendly name, not ARN) identifying the group that the
     *         policy is embedded in.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name (friendly name, not ARN) identifying the group that the
     * policy is embedded in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param groupName The name (friendly name, not ARN) identifying the group that the
     *         policy is embedded in.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name (friendly name, not ARN) identifying the group that the
     * policy is embedded in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param groupName The name (friendly name, not ARN) identifying the group that the
     *         policy is embedded in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteGroupPolicyRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The name identifying the policy document to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name identifying the policy document to delete.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name identifying the policy document to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The name identifying the policy document to delete.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name identifying the policy document to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The name identifying the policy document to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteGroupPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
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
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteGroupPolicyRequest == false) return false;
        DeleteGroupPolicyRequest other = (DeleteGroupPolicyRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteGroupPolicyRequest clone() {
        
            return (DeleteGroupPolicyRequest) super.clone();
    }

}
    