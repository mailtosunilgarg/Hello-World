
package org.sample.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for dataTypeWithExample
 * <p>
 * dataTypeWithExample
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataTypeWithExample"
})
public class DataTypeWithExample {

    @JsonProperty("dataTypeWithExample")
    private String dataTypeWithExample;

    @JsonProperty("dataTypeWithExample")
    public String getDataTypeWithExample() {
        return dataTypeWithExample;
    }

    @JsonProperty("dataTypeWithExample")
    public void setDataTypeWithExample(String dataTypeWithExample) {
        this.dataTypeWithExample = dataTypeWithExample;
    }

}
