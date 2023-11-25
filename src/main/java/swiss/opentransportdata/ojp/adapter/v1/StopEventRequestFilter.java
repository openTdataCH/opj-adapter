/*
 * Copyright 2023 Peter Hirzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package swiss.opentransportdata.ojp.adapter.v1;

import de.vdv.ojp.PtModeFilterStructure;
import java.time.ZonedDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * A filter to apply for a StopEventRequest.
 * <p>
 * Transmodel:
 * <ul>
 *     <li>"STOP EVENT REQUEST CONTENT FILTER" Filter parameters used to limit the results of the "STOP EVENT REQUESTs".</li>
 *     <li>"STOP EVENT REQUEST POLICY" Optimisation criteria to be used to when computing and decorating "STOP EVENT REQUEST" results.</li>
 * </ul>
 */
@Data
@Builder
public class StopEventRequestFilter implements PTModeRequestFilter {

    private static int LIMIT_DEFAULT = 20;

    @Builder.Default
    @NonNull
    Integer limit = LIMIT_DEFAULT;

    PtModeFilterStructure ptModeFilterStructure;

    /**
     * false: depart at dateTime (default); true: arrive at dateTime
     */
    @Builder.Default
    boolean searchForArrival = false;

    /**
     * Passive OJP: simple Stop UIC like "8507000".
     * <p>
     * Active OJP: "OJP:STOP:SBB:8503424|Schaffhausen"
     */
    @NonNull
    String stopPlaceReference;

    /**
     * Relates to departureArrivalDateTime value.
     * <p>
     * Default: NOW (at builder time)
     */
    @Builder.Default
    ZonedDateTime departureArrivalDateTime = ZonedDateTime.now();
}
