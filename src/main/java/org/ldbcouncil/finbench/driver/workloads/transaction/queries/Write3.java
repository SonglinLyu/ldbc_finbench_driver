/*
 * Copyright © 2022 Linked Data Benchmark Council (info@ldbcouncil.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ldbcouncil.finbench.driver.workloads.transaction.queries;
/*
 * Transaction workload write query 3:
 * -- Add a Medium Node --
 * Add a *Medium* node. 
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import org.ldbcouncil.finbench.driver.workloads.transaction.LdbcNoResult;
import org.ldbcouncil.finbench.driver.workloads.transaction.LdbcOperation;

public class Write3 extends LdbcOperation<LdbcNoResult> {
    public static final int TYPE = 1003;
    public static final String MEDIUM_ID = "mediumId";
    public static final String MEDIUM_TYPE = "mediumType";
    public static final String IS_BLOCKED = "isBlocked";
    public static final String LAST_LOGIN = "lastLogin";
    public static final String RISK_LEVEL = "riskLevel";
    private final long mediumId;
    private final String mediumType;
    private final boolean isBlocked;
    private final long lastLogin;
    private final String riskLevel;

    public Write3(@JsonProperty(MEDIUM_ID) long mediumId,
                  @JsonProperty(MEDIUM_TYPE) String mediumType,
                  @JsonProperty(IS_BLOCKED) boolean isBlocked,
                  @JsonProperty(LAST_LOGIN) long lastLogin,
                  @JsonProperty(RISK_LEVEL) String riskLevel) {
        this.mediumId = mediumId;
        this.mediumType = mediumType;
        this.isBlocked = isBlocked;
        this.lastLogin = lastLogin;
        this.riskLevel = riskLevel;
    }

    public Write3(Write3 operation) {
        this.mediumId = operation.mediumId;
        this.mediumType = operation.mediumType;
        this.isBlocked = operation.isBlocked;
        this.lastLogin = operation.lastLogin;
        this.riskLevel = operation.riskLevel;
    }

    @Override
    public Write3 newInstance() {
        return new Write3(this);
    }

    public long getMediumId() {
        return mediumId;
    }

    public String getMediumType() {
        return mediumType;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    @Override
    public int type() {
        return TYPE;
    }

    @Override
    public Map<String, Object> parameterMap() {
        return ImmutableMap.<String, Object>builder()
            .put(MEDIUM_ID, mediumId)
            .put(MEDIUM_TYPE, mediumType)
            .put(IS_BLOCKED, isBlocked)
            .build();
    }

    @Override
    public LdbcNoResult deserializeResult(String serializedResults) {
        return LdbcNoResult.INSTANCE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Write3 that = (Write3) o;
        return mediumId == that.mediumId
            && Objects.equals(mediumType, that.mediumType)
            && isBlocked == that.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediumId, mediumType, isBlocked);
    }

    @Override
    public String toString() {
        return "Write3{"
            + "mediumId="
            + mediumId
            + ", mediumType="
            + mediumType
            + ", isBlocked="
            + isBlocked
            + '}';
    }
}

