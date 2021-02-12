/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jenkinsci.plugins.testrail.JunitResults;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Drew on 3/24/2014.
 */
public class Testcase {
    private String name;
    private Failure failure;
    private Skipped skipped;
    private JunitError junitError;
    private String time;
    private String refs;

    @XmlAttribute
    public void setName(String name) { this.name = name.replaceAll("\\d+(?=:)|(?<=\\/)[0-9]+(?=\\/)?", "•").trim(); }
    @XmlElement(name = "failure")
    public void setFailure(Failure failure) { this.failure = failure; }
    @XmlElement(name = "skipped")
    public void setSkipped(Skipped skipped) { this.skipped = skipped; }
    @XmlElement(name = "error")
    public void setJunitError(JunitError junitError) { this.junitError = junitError; }
    @XmlAttribute(name = "time")
    public void setTime(String time) { this.time = time; }
    @XmlAttribute(name = "refs")
    public void setRefs(String refs) { this.refs = refs; }

    public String getName() { return this.name.replaceAll("\\d+(?=:)|(?<=\\/)[0-9]+(?=\\/)?", "•"); }
    public Failure getFailure() { return this.failure; }
    public Skipped getSkipped() { return this.skipped; }
    public JunitError getJunitError() { return this.junitError; }

    public String getTime() {
        return this.time.replace(",", "");
    }

    public String getRefs() {
        return this.refs;
    }


//    public static void main(String[] args) {
//        Testcase tc = new Testcase();
//        tc.setTime("1,075.732");
//        //tc.getElapsedTimeString
//        Result jr = new Result(123, CaseStatus.FAILED, "", tc.getTime());
//        System.out.println(jr.getElapsedTimeString());
//    }


//    public String cleanTimeFormat(String time) {
//        String timeToClean = time;
//        if (timeToClean !=null) {
//            timeToClean.replace(",", "");
//            try {
//                return Float.parseFloat(timeToClean);
//            } catch (NumberFormatException e) {
//                try {
//                    return new DecimalFormat().parse(timeToClean).floatValue();
//                } catch (ParseException x) {
//                    return 0.0f;
//                }
//            }
//        }
//        return this.time;
//    }

//    public static void main(String[] args) {
//        Float testTime = "1,053.814";
//    }
}
