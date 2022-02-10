package com.irinabreza.hillel.homework18;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "0",
        "totvs",
        "sold",
        "sin stock",
        "string",
        "RRR_QW",
        "test",
        "pending",
        "available",
        "status01",
        "connector",
        "TSTING available",
        "slod",
        "status"
})
public class PetInventory {

    @JsonProperty("0")
    private Integer _0;
    @JsonProperty("totvs")
    private Integer totvs;
    @JsonProperty("sold")
    private Integer sold;
    @JsonProperty("sin stock")
    private Integer sinStock;
    @JsonProperty("string")
    private Integer string;
    @JsonProperty("RRR_QW")
    private Integer rrrQw;
    @JsonProperty("test")
    private Integer test;
    @JsonProperty("pending")
    private Integer pending;
    @JsonProperty("available")
    private Integer available;
    @JsonProperty("status01")
    private Integer status01;
    @JsonProperty("connector")
    private Integer connector;
    @JsonProperty("TSTING available")
    private Integer tSTINGAvailable;
    @JsonProperty("slod")
    private Integer slod;
    @JsonProperty("status")
    private Integer status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0")
    public Integer get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(Integer _0) {
        this._0 = _0;
    }

    @JsonProperty("totvs")
    public Integer getTotvs() {
        return totvs;
    }

    @JsonProperty("totvs")
    public void setTotvs(Integer totvs) {
        this.totvs = totvs;
    }

    @JsonProperty("sold")
    public Integer getSold() {
        return sold;
    }

    @JsonProperty("sold")
    public void setSold(Integer sold) {
        this.sold = sold;
    }

    @JsonProperty("sin stock")
    public Integer getSinStock() {
        return sinStock;
    }

    @JsonProperty("sin stock")
    public void setSinStock(Integer sinStock) {
        this.sinStock = sinStock;
    }

    @JsonProperty("string")
    public Integer getString() {
        return string;
    }

    @JsonProperty("string")
    public void setString(Integer string) {
        this.string = string;
    }

    @JsonProperty("RRR_QW")
    public Integer getRrrQw() {
        return rrrQw;
    }

    @JsonProperty("RRR_QW")
    public void setRrrQw(Integer rrrQw) {
        this.rrrQw = rrrQw;
    }

    @JsonProperty("test")
    public Integer getTest() {
        return test;
    }

    @JsonProperty("test")
    public void setTest(Integer test) {
        this.test = test;
    }

    @JsonProperty("pending")
    public Integer getPending() {
        return pending;
    }

    @JsonProperty("pending")
    public void setPending(Integer pending) {
        this.pending = pending;
    }

    @JsonProperty("available")
    public Integer getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Integer available) {
        this.available = available;
    }

    @JsonProperty("status01")
    public Integer getStatus01() {
        return status01;
    }

    @JsonProperty("status01")
    public void setStatus01(Integer status01) {
        this.status01 = status01;
    }

    @JsonProperty("connector")
    public Integer getConnector() {
        return connector;
    }

    @JsonProperty("connector")
    public void setConnector(Integer connector) {
        this.connector = connector;
    }

    @JsonProperty("TSTING available")
    public Integer getTSTINGAvailable() {
        return tSTINGAvailable;
    }

    @JsonProperty("TSTING available")
    public void setTSTINGAvailable(Integer tSTINGAvailable) {
        this.tSTINGAvailable = tSTINGAvailable;
    }

    @JsonProperty("slod")
    public Integer getSlod() {
        return slod;
    }

    @JsonProperty("slod")
    public void setSlod(Integer slod) {
        this.slod = slod;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}