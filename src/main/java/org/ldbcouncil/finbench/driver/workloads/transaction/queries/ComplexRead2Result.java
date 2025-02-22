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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ComplexRead2Result {
    public static final String OTHER_ID = "otherId";
    public static final String SUM_LOAN_AMOUNT = "sumLoanAmount";
    public static final String SUM_LOAN_BALANCE = "sumLoanBalance";
    private final long otherId;
    private final double sumLoanAmount;
    private final double sumLoanBalance;

    public ComplexRead2Result(@JsonProperty(OTHER_ID) long otherId,
                              @JsonProperty(SUM_LOAN_AMOUNT) double sumLoanAmount,
                              @JsonProperty(SUM_LOAN_BALANCE) double sumLoanBalance) {
        this.otherId = otherId;
        this.sumLoanAmount = sumLoanAmount;
        this.sumLoanBalance = sumLoanBalance;
    }

    public long getOtherId() {
        return otherId;
    }

    public double getSumLoanAmount() {
        return sumLoanAmount;
    }

    public double getSumLoanBalance() {
        return sumLoanBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexRead2Result that = (ComplexRead2Result) o;
        return otherId == that.otherId
            && sumLoanAmount == that.sumLoanAmount
            && sumLoanBalance == that.sumLoanBalance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(otherId, sumLoanAmount, sumLoanBalance);
    }

    @Override
    public String toString() {
        return "ComplexRead2Result{"
            + "otherId="
            + otherId
            + ", sumLoanAmount="
            + sumLoanAmount
            + ", sumLoanBalance="
            + sumLoanBalance
            + '}';
    }
}

