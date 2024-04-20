package com.conversor.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class TasaDeCambio {
    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @SerializedName("conversion_rates")
    @Expose
    Rates rates;
    public class Rates{
        @SerializedName("ARS")
        @Expose
        private float ars;

        public float getArs() {
            return ars;
        }

        public void setArs(float ars) {
            this.ars = ars;
        }

        public float getBrl() {
            return brl;
        }

        public void setBrl(float brl) {
            this.brl = brl;
        }

        public float getCop() {
            return cop;
        }

        public void setCop(float cop) {
            this.cop = cop;
        }

        @SerializedName("BRL")
        @Expose
        private float brl;

        @SerializedName("COP")
        @Expose
        private float cop;
    }


}
